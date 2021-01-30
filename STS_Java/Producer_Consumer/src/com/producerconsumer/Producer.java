package com.producerconsumer;

import java.util.ArrayList;

public class Producer implements Runnable {

	private ArrayList<Integer> producerQueue;
	private static int producerCount ;
	public Producer(ArrayList<Integer> queue) {
		this.producerQueue = queue;
		System.out.println("Producer Queue : "+ this.producerQueue);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("This is Producer Thread :" + Thread.currentThread().getName());
		while(true) {
			this.producerQueue.add(Producer.producerCount++);
			System.out.println("Added Single Element in Queue");
			while(!this.producerQueue.isEmpty()) {
				System.out.println("Producer Queue is not Empty");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				continue;
			}
		}
		
	}

}
