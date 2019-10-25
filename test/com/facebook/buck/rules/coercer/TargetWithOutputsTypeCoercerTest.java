/*
 * Copyright 2019-present Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.facebook.buck.rules.coercer;

import static com.facebook.buck.core.cell.TestCellBuilder.createCellRoots;
import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertEquals;

import com.facebook.buck.core.model.BuildTargetFactory;
import com.facebook.buck.core.model.ImmutableBuildTargetWithOutputs;
import com.facebook.buck.core.model.ImmutableUnconfiguredBuildTargetWithOutputs;
import com.facebook.buck.core.model.UnconfiguredBuildTargetFactoryForTests;
import com.facebook.buck.core.model.UnconfiguredTargetConfiguration;
import com.facebook.buck.core.parser.buildtargetparser.ParsingUnconfiguredBuildTargetViewFactory;
import com.facebook.buck.io.filesystem.ProjectFilesystem;
import com.facebook.buck.io.filesystem.impl.FakeProjectFilesystem;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.function.BiFunction;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TargetWithOutputsTypeCoercerTest {
  @Rule public ExpectedException thrown = ExpectedException.none();

  private static final Path BASE_PATH = Paths.get("java/com/facebook/buck/example");
  private static final ProjectFilesystem FILESYSTEM = new FakeProjectFilesystem();
  private static final BiFunction<
          String, Optional<String>, ImmutableUnconfiguredBuildTargetWithOutputs>
      EXPECTED_UNCONFIGURED_BUILD_TARGET_WITH_OUTPUTS_BI_FUNCTION =
          (bt, ol) ->
              ImmutableUnconfiguredBuildTargetWithOutputs.of(
                  UnconfiguredBuildTargetFactoryForTests.newInstance(FILESYSTEM, bt), ol);
  private static final BiFunction<String, Optional<String>, ImmutableBuildTargetWithOutputs>
      EXPECTED_BUILD_TARGET_WITH_OUTPUTS_BI_FUNCTION =
          (bt, ol) -> ImmutableBuildTargetWithOutputs.of(BuildTargetFactory.newInstance(bt), ol);

  @Parameterized.Parameters(name = "{0}")
  public static Collection<Object> data() {
    return Arrays.asList(
        new Object[][] {
          {
            new UnconfiguredBuildTargetWithOutputsTypeCoercer(
                new UnconfiguredBuildTargetTypeCoercer(
                    new ParsingUnconfiguredBuildTargetViewFactory())),
            EXPECTED_UNCONFIGURED_BUILD_TARGET_WITH_OUTPUTS_BI_FUNCTION
          },
          {
            new BuildTargetWithOutputsTypeCoercer(
                new BuildTargetTypeCoercer(
                    new UnconfiguredBuildTargetTypeCoercer(
                        new ParsingUnconfiguredBuildTargetViewFactory()))),
            EXPECTED_BUILD_TARGET_WITH_OUTPUTS_BI_FUNCTION
          }
        });
  }

  @Parameterized.Parameter() public TypeCoercer testCoercer;

  @Parameterized.Parameter(value = 1)
  public BiFunction expected;

  @Test
  public void canCoerceBuildTargetWithoutAlias() throws CoerceFailedException {
    Object seen =
        testCoercer.coerce(
            createCellRoots(FILESYSTEM),
            FILESYSTEM,
            BASE_PATH,
            UnconfiguredTargetConfiguration.INSTANCE,
            "//foo:bar");

    assertEquals(expected.apply("//foo:bar", Optional.empty()), seen);
  }

  @Test
  public void canCoerceBuildTargetCoercerWithAlias() throws CoerceFailedException {
    Object seen =
        testCoercer.coerce(
            createCellRoots(FILESYSTEM),
            FILESYSTEM,
            BASE_PATH,
            UnconfiguredTargetConfiguration.INSTANCE,
            "//foo:bar[whee]");

    assertEquals(expected.apply("//foo:bar", Optional.of("whee")), seen);
  }

  @Test
  public void invalidAliasSyntaxThrowException() throws CoerceFailedException {
    thrown.expect(CoerceFailedException.class);
    thrown.expectMessage(containsString("Could not parse output label for //foo:bar[whee"));

    testCoercer.coerce(
        createCellRoots(FILESYSTEM),
        FILESYSTEM,
        BASE_PATH,
        UnconfiguredTargetConfiguration.INSTANCE,
        "//foo:bar[whee");
  }

  @Test
  public void canCoerceFlavoredTarget() throws CoerceFailedException {
    Object seen =
        testCoercer.coerce(
            createCellRoots(FILESYSTEM),
            FILESYSTEM,
            BASE_PATH,
            UnconfiguredTargetConfiguration.INSTANCE,
            "//foo:bar#src[whee]");

    assertEquals(expected.apply("//foo:bar#src", Optional.of("whee")), seen);
  }

  @Test
  public void canCoerceMultipleFlavors() throws CoerceFailedException {
    Object seen =
        testCoercer.coerce(
            createCellRoots(FILESYSTEM),
            FILESYSTEM,
            BASE_PATH,
            UnconfiguredTargetConfiguration.INSTANCE,
            "//foo:bar#flavor1,flavor2[whee]");

    assertEquals(expected.apply("//foo:bar#flavor1,flavor2", Optional.of("whee")), seen);
  }

  @Test
  public void targetFlavorCannotComeBeforeAlias() throws CoerceFailedException {
    thrown.expect(CoerceFailedException.class);
    thrown.expectMessage(containsString("Output label must come last in //foo:bar[whee]#src"));

    testCoercer.coerce(
        createCellRoots(FILESYSTEM),
        FILESYSTEM,
        BASE_PATH,
        UnconfiguredTargetConfiguration.INSTANCE,
        "//foo:bar[whee]#src");
  }

  @Test
  public void canCoerceFlavorsWithoutAlias() throws CoerceFailedException {
    Object seen =
        testCoercer.coerce(
            createCellRoots(FILESYSTEM),
            FILESYSTEM,
            BASE_PATH,
            UnconfiguredTargetConfiguration.INSTANCE,
            "//foo:bar#flavor1,flavor2");

    assertEquals(expected.apply("//foo:bar#flavor1,flavor2", Optional.empty()), seen);
  }

  @Test
  public void canCoerceShortTarget() throws CoerceFailedException {
    Object seen =
        testCoercer.coerce(
            createCellRoots(FILESYSTEM),
            FILESYSTEM,
            BASE_PATH,
            UnconfiguredTargetConfiguration.INSTANCE,
            ":hangry");

    assertEquals(expected.apply("//java/com/facebook/buck/example:hangry", Optional.empty()), seen);
  }

  @Test
  public void canCoerceShortTargetWithAlias() throws CoerceFailedException {
    Object seen =
        testCoercer.coerce(
            createCellRoots(FILESYSTEM),
            FILESYSTEM,
            BASE_PATH,
            UnconfiguredTargetConfiguration.INSTANCE,
            ":bar[whee]");

    assertEquals(expected.apply("//java/com/facebook/buck/example:bar", Optional.of("whee")), seen);
  }

  @Test
  public void canCoerceShortTargetWithFlavorAndAlias() throws CoerceFailedException {
    Object seen =
        testCoercer.coerce(
            createCellRoots(FILESYSTEM),
            FILESYSTEM,
            BASE_PATH,
            UnconfiguredTargetConfiguration.INSTANCE,
            ":bar#yum[whee]");

    assertEquals(
        expected.apply("//java/com/facebook/buck/example:bar#yum", Optional.of("whee")), seen);
  }
}