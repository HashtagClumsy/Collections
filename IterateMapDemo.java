package collections;

import java.util.*;

public class IterateMapDemo {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Novels",5000);
		hm.put("Crime",800);
		hm.put("thriller",700);
		hm.put("fantasy",1000);
		hm.put("horror",1500);
		hm.put("romance",1000);
		System.out.println( hm);
		Set<String> keys = hm.keySet();
		for(String k : keys)
			System.out.println(k+":"+hm.get(k));
	}

}
