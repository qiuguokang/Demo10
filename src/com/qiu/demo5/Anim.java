package com.qiu.demo5;
/**
 * 定义一个父类Anim,
 * 
 * 属性： name
 * 
 * 方法：eat() ,sleep()
 *
 */
public class Anim {
	
	private String name = "";

	public Anim(String name) {
		super();
		this.name = name;
	}
	
	public void eat(){
		System.out.println(name+",吃东西");
	}
	
	public void sleep(){
		System.out.println(name+",睡觉");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
