package com.CoreJava.concurrent.Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//newFixedThreadPool Approach
public class ExecutorApproach {
	
	public static void main(String[] args) {
		
		ExecutorService ex= Executors.newFixedThreadPool(3);
		for(int i=1 ;i<=10;i++){
			ex.execute(new Task(i));
		}
		ex.shutdown();
	}

}
