package com.CoreJava.concurrent.Phaser;

import java.util.concurrent.Phaser;

public class MyThread {
	
	Phaser phaser;
	
	String name;

	public MyThread(Phaser phaser, String name) {
		super();
		this.phaser = phaser;
		this.name = name;
		this.phaser.register();
		new Thread(r).start();
	}
	
	Runnable r = () -> {
		System.out.println("Thread "+name+" Beginning phase one");
		phaser.arriveAndAwaitAdvance();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Thread "+name+" Beginning phase two");
		phaser.arriveAndAwaitAdvance();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Thread "+name+" Beginning phase three");
		phaser.arriveAndDeregister();
		
	}; 
	
	

}
