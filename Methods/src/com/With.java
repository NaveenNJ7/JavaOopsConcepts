package com;

public class With {

	// with arguments and with return
	
	int display(int n)
	{
		return n*n;
	}
	
	public static void main(String[] args) {
		With w = new With();
	    int result = w.display(5);
	    System.out.println(result);
	    System.out.println("or");
	    System.out.println(w.display(6));
	}
}
