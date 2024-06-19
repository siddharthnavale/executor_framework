package com.CoreJava.concurrent.semaphore;

import java.util.concurrent.Semaphore;

public class DecrementCount {

	String name;

	Semaphore sem;

	public DecrementCount(String name, Semaphore sem) {
		super();
		this.name = name;
		this.sem = sem;
		new Thread(r1).start();
	}

	Runnable r1 = () -> {

		try {
			System.out.println(name + " is waiting for permit.");
			sem.acquire();
			System.out.println(name + " get a permit.");
			for (int i = 0; i < 5; i++) {
				Shared.count--;
				System.out.println(name + " : " + Shared.count);
				Thread.sleep(10);
			}
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		System.out.println(name + " " + "release the permit");
		sem.release();
	};

}
