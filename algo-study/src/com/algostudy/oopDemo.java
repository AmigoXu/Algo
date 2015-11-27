package com.algostudy;

import java.io.File;
import java.lang.reflect.Field;

public class oopDemo {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Animal a = new Cat();
		a.eat();
		
		if (a instanceof Cat) {
			Cat c = (Cat)a;
			c.catchMouse();
		}
		
		Animal a2 = (Animal) Class.forName("com.algostudy.Cat").newInstance();
		a2.eat();
		//System.out.println(a.name);
		Class cls = Class.forName("com.algostudy.Cat");
		//All the public fields up the entire class hierarchy.
		Field[] fields = cls.getFields();
		for (int i = 0; i < fields.length; i++) {
			System.out.println(fields[i].getName());
		}
		System.out.println("------------------");
		Field[] fields2 = cls.getDeclaredFields();
		for (int i = 0; i < fields2.length; i++) {
			System.out.println(fields2[i].getName());
		}
	}

}
