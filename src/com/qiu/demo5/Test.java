package com.qiu.demo5;

public class Test {
	
	public static void main(String[] args) {
		
//		Anim a = new Anim("动物");
		
//		a.eat();
//		a.sleep();
		
//		Dog d = new Dog("大狗");
		
//		d.eat();
//		d.sleep();
//		d.watch();
		
//		MyDog m = new MyDog("旺财");
		
//		m.eat();
//		m.sleep();
//		m.watch();
//		m.walk();
		
		
		/**
		 * 多态
		 * 父类的引用可以引用子类的对象。
         * 父引用子类。
         * 靠继承和重写来实现。
         * 作用：统管整个类族。
		 */
		
		Anim a1 = new Anim("动物");
		Anim a2 = new Dog("大狗");
		Anim a3 = new MyDog("旺财");
		
		
		//调用的方法，new的谁的对象，就用谁的方法。
		//通过继承和方法的重写来实现多态
		a1.eat();
		a2.eat();
		a3.eat();
	}

}
