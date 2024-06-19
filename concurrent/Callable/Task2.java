package com.CoreJava.concurrent.Callable;

import java.util.concurrent.Callable;

public class Task2 implements Callable<Double> {
	
	double num;

	public Task2(int num) {
		super();
		this.num = num;
	}

	@Override
	public Double call() throws Exception {
		System.out.println("Task2 is executed by :"+Thread.currentThread().getName());
		return Math.sqrt(num);
	}

}
