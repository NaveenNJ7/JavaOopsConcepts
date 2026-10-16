package MutableImmutable;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		
		int a[] = {40,60,20,30,10,50};
		System.out.println("Before sort order elements of array :"+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("After sort order elements of array :"+Arrays.toString(a));
	   // It means, we can change the order of existing values, this is mutable
		
		
		String s = "Must Do";
		s.concat(" Hard Work");
		System.out.println(s); 
		/*after concating value of string didnt change - is immutable
		 if we want concate result then print s.concat("");
		 */
		System.out.println(s.concat(" Hard Work"));
		
		
		
	}
}
