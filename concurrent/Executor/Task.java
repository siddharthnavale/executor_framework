package com.CoreJava.concurrent.Executor;

public class Task implements Runnable {
	
	private int taskId;

	public Task(int taskId) {
		super();
		this.taskId = taskId;
	}

	@Override
	public void run() {
		System.out.println("task "+taskId+" is running on thread: "+Thread.currentThread().getName());	
	}

}
