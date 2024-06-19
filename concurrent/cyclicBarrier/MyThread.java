package com.CoreJava.concurrent.cyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class MyThread {
	
	CyclicBarrier cyclicBarrier;
	
	String name;

	public MyThread(CyclicBarrier cyclicBarrier, String name) {
		super();
		this.cyclicBarrier = cyclicBarrier;
		this.name = name;
		new Thread(r).start();
	}

	Runnable r= () -> {
		System.out.println(name);
		try {
			cyclicBarrier.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}		
	};
}
