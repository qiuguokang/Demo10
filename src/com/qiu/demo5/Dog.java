package com.qiu.demo5;

public class Dog extends Anim{
	
	public Dog(String name) {
		super(name);
	}
	
	public void watch(){
		System.out.println(getName()+",����");
	}
	
	/**
	 * ��������д
	 */
	public void eat(){
		System.out.println(getName()+",�Թ�ͷ");
	}
	
	public void eat1(){
		
	}

}
