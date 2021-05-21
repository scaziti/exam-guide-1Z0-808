package raphael.test.arrayList;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
	public static void main(String[] args) {
		
		//List<int> list = new ArrayList<int>(); //Compilation error
		List<Integer> list2 = new ArrayList<Integer>();
		List list = new ArrayList<>();
		
		list2.add(42);
//		list2.add("12");
		list2.add(new Integer(54));
		String s = "JAVArocks";
		s = s.substring(4,8);
		System.out.println(s);
	}

}
