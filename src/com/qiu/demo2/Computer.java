package com.qiu.demo2;

public class Computer implements USB{
	
	private String brand = "";
	private String hd = "";
	
	//����
	public Computer(String brand) {
		super();
		this.brand = brand;
	}
	
	public void cal(){
		System.out.println(brand+",���Լ���");
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
		System.out.println(brand +",������,"+date);
		hd += date;
		System.out.println(brand +",�����ݣ�"+hd);
		
	}

	@Override
	public String out() {
		System.out.println(brand +",�����ݣ�"+hd);
		return hd;
	}
	
	

}
