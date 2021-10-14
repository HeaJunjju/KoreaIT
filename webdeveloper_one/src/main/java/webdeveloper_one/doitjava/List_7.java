package webdeveloper_one.doitjava;

import java.util.ArrayList;
import java.util.Hashtable;

public class List_7 {

	public String name;

	public List_7(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {

		// index: 0부터 시작. 0부터 접근
		ArrayList array = new ArrayList();
		array.add(0, 0);
		array.add(1, 1);
		array.add(2, 2);
//		array.add(3, "3");	//Integer제네릭 걸면 Integer값만 들어올 수 있음 

		int intvalue = (Integer) array.get(0);
		int intvalue2 = (Integer) array.get(1);
		int intvalue3 = (Integer) array.get(2);

		System.out.println(intvalue);
		System.out.println(intvalue2);
		System.out.println(intvalue3);

		// clear(): element 클리어
		array.clear();
		array.add("1");

		String value = (String) array.get(0);
		System.out.println(value);

		array.clear();
		List_7 list = new List_7("김혜준");
		
		array.add(list);
		List_7 list7 = (List_7) array.get(0);
		
		System.out.println(list7.getName());

		Hashtable hash = new Hashtable();
		//Hashtable안에 ArrayList 놓는다
//		List_7 -> ArrayList -> Hashtable
		
		hash.put(1,  array);
		ArrayList arraylist = (ArrayList) hash.get(1);
		List_7 list8 = (List_7) arraylist.get(0);
		
		System.out.println(list8.getName());
		
		
		
	}

}
