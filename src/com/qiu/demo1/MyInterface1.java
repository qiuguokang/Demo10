package com.qiu.demo1;

public interface MyInterface1 {
	
	//属性
	
//	private String name = "";
	/*
	 * 接口中，属性不可以定义private属性
	 */
    public String name = "";
    public static String name1 = "";
    /*
     * 接口中，定义的属性，默认为 static的
     */
    
    String name2 = "aaa";
    public static final String name3 = "bbb";
    /**
     * 在接口中，属性默认为，public static final 的
     *                 公共的       静态的        常量
     */
    
    //构造
    
//    public MyInterface(){
//    	
//    }
    /**
     *  接口中，不可以定义构造方法
     */
    
//    public void test1(){
//    	
//    }
    /**
     * 在接口中，不能定义普通方法
     */
    
//    private void test1();
    /**
     * 在接口中不能定义private方法
     */
    
    public void test1();
    
    void test2();
    //默认为public修饰
    
    /**
     * 在接口中，方法默认为  public abstract 的
     *                公共的          抽象的
     */
}
