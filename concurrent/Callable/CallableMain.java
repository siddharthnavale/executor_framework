package com.CoreJava.concurrent.Callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableMain {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService ex = Executors.newFixedThreadPool(3);
		System.out.println("Starting.......");
		
		Future<Integer> sum = ex.submit(new Task1(10));
		
		Future<Double> sqrt = ex.submit(new Task2(16));
		
		Future<Integer> fact = ex.submit(new Task3(5));
		
		System.out.println(sum.get());
		System.out.println(sqrt.get());
		System.out.println(fact.get());
		
		ex.shutdown();
		System.out.println("Completed.....");
	}

}
