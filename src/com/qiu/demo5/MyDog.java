package com.qiu.demo5;

public class MyDog extends Dog{

	public MyDog(String name) {
		super(name);
	}
	
	public void walk(){
		System.out.println(getName()+",会站着走");	
	}
	
	/**
	 * 方法的重写
	 */
	public void eat(){
		System.out.println(getName()+",吃肉");
	}
}
