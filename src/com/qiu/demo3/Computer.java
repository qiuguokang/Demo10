package com.qiu.demo3;
/**
 * ����ʵ�ֶ�ӿ�
 */
public class Computer implements USB,HDMI{
	
	private String brand = "";
	private String data = "aaa";
	
	public Computer(String brand) {
		super();
		this.brand = brand;
	}

	@Override
	public String out() {
		
		return data;
	}

	@Override
	public void in(String data) {
		
	}

	@Override
	public String out1() {
		
		return data;
	}
}
