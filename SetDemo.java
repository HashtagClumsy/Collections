package collections;
import java.util.*;
public class SetDemo {

	public static void main(String[] args) {
		// HashSet - unordered
		HashSet hs = new HashSet();
		hs.add("Novels");
		hs.add("Crime");
		hs.add("thriller");
		hs.add("fantasy");
		hs.add("horror");
		hs.add("romance");
		System.out.println(hs.add("romance"));//false
		System.out.println(hs);
		//LinkedHashset - ordered
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("Novels");
		lhs.add("Crime");
		lhs.add("thriller");
		lhs.add("fantasy");
		lhs.add("horror");
		lhs.add("romance");
		System.out.println(lhs.add("romance"));//false
		System.out.println(lhs);
		// TreeSet - Sorted
		TreeSet ts = new TreeSet();
		ts.add("Novels");
		ts.add("Crime");
		ts.add("thriller");
		ts.add("fantasy");
		ts.add("horror");
		ts.add("romance");
		//ts.add(1);//ClassCastException
		System.out.println(ts.add("romance"));//false
		System.out.println(ts);
		
	}

}
