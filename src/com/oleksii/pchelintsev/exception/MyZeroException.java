package com.oleksii.pchelintsev.exception;

public class MyZeroException extends Exception{
	
	public MyZeroException() {
        super();
    }
	
	public MyZeroException(String string) {
		super(string);
	}
}
