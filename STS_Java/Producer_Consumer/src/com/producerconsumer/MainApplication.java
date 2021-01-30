package com.producerconsumer;

import java.util.ArrayList;

public class MainApplication {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ArrayList<Integer> queue = new ArrayList<Integer>();
		Producer producer = new Producer(queue);
		Consumer consumer = new Consumer(queue);
		
		Thread producerThread = new Thread(producer);
		Thread consumerThread = new Thread (consumer);
		
		producerThread.start();
		System.out.println("Started Producer Thread");
		consumerThread.start();
		System.out.println("Started Consumer Thread");
		
		
		producerThread.join();
		consumerThread.join();
	}

}
