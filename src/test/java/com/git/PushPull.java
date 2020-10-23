package com.git;

public class PushPull {

	public static void main(String[] args) {
		String s="₹92,999";
		String s1 = s.replaceAll("₹","");
		String s2 = s1.replaceAll(",","");
		System.out.println(s2);
		int value = Integer.parseInt(s2);
		System.out.println(value);
	}



}
