package day19_10_10;

public class Arryaexamples {

	
	public static void main(String[] args) {
		
		
		int[] number = {10,20,30,40,50};
		
		int sum = 0;
		int i;
		for(i=0; i<number.length; i++) {
			
			 sum = sum+number[i];
		
		}
		
		System.out.println("Sum of numbers = "+sum);
		
		System.out.println("Average of numbers = "+(sum%number.length)); // %=reminder, 
		
		System.out.println("Average of numbers = "+(sum/number.length)); // / quotient 
	}
}
