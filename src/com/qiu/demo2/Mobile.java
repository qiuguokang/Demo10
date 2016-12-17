package com.qiu.demo2;

public class Mobile implements USB{
	
	private String brand = "";
	private String sd = "";
	
	public Mobile(String brand) {
		super();
		this.brand = brand;
	}

	public void call(){
		System.out.println(brand+",����ͨ��");
	}
	
	public String getSd() {
		return sd;
	}

	public void setSd(String sd) {
		this.sd = sd;
	}

	@Override
	public void in(String date) {
		System.out.println(brand +",������,"+date);
		sd += date;
		System.out.println(brand +",�����ݣ�"+sd);
		
	}

	@Override
	public String out() {
		System.out.println(brand +",�����ݣ�"+sd);
		return sd;
	}
	
}
