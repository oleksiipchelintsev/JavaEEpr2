package com.oleksii.pchelintsev.lib;

import com.oleksii.pchelintsev.exception.MyZeroException;

public class Arithmetic {
	public int divide(int a, int b) throws MyZeroException {
		if(b==0) {
			throw new MyZeroException("Division by zero");
		} else {
			return a/b;
		}
	}
}
