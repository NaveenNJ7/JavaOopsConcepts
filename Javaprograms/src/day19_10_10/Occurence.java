package day19_10_10;

public class Occurence {

	
	
	public static void main(String[] args) {
		
	int count = 0;
	int[] a = {10,20,30,40,10,80,70,10,60,10};
	
	for(int i=0; i<a.length; i++) {
		if(a[i]==10) {
//			System.out.println(a[i]);
//			count ++;
			count = count+1;
			
		}
		
		
	}
	System.out.println(count);
	
	}
}
