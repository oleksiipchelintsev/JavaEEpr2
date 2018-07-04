package com.oleksii.pchelintsev.lib;

import com.oleksii.pchelintsev.exception.MyZeroException;

public class Arithmetic {
	public int divide(int a, int b) {
			try {
				throw new MyZeroException("Division by zero");
			} catch (MyZeroException e) {
				e.printStackTrace();
			}
		return a/b;
	}
}
