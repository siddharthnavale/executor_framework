package com.CoreJava.concurrent.Executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class NewSheduledThreadPoolApproach {
	
	public static void main(String[] args) {
		
		ScheduledExecutorService ex = Executors.newScheduledThreadPool(3);
		ex.scheduleAtFixedRate(new Task(1),3L,1L,TimeUnit.SECONDS);
	}

}
