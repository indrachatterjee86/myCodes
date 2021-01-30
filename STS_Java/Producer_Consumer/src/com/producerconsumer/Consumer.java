package com.producerconsumer;

import java.util.ArrayList;

public class Consumer implements Runnable{

	private ArrayList<Integer> consumerQueue;
	public Consumer(ArrayList<Integer> queue) {
		this.consumerQueue = queue;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("This is Consumer Thread :" + Thread.currentThread().getName());
		// Consumer Loop
		while (true) {
			while(this.consumerQueue.isEmpty()) {
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Consumer Queue is Empty: Continue");
				continue;
			}
			System.out.println("Element found in queue :" +this.consumerQueue.get(0));
			this.consumerQueue.remove(0);
		}
	
	}

}
