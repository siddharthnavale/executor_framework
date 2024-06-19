package com.CoreJava.concurrent.Callable;

import java.util.concurrent.Callable;

public class Task1 implements Callable<Integer> {
	
	int stop;

	public Task1(int stop) {
		super();
		this.stop = stop;
	}

	@Override
	public Integer call() throws Exception {
		int sum=0;
		for(int i= 0; i<=stop; i++) {
			sum=sum+i;
		}
		System.out.println("Task1 is executed by :"+Thread.currentThread().getName());
		return sum;
	}

}
