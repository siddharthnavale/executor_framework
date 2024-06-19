package com.CoreJava.concurrent.semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreMain {
	
	public static void main(String[] args) {
		Semaphore sem =new Semaphore(1);
		new IncrementCount("A",sem);
		new DecrementCount("B",sem);	
	}

}
