package com;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Naveen";
		System.out.println(name.concat("junja"));
		System.out.println(name);
		
		
		StringBuffer ab = new StringBuffer("naveen");
		System.out.println(ab.append("junja"));
		System.out.println(ab);
		System.out.println(ab.reverse());
	}

}
