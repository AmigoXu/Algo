package com.javase;

public class ExtendsDemo {

    public static void main(String args[]) {
        B b = new B("") ;    // ʵ�����������
}
}



class A {
	
    public A() { // ���๹��
        System.out.println("*************************") ;
}
}
class B extends A {
public B(String msg) {
        System.out.println("B �вι���");     // ���ñ��๹��
}


}

