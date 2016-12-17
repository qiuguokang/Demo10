package com.qiu.demo2;

public class Test {
	
	public static void main(String[] args) {
		
		Computer c = new Computer("Lenovo");
		Mobile m = new Mobile("NOKIA");
		
//		c.cal();
//		m.call();
		
		/**
		 * Mobile里的数据，computer如何得到它；
		 */
		//笨方法
//		m.setSd("照片");
//		String photo = m.getSd();
//		c.setHd(photo);
//		System.out.println("computer:"+c.getHd());
		
		//使用接口方法
		m.setSd("照片");
		String date = m.out();
     	c.in(date);
	}

}
