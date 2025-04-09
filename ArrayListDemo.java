package collections;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		//LinkedList a1 = new LinkedList();
		a1.add(10);
		a1.add(20);
		a1.add("xxx");
		a1.add("yyy");//a1.add(new Integer(20));/autoboxing
		a1.add(10);
		System.out.println(a1);//[10, 20, xxx, yyy, 10]
		a1.add(2, "ppp");
		System.out.println(a1);//[10, 20, ppp, xxx, yyy, 10]
		a1.set(2, "qqq");
		System.out.println(a1);//[10, 20, qqq, xxx, yyy, 10]
		a1.remove("qqq");
		System.out.println(a1);//[10, 20, xxx, yyy, 10]
		a1.remove(2);
		System.out.println(a1);//[10, 20, yyy, 10]
		String s = (String) a1.get(2);
		System.out.println(s);//yyy
		System.out.println("size = "+a1.size());//size = 4


	}

}
