/*
 * Copyright (C) 2015 Google, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.common.inject;

import com.google.errorprone.annotations.CheckReturnValue;
import javax.inject.Provider;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

/**
 * Static utility methods for creating and working with instances of {@link Provider}.
 *
 * @author Kurt Alfred Kluever
 */
@CheckReturnValue
@NullMarked
public final class Providers {

  private Providers() {}

  /**
   * Returns a provider which always provides {@code instance}. This should not be necessary to use
   * in your application, but is helpful for several types of unit tests.
   *
   * @param instance the instance that should always be provided
   */
  public static <T extends @Nullable Object> Provider<T> of(T instance) {
    return new ConstantProvider<T>(instance);
  }

  private static final class ConstantProvider<T extends @Nullable Object> implements Provider<T> {
    private final T instance;

    private ConstantProvider(T instance) {
      this.instance = instance;
    }

    @Override
    public T get() {
      return instance;
    }

    @Override
    public String toString() {
      return "Providers.of(" + instance + ")";
    }

    @Override
    public boolean equals(@Nullable Object other) {
      if (other instanceof ConstantProvider) {
        ConstantProvider<?> that = (ConstantProvider<?>) other;
        return (this.instance == null)
            ? that.instance == null
            : this.instance.equals(that.instance);
      }
      return false;
    }

    @Override
    public int hashCode() {
      return instance == null ? 37 : instance.hashCode();
    }
  }
}
