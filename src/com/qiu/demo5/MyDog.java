package com.qiu.demo5;

public class MyDog extends Dog{

	public MyDog(String name) {
		super(name);
	}
	
	public void walk(){
		System.out.println(getName()+",��վ����");	
	}
	
	/**
	 * ��������д
	 */
	public void eat(){
		System.out.println(getName()+",����");
	}
}
