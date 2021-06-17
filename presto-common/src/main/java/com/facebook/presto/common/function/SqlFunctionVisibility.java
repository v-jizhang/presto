/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.facebook.presto.common.function;

public enum SqlFunctionVisibility
{
    PUBLIC,
    HIDDEN,
    /**
     * Marked to indicate that the function is experimental and may change in the future.  They have the same visibility as HIDDEN by default, but
     * can be toggled via session property or system property.
     *
     * @see SystemSessionProperties#isExperimentalFunctionsEnabled session property
     * @see FeaturesConfig#isExperimentalFunctionsEnabled system property
     */
    EXPERIMENTAL,
}