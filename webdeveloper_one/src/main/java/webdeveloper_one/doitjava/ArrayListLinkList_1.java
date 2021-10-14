package webdeveloper_one.doitjava;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class ArrayListLinkList_1 {

	public static void main(String[] args) {

		ArrayList arraylist = new ArrayList();
		LinkedList linklist = new LinkedList();

		System.out.println("LinkedList==============================");
		
		long start =  System.currentTimeMillis() * 1000;
		for (int i = 0; i < 100000; i++) {
			linklist.add(i);
		}
		long end =  System.currentTimeMillis() * 1000;
		System.out.println("넣는 시간: " + (end - start));

		System.out.println("ArrayList==============================");
		long start2 =  System.currentTimeMillis() * 1000;
		for (int i = 0; i < 100000; i++) {
			arraylist.add(i);
		}
		long end2 =  System.currentTimeMillis() * 1000;
		System.out.println("넣는 시간: " + (end2 - start2));

		System.out.println("LinkedHashMap==============================");
		LinkedHashMap linkmap = new LinkedHashMap();

		long start3 =  System.currentTimeMillis() * 1000;
		for (int i = 0; i < 100000; i++) {
			linkmap.put(i, i);
		}
		long end3 =  System.currentTimeMillis() * 1000;
		System.out.println("넣는 시간: " + (end3 - start3));

		System.out.println("LinkedList==============================");

		long start4 =  System.currentTimeMillis() * 1000;
		for (int i = 0; i < linklist.size(); i++) {
			linklist.get(i);
		}
		long end4 =  System.currentTimeMillis() * 1000;
		System.out.println("꺼내는 시간: " + (end4 - start4));

		System.out.println("ArrayList==============================");
		long start5 =  System.currentTimeMillis() * 1000;
		for (int i = 0; i < arraylist.size(); i++) {
			arraylist.get(i);
		}
		long end5 =  System.currentTimeMillis() * 1000;
		System.out.println("꺼내는 시간: " + (end5 - start5));

		System.out.println("LinkedHashMap==============================");

		long start6 =  System.currentTimeMillis() * 1000;
		for (int i = 0; i < linkmap.size(); i++) {
			linkmap.get(i);
		}
		long end6 =  System.currentTimeMillis() * 1000;
		System.out.println("꺼내는 시간: " + (end6 - start6));
	}

}
