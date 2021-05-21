package raphael.test.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListString {
	
	public static void main(String[] args) {
		
		// ArrayList implements List Interfaces, and both are in java.util package
		List<String> list = new ArrayList<String>();
		list.add("São Paulo");
		list.add("Rio De Janeiro");
		list.add(1, "Minas Gerais");
		System.out.println(list);
		
		System.out.println(list.contains("São Paulo")); //true
		System.out.println(list.get(2));
		System.out.println(list.size());
		list.clear(); // remove everything
		
		list.add(1 ,"Batman"); // IndexOutOfBoundsException
		list.add(0, "Lila");
		System.out.println(list);
		
	}

}
