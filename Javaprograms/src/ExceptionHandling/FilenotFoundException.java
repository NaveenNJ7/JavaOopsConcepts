package ExceptionHandling;


import java.io.FileNotFoundException;
import java.io.FileReader;
public class FilenotFoundException {

	
	public static void main(String[] args) {
		
		try
		{
		FileReader f = new FileReader("Navin.txt");
		}
		
		catch(FileNotFoundException e)
		{
			System.out.println("File not found ");
		}
	}
}
