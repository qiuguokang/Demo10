package com.qiu.demo1;

public interface MyInterface1 {
	
	//����
	
//	private String name = "";
	/*
	 * �ӿ��У����Բ����Զ���private����
	 */
    public String name = "";
    public static String name1 = "";
    /*
     * �ӿ��У���������ԣ�Ĭ��Ϊ static��
     */
    
    String name2 = "aaa";
    public static final String name3 = "bbb";
    /**
     * �ڽӿ��У�����Ĭ��Ϊ��public static final ��
     *                 ������       ��̬��        ����
     */
    
    //����
    
//    public MyInterface(){
//    	
//    }
    /**
     *  �ӿ��У������Զ��幹�췽��
     */
    
//    public void test1(){
//    	
//    }
    /**
     * �ڽӿ��У����ܶ�����ͨ����
     */
    
//    private void test1();
    /**
     * �ڽӿ��в��ܶ���private����
     */
    
    public void test1();
    
    void test2();
    //Ĭ��Ϊpublic����
    
    /**
     * �ڽӿ��У�����Ĭ��Ϊ  public abstract ��
     *                ������          �����
     */
}
