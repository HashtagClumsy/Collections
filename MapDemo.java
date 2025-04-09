package collections;
import java.util.*;
public class MapDemo {

	public static void main(String[] args) {
		// HashMap - Unordered based on keys
		HashMap hm = new HashMap();
		hm.put("Novels",5000);
		hm.put("Crime",800);
		hm.put("thriller",700);
		hm.put("fantasy",1000);
		hm.put("horror",1500);
		hm.put("romance",1000);
		System.out.println(hm);
		//LinkedHashMap - ordered based on keys
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put("Novels",5000);
		lhm.put("Crime",800);
		lhm.put("Thriller",700);
		lhm.put("Fantasy",1000);
		lhm.put("Horror",1500);
		lhm.put("Romance",1000);
		System.out.println(lhm);
		//TreeMap - Sorted based on Keys
		TreeMap tm = new TreeMap();
		tm.put("Novels",5000);
		tm.put("Crime",800);
		tm.put("thriller",700);
		tm.put("fantasy",1000);
		tm.put("horror",1500);
		tm.put("romance",1000);
		System.out.println(tm);
		
	}

}
