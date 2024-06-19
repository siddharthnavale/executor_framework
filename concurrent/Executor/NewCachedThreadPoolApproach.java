package com.CoreJava.concurrent.Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewCachedThreadPoolApproach {

	public static void main(String[] args) {
		ExecutorService ex = Executors.newCachedThreadPool();

		for (int i = 1; i <= 10; i++) {
			ex.execute(new Task(i));
		}
		ex.shutdown();
	}
}
