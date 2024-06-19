package com.CoreJava.concurrent.cyclicBarrier;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierMain {

	public static void main(String[] args) {

		CyclicBarrier cb = new CyclicBarrier(3, () -> {
			System.out.println("Barrier Reached");
		});

		System.out.println("Starting...........");
		new MyThread(cb, "A");
		new MyThread(cb, "B");
		new MyThread(cb, "C");
		
	}

}
