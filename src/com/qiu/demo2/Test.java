package com.qiu.demo2;

public class Test {
	
	public static void main(String[] args) {
		
		Computer c = new Computer("Lenovo");
		Mobile m = new Mobile("NOKIA");
		
//		c.cal();
//		m.call();
		
		/**
		 * Mobile������ݣ�computer��εõ�����
		 */
		//������
//		m.setSd("��Ƭ");
//		String photo = m.getSd();
//		c.setHd(photo);
//		System.out.println("computer:"+c.getHd());
		
		//ʹ�ýӿڷ���
		m.setSd("��Ƭ");
		String date = m.out();
     	c.in(date);
	}

}
