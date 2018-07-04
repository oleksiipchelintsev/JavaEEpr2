package com.oleksii.pchelintsev;

import java.util.Date;
import java.util.logging.ConsoleHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

import com.oleksii.pchelintsev.exception.MyZeroException;
import com.oleksii.pchelintsev.lib.Arithmetic;

public class Main {

	private static final Logger logger = Logger.getLogger(Main.class.getName());
	
	public static void main(String[] args) {
		Handler consoleHandler = new ConsoleHandler();
		consoleHandler.setFormatter(new Formatter() {

			@Override
			public String format(LogRecord record) {
				return record.getLevel() + ": " + record.getMessage() + " : " + new Date() + "\n";
			}
		
		});
		logger.setUseParentHandlers(false);
		logger.addHandler(consoleHandler);
		
		
		
	Arithmetic arithmetic = new Arithmetic();
	double a = 0;

	a = arithmetic.divide(400, 0);
	logger.info(String.valueOf(a));
	}
}
