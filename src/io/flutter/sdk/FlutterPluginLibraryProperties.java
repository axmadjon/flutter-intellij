/*
 * Copyright 2017 The Chromium Authors. All rights reserved.
 * Use of this source code is governed by a BSD-style license that can be
 * found in the LICENSE file.
 */
package io.flutter.sdk;

import com.intellij.openapi.roots.libraries.LibraryProperties;
import com.intellij.util.xmlb.XmlSerializerUtil;
import com.intellij.util.xmlb.annotations.Attribute;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FlutterPluginLibraryProperties extends LibraryProperties<FlutterPluginLibraryProperties> {
  public FlutterPluginLibraryProperties() {
  }

  @Override
  public boolean equals(Object other) {
    return other instanceof FlutterPluginLibraryProperties;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Nullable
  @Override
  public FlutterPluginLibraryProperties getState() {
    return this;
  }

  // This attribute exists only to silence the "com.intellij.util.xmlb.Binding - no accessors for class" warning.
  @Attribute(value = "placeholder")
  public String placeholder;

  @Override
  public void loadState(@NotNull FlutterPluginLibraryProperties properties) {
    XmlSerializerUtil.copyBean(properties, this);
  }
}
