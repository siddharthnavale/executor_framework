package com.CoreJava.concurrent.Executor;

public class TraditionalApproach {
	
	public static void main(String[] args) {
		
		for(int i=0; i<10 ;i++){
			Thread T1= new Thread(new Task(i));
			T1.start();
		}
	}

}
