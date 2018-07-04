package com.oleksii.pchelintsev.lib;

import com.oleksii.pchelintsev.exception.MyZeroException;

public class Arithmetic {
	public int divide(int a, int b) {
			Integer result = null; 
			try {
				result = a/b;
		   } catch (MyZeroException e) {
		    e.printStackTrace();
		   }
		return result;
	}
}
