package com.algostudy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexDemo {
	int findFirstUniqueChar(String string) {
		
		return -1;
	}
	
	int findFirstUniqueChar2(String string) {
		String string2 = string.replaceAll("(?s)(?=.*?)(.)(?=.*?\\1)", "");
		System.out.println(string+"\n"+string2);
		return string.indexOf(string2);
	}
	
	public static void main(String[] args) {
		Pattern pat = Pattern.compile("(?s)(.)(?=.*\\1)");
		Matcher mat = pat.matcher("abcdabbde");
		System.out.println( mat.matches());
		mat.reset(); // 匹配过一定要重置
		while(mat.find()){  
            System.out.println(mat.group(0));   
        }  
		
		String string = "abcdabbde";
		
		String string3 = string.replaceAll("(?s)(.)(?=.*\\1)", ""); 
		System.out.println(string + "\n" + string3 + "\n"
				+ string.indexOf(string3.charAt(0)));
		
		System.out.println("******"+mat.replaceAll(""));
		System.out.println("******"+ string);
				
		String string4 = string.replaceAll("(?s)(.)(?=.*\\1)", ""); 
		System.out.println(string + "\n" + string4 + "\n"
				+ string.indexOf(string4.charAt(0)));
	}
}
