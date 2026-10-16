package ExceptionHandling;

import java.io.FileNotFoundException; 
import java.io.FileReader;
public class filereader {

	
	void reader() throws FileNotFoundException
	{
		FileReader r = new FileReader("JAVA.TEXT");
	}
	
	public static void main(String[] args)
	{
		filereader f = new filereader();
		
		try {
		f.reader();
		}
		
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
		}
	}
}
