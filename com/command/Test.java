package com.command;

public class Test {

	public static void main(String[] args) {
		Handler handler = new Handler(){
			private static final long serialVersionUID = 1L;

			@Override
			public void excute(Object... obj) {
				System.out.println(obj[0]);
			}
			
		};
		MyTest.test(handler);
	}
	
}
