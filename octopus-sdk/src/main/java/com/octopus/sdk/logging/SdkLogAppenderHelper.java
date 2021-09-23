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

  private final Appender appender;
  private final Level sdkLogLevel;

  public SdkLogAppenderHelper(final Appender appender, final Level level) {
    this.appender = appender;
    this.sdkLogLevel = level;
  }

  @SuppressWarnings("unused")
  public void registerLogAppender() {
    config.getRootLogger().addAppender(appender, sdkLogLevel, null);
    config.getLoggerConfig("com.octopus").setLevel(sdkLogLevel);
    ctx.updateLoggers();
  }

  @Override
  public void close() {
    config.getRootLogger().removeAppender(appender.getName());
    config.getLoggerConfig("com.octopus").setLevel(Level.INFO);
  }
}
