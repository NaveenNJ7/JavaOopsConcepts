package com;

public class Solution {

	
	void m() {
		System.out.println("Types of methods");
	}
	
	void m(int a) {
		System.out.println(a);
	}
	
	void m(double b) {
		System.out.println(b);
	}
	
	void m(int c, String d) {
		System.out.println("Number c:"+c+" String: "+d);
	}
	
	void m(String e, int f) {                         // we can also write (String d, int c)
		System.out.println("String: "+e+" Number f:"+f);
	}
	
	public static void main(String[] args) {
		
		Solution s = new Solution();
		
		s.m();
		s.m(10);
		s.m(10.5);
		s.m(20, "Dubai");
		s.m("Chennai", 35);
	}
}
