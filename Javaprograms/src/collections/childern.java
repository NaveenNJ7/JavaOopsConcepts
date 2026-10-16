package collections;

public class childern implements Comparable<childern> {

	int age;
	String name;
	
    childern(int age, String name)
    {
    	this.age = age;
    	this.name = name;
    }
    
    public String toString()
    {
    	return " "+name+"      "+age;
    }
    
    
   /* // based on name
    public int compareTo(childern c)
    {
    	return this.name.compareTo(c.name);
    } */
    
    
    // sorting based on age
    public int compareTo(childern c)
    {
    	return this.age - c.age;
    } 
}
