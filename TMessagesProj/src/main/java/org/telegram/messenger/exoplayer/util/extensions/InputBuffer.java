/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *

 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.telegram.messenger.exoplayer.util.extensions;

import org.telegram.messenger.exoplayer.SampleHolder;

/**
 * Input buffer to be decoded by a {@link Decoder}.
 */
public class InputBuffer extends Buffer {

  public final SampleHolder sampleHolder;

  public InputBuffer() {
    sampleHolder = new SampleHolder(SampleHolder.BUFFER_REPLACEMENT_MODE_DIRECT);
  }

  @Override
  public void reset() {
    super.reset();
    sampleHolder.clearData();
  }

}
