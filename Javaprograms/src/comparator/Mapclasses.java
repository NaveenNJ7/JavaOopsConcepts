package comparator;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class Mapclasses {

	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap();
		
		hm.put(25, "Rock");
		hm.put(15, "Stone");
		hm.put(5, "GOld");
		
	Set<Integer> i = hm.keySet();
	System.out.println("HashMap wont maintain Insertion order");
	for(int Key: i)
	{
		System.out.println(Key+" "+hm.get(Key)); 
	}
	
	LinkedHashMap<String, Integer> lhm = new LinkedHashMap();
	
	lhm.put("WWE", 69);
	lhm.put("John", 89);
	lhm.put("Cena", 79);
	
	Set<String> s = lhm.keySet();
	
	System.out.println("-------");
	
	for(String k : s)
	{
		System.out.println(k+" "+lhm.get(k));
	}
	
	TreeMap t = new TreeMap();
	
	t.put(5, "Gopi");
	t.put(5, "Kopi"); // 5 key is duplicated, it wont allow, 1st 5 - Gopi will store, later Kopi will replace Gopi
	t.put(8, "Lopi");
	t.put(6, "Popi");
	
	
	Set<Integer> si = t.keySet();
	
	System.out.println("-------");
	
	for(int p: si)
	{
		System.out.println(p+"  "+t.get(p));
	}
}
}
