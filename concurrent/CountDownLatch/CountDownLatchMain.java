package com.CoreJava.concurrent.CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchMain {

	public static void main(String[] args) {
		CountDownLatch latch = new CountDownLatch(3);

		for (int i = 1; i <= 3; i++) {
			new Thread(() -> {
				System.out.println("Task completed by thread " + Thread.currentThread().getId());
				latch.countDown();
			}).start();
		}

		try {
			latch.await();
			System.out.println("All task completed. Proceeding to the next step!");
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

}
