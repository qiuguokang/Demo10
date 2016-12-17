package com.qiu.demo5;

public class Dog extends Anim{
	
	public Dog(String name) {
		super(name);
	}
	
	public void watch(){
		System.out.println(getName()+",看门");
	}
	
	/**
	 * 方法的重写
	 */
	public void eat(){
		System.out.println(getName()+",吃骨头");
	}
	
	public void eat1(){
		
	}

}
