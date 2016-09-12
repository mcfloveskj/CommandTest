package com.runnable;

public class Main {

	public static int ticket=10;
	
	public static void main(String[] args) {
		new Thread(new Runnable(){
			@Override
			public void run() {
				for (int i = 0; i < 20; i ++){
					try {
						Thread.currentThread();
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if (Main.ticket > 0){
						System.out.println("一号线程售出:ticket " + Main.ticket);
						Main.ticket --;
					}
					if(Main.ticket == 0){
						Thread.currentThread().interrupt();
					}
				}
			}
		}).start();
	}
	
}
