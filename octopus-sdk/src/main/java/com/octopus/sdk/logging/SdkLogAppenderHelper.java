/*
 * Copyright (c) Octopus Deploy and contributors. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 *  these files except in compliance with the License. You may obtain a copy of the
 * License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.octopus.sdk.logging;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Appender;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.config.Configuration;

public class SdkLogAppenderHelper implements AutoCloseable {

  private static final LoggerContext ctx = (LoggerContext) LogManager.getContext(false);
  private static final Configuration config = ctx.getConfiguration();

  private final String appenderName;

  private SdkLogAppenderHelper(String appenderName) {
    this.appenderName = appenderName;
  }

  @SuppressWarnings("unused")
  public static SdkLogAppenderHelper registerLogAppender(
      final Appender appender, final Level level) {
    config.getRootLogger().addAppender(appender, level, null);
    config.getLoggerConfig("com.octopus").setLevel(level);
    ctx.updateLoggers();
    return new SdkLogAppenderHelper(appender.getName());
  }

  @Override
  public void close() {
    config.getRootLogger().removeAppender(appenderName);
    config.getLoggerConfig("com.octopus").setLevel(Level.INFO);
  }
}
