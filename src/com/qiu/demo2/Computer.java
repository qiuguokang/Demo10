package com.qiu.demo2;

public class Computer implements USB{
	
	private String brand = "";
	private String hd = "";
	
	//构造
	public Computer(String brand) {
		super();
		this.brand = brand;
	}
	
	public void cal(){
		System.out.println(brand+",可以计算");
	}
	
	//getter,setter
	public String getHd() {
		return hd;
	}

	public void setHd(String hd) {
		this.hd = hd;
	}

	@Override
	public void in(String date) {
		System.out.println(brand +",进数据,"+date);
		hd += date;
		System.out.println(brand +",总数据："+hd);
		
	}

	@Override
	public String out() {
		System.out.println(brand +",出数据："+hd);
		return hd;
	}
	
	

}
