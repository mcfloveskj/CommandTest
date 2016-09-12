package com.command;

import java.io.Serializable;

public interface Command extends Serializable{

	/**
	 * 用来处理一个方法里包含多种参数的场景
	 * @param obj
	 */
	void excute(Object ... obj);
	
}
