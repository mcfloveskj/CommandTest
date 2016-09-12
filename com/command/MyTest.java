package com.command;

import java.util.ArrayList;
import java.util.List;

public class MyTest {
	
	public static String test(Handler handler) {
		
		List<Object> obj = new ArrayList<Object>();
		obj.add("a");
		obj.add("b");
		obj.add("c");
		
		for (Object o: obj){
			if ("a".equals(o)){
				handler.excute("handler", o);
			} else {
				handler.excute(o);
			}
		}
		
		return null;
	}
	
}
