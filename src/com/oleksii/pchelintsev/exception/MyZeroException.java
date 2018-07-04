package com.oleksii.pchelintsev.exception;

public class MyZeroException extends ArithmeticException{
	
	public MyZeroException() {
        super();
    }
	
	public MyZeroException(String string) {
		super(string);
	}
}
