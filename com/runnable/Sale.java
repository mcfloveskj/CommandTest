package com.runnable;

public class Sale implements Runnable{

	private int ticket=10;
	
	@Override
	public void run() {
		for (int i = 0; i < 20; i ++){
			if (this.ticket > 0){
				System.out.println("售出:ticket " + this.ticket);
				this.ticket --;
			}
		}
	}
	
}
