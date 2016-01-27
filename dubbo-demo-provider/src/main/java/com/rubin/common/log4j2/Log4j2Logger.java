package com.rubin.common.log4j2;

import org.apache.logging.log4j.Level;

import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.support.FailsafeLogger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;
import org.apache.logging.log4j.spi.ExtendedLogger;

/**
 * Created by RubinCarter on 16-1-27.
 */
public class Log4j2Logger implements Logger {

	private static final String FQCN = FailsafeLogger.class.getName();

	private final ExtendedLogger logger;

	public Log4j2Logger(ExtendedLogger logger) {
		this.logger = logger;
	}

	public void trace(String msg) {
		logger.logIfEnabled(FQCN, Level.TRACE, null, msg);
	}

	public void trace(Throwable e) {
		logger.logIfEnabled(FQCN, Level.TRACE, null, e == null ? null : e.getMessage(), e);
	}

	public void trace(String msg, Throwable e) {
		logger.logIfEnabled(FQCN, Level.TRACE, null, msg, e);
	}

	public void debug(String msg) {
		logger.logIfEnabled(FQCN, Level.DEBUG, null, msg);
	}

	public void debug(Throwable e) {
		logger.logIfEnabled(FQCN, Level.DEBUG, null, e == null ? null : e.getMessage(), e);
	}

	public void debug(String msg, Throwable e) {
		logger.logIfEnabled(FQCN, Level.DEBUG, null, msg, e);
	}

	public void info(String msg) {
		logger.logIfEnabled(FQCN, Level.INFO, null, msg);
	}

	public void info(Throwable e) {
		logger.logIfEnabled(FQCN, Level.INFO, null, e == null ? null : e.getMessage(), e);
	}

	public void info(String msg, Throwable e) {
		logger.logIfEnabled(FQCN, Level.INFO, null, msg, e);
	}

	public void warn(String msg) {
		logger.logIfEnabled(FQCN, Level.WARN, null, msg);
	}

	public void warn(Throwable e) {
		logger.logIfEnabled(FQCN, Level.WARN, null, e == null ? null : e.getMessage(), e);
	}

	public void warn(String msg, Throwable e) {
		logger.logIfEnabled(FQCN, Level.WARN, null, msg, e);
	}

	public void error(String msg) {
		logger.logIfEnabled(FQCN, Level.ERROR, null, msg);
	}

	public void error(Throwable e) {
		logger.logIfEnabled(FQCN, Level.ERROR, null, e == null ? null : e.getMessage(), e);
	}

	public void error(String msg, Throwable e) {
		logger.logIfEnabled(FQCN, Level.ERROR, null, msg, e);
	}

	public boolean isTraceEnabled() {
		return logger.isTraceEnabled();
	}

	public boolean isDebugEnabled() {
		return logger.isDebugEnabled();
	}

	public boolean isInfoEnabled() {
		return logger.isInfoEnabled();
	}

	public boolean isWarnEnabled() {
		return logger.isWarnEnabled();
	}
	
	public boolean isErrorEnabled() {
	    return logger.isErrorEnabled();
	}

}