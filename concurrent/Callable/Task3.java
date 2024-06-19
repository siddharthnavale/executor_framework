package com.CoreJava.concurrent.Callable;

import java.util.concurrent.Callable;

public class Task3 implements Callable<Integer> {
	
	int stop;

	public Task3(int stop) {
		super();
		this.stop = stop;
	}

	@Override
	public Integer call() throws Exception {
		int fact=1;
		
		for(int i=2; i <=stop; i++) {
			fact=fact*i;
		}
		System.out.println("Task3 is executed by :"+Thread.currentThread().getName());
		return fact;
	}

}
