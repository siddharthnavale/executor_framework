package com.CoreJava.concurrent.Phaser;

import java.util.concurrent.Phaser;

public class MainPhaser {
	
	public static void main(String[] args) {
		
		Phaser phaser = new Phaser(1);
		int currentPhase;
		
		System.out.println("Starting....");
		
		new MyThread(phaser,"A");
		new MyThread(phaser,"B");
		new MyThread(phaser,"C");
		
		currentPhase=phaser.getPhase();
		phaser.arriveAndAwaitAdvance();
		System.out.println("Phase "+currentPhase+" Completed");
		
		currentPhase=phaser.getPhase();
		phaser.arriveAndAwaitAdvance();
		System.out.println("Phase "+currentPhase+" Completed");
		
		currentPhase=phaser.getPhase();
		phaser.arriveAndAwaitAdvance();
		System.out.println("Phase "+currentPhase+" Completed");
		
		phaser.arriveAndDeregister();
		if(phaser.isTerminated()) {
			System.out.println("The phaser is terminated");
		}
	}

}
