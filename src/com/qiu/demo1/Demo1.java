package com.qiu.demo1;
/**
 * 定义一个普通类来实现接口MyInterface2;
 */
public class Demo1 implements MyInterface2{
	
	//属性
	private String type = "";
	
	//构造
	public Demo1(String type) {
		this.type = type;
	}
	
	//普通方法
	public void run(){
		System.out.println("this is demo,type:"+type);
	}
	
    //父类强制要完成的方法
	@Override
	public void add1() {
		int a = 2;
		int b = 3;
		int c = a + b ;
		System.out.println("我实现了加法，c="+c);
	}
}
