package com.CoreJava.concurrent.Exchanger;

import java.util.concurrent.Exchanger;

public class ExchangerMain {

	public static final Exchanger<String> exchanger = new Exchanger<>();

	private static void exchangeData(String message, String dataToSend) {

		try {
			System.out.println(message + " " + dataToSend);
			String recieveData = exchanger.exchange(dataToSend);
			System.out.println(message + " :Received - " + recieveData);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(() -> {
			exchangeData("Thread 1: Sending Data","Data from thread1");
		});
		
		Thread t2 = new Thread(() -> {
			exchangeData("Thread 2: Sending Data","Data from thread2");
		});
		
		t1.start();
		t2.start();
		
		//t1.join();
		//t2.join();
	}
}
