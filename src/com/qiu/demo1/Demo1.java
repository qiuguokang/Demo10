package com.qiu.demo1;
/**
 * ����һ����ͨ����ʵ�ֽӿ�MyInterface2;
 */
public class Demo1 implements MyInterface2{
	
	//����
	private String type = "";
	
	//����
	public Demo1(String type) {
		this.type = type;
	}
	
	//��ͨ����
	public void run(){
		System.out.println("this is demo,type:"+type);
	}
	
    //����ǿ��Ҫ��ɵķ���
	@Override
	public void add1() {
		int a = 2;
		int b = 3;
		int c = a + b ;
		System.out.println("��ʵ���˼ӷ���c="+c);
	}
}
