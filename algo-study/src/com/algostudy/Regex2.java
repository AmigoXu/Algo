package com.algostudy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.util.Helper;


public class Regex2 {
	
	public Helper helper;
	
	public static void main(String[] args) {
//		String string = "a.a@a.a.a";
//		boolean b = string.matches("[\\w\\.]+@[^@\\.]+\\.[^@]+");
//		System.out.println(b);
		
		Pattern p = Pattern.compile("(.)(?=.*\\1)");
		Matcher m = p.matcher("ababcaaa");
//		String rs = m.replaceAll("");
//		System.out.println(rs);
		while (m.find()) {
			System.out.println(m.start()+"..."+m.end());
		}
	}
}
