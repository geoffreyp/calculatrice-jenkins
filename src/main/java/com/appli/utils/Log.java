package com.appli.utils;

import java.util.Date;

public class Log {

	boolean debug;

	public Log(boolean debug) {
		this.debug = debug;
	}

	public void info(String message) {
		System.out.println("INFO " + new Date() + " : " + message);
	}

	public void debug(String message) {
		if (this.debug)
			System.out.println("DEBUG : " + new Date() + " : " + message);
	}
}
