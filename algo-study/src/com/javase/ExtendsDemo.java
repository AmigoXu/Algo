package com.javase;

public class ExtendsDemo {

    public static void main(String args[]) {
        B b = new B("") ;    // 实例化子类对象
}
}



class A {
	
    public A() { // 父类构造
        System.out.println("*************************") ;
}
}
class B extends A {
public B(String msg) {
        System.out.println("B 有参构造");     // 调用本类构造
}


}

