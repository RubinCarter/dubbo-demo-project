package com.rubin.common.log4j2;

import com.alibaba.dubbo.common.logger.Level;
import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerAdapter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Appender;
import org.apache.logging.log4j.core.appender.FileAppender;

import java.io.File;
import java.util.Map;

/**
 * Created by RubinCarter on 16-1-27.
 */
public class Log4j2LoggerAdapter implements LoggerAdapter {

    private File file;

    public Log4j2LoggerAdapter() {
        try {
            org.apache.logging.log4j.core.Logger logger = (org.apache.logging.log4j.core.Logger) LogManager.getRootLogger();
            if(logger != null) {
                Map<String, Appender> appenders = logger.getAppenders();
                if(appenders != null) {
                    for (Appender appender : appenders.values()) {
                        if(appender instanceof FileAppender) {
                            file = new File(((FileAppender)appender).getFileName());
                            break;
                        }
                    }
                }
            }
        } catch (Throwable t) {

        }
    }

    public Logger getLogger(Class<?> key) {
        return new Log4j2Logger(LogManager.getLogger(key));
    }

    public Logger getLogger(String key) {
        return new Log4j2Logger(LogManager.getLogger(key));
    }

    public void setLevel(Level level) {
        ((org.apache.logging.log4j.core.Logger)LogManager.getRootLogger()).setLevel(toLog4jLevel(level));
    }

    public Level getLevel() {
        return fromLog4jLevel(LogManager.getRootLogger().getLevel());
    }

    public File getFile() {
        return file;
    }

    private static org.apache.logging.log4j.Level toLog4jLevel(Level level) {
        if (level == Level.ALL)
            return org.apache.logging.log4j.Level.ALL;
        if (level == Level.TRACE)
            return org.apache.logging.log4j.Level.TRACE;
        if (level == Level.DEBUG)
            return org.apache.logging.log4j.Level.DEBUG;
        if (level == Level.INFO)
            return org.apache.logging.log4j.Level.INFO;
        if (level == Level.WARN)
            return org.apache.logging.log4j.Level.WARN;
        if (level == Level.ERROR)
            return org.apache.logging.log4j.Level.ERROR;
        // if (level == Level.OFF)
        return org.apache.logging.log4j.Level.OFF;
    }

    private static Level fromLog4jLevel(org.apache.logging.log4j.Level level) {
        if (level == org.apache.logging.log4j.Level.ALL)
            return Level.ALL;
        if (level == org.apache.logging.log4j.Level.TRACE)
            return Level.TRACE;
        if (level == org.apache.logging.log4j.Level.DEBUG)
            return Level.DEBUG;
        if (level == org.apache.logging.log4j.Level.INFO)
            return Level.INFO;
        if (level == org.apache.logging.log4j.Level.WARN)
            return Level.WARN;
        if (level == org.apache.logging.log4j.Level.ERROR)
            return Level.ERROR;
//        if (level == org.apache.logging.log4j.Level.OFF)
        return Level.OFF;
    }

    public void setFile(File file) {

    }
}
