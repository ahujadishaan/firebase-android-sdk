// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.firebase.encoders.protobuf;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

abstract class AbstractThrowingEncoderContext implements ObjectEncoderContext {

  @NonNull
  @Override
  public ObjectEncoderContext add(@NonNull String name, @Nullable Object obj) throws IOException {
    throw new UnsupportedOperationException();
  }

  @NonNull
  @Override
  public ObjectEncoderContext add(@NonNull String name, double value) throws IOException {
    throw new UnsupportedOperationException();
  }

  @NonNull
  @Override
  public ObjectEncoderContext add(@NonNull String name, int value) throws IOException {
    throw new UnsupportedOperationException();
  }

  @NonNull
  @Override
  public ObjectEncoderContext add(@NonNull String name, long value) throws IOException {
    throw new UnsupportedOperationException();
  }

  @NonNull
  @Override
  public ObjectEncoderContext add(@NonNull String name, boolean value) throws IOException {
    throw new UnsupportedOperationException();
  }

  @NonNull
  @Override
  public ObjectEncoderContext nested(@NonNull String name) throws IOException {
    throw new UnsupportedOperationException();
  }
}