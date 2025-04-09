package collections;
import java.util.*;
public class RemoveDuplicates {

	public static void main(String[] args) {
		/*List<Integer> MobileNos = new ArrayList<Integer>();
		MobileNos.add(111);		MobileNos.add(111);
		MobileNos.add(222);
		MobileNos.add(333);
		MobileNos.add(111);
		MobileNos.add(444);
		MobileNos.add(555);
		MobileNos.add(333);
		MobileNos.add(666);*/
		List<Integer> MobileNos1 = List.of(111, 111, 222, 333, 111, 444, 555, 333, 666);
		System.out.println(MobileNos1);
		Set<Integer> uniqueMobileNos = new LinkedHashSet<Integer>();
		uniqueMobileNos.addAll(MobileNos1);
		System.out.println(uniqueMobileNos);

		
	}

}
