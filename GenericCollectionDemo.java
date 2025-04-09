package collections;
import java.util.*;
public class GenericCollectionDemo {

	public static void main(String[] args) {
		LinkedList<String> l1 = new LinkedList<String>();
				//l1.add(12);
				l1.add("xxx");
				l1.add("yyy");
				l1.add("zzz");	
				System.out.println(l1);
				for(String s : l1)
					System.out.println(s);

	}

}
