package com.rubin.common.log4j2;

import org.apache.logging.log4j.Level;

import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.support.FailsafeLogger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

/**
 * Created by RubinCarter on 16-1-27.
 */
public class Log4j2Logger implements Logger {

	private static final Marker FQCN_MARKER = MarkerManager.getMarker(FailsafeLogger.class.getName());

	private final org.apache.logging.log4j.Logger logger;

	public Log4j2Logger(org.apache.logging.log4j.Logger logger) {
		this.logger = logger;
	}

	public void trace(String msg) {
		logger.log(Level.TRACE, FQCN_MARKER, msg);
	}

	public void trace(Throwable e) {
		logger.log(Level.TRACE, FQCN_MARKER, e == null ? null : e.getMessage(), e);
	}

	public void trace(String msg, Throwable e) {
		logger.log(Level.TRACE, FQCN_MARKER, msg, e);
	}

	public void debug(String msg) {
		logger.log(Level.DEBUG, msg);
	}

	public void debug(Throwable e) {
		logger.log(Level.DEBUG, FQCN_MARKER, e == null ? null : e.getMessage(), e);
	}

	public void debug(String msg, Throwable e) {
		logger.log(Level.DEBUG, FQCN_MARKER, msg, e);
	}

	public void info(String msg) {
		logger.log(Level.INFO, FQCN_MARKER, msg);
	}

	public void info(Throwable e) {
		logger.log(Level.INFO, FQCN_MARKER, e == null ? null : e.getMessage(), e);
	}

	public void info(String msg, Throwable e) {
		logger.log(Level.INFO, FQCN_MARKER, msg, e);
	}

	public void warn(String msg) {
		logger.log(Level.WARN, FQCN_MARKER, msg);
	}

	public void warn(Throwable e) {
		logger.log(Level.WARN, FQCN_MARKER, e == null ? null : e.getMessage(), e);
	}

	public void warn(String msg, Throwable e) {
		logger.log(Level.WARN, FQCN_MARKER, msg, e);
	}

	public void error(String msg) {
		logger.log(Level.ERROR, FQCN_MARKER, msg);
	}

	public void error(Throwable e) {
		logger.log(Level.ERROR, FQCN_MARKER, e == null ? null : e.getMessage(), e);
	}

	public void error(String msg, Throwable e) {
		logger.log(Level.ERROR, FQCN_MARKER, msg, e);
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