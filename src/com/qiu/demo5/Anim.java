package com.qiu.demo5;
/**
 * ����һ������Anim,
 * 
 * ���ԣ� name
 * 
 * ������eat() ,sleep()
 *
 */
public class Anim {
	
	private String name = "";

	public Anim(String name) {
		super();
		this.name = name;
	}
	
	public void eat(){
		System.out.println(name+",�Զ���");
	}
	
	public void sleep(){
		System.out.println(name+",˯��");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
