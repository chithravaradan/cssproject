package com.css.corejavatraining.sample;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String star=new String("java program");
		String sub=star.substring(2,5);
		System.out.println(sub);
		
		StringBuffer sb=new StringBuffer("java program");
		sb.append("Hello");
		System.out.println(sb);
	}
}