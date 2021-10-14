package webdeveloper_one.doitjava;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List_3 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<10;i++) {
			list.add(i+1);
			System.out.println(list.get(i));
		}
		
		java.util.Iterator it = list.iterator();
		
		for(;it.hasNext();) {
			System.out.println(it.next());
		}
		
		System.out.println("===============");
		
		ListIterator it2 = list.listIterator();
		try {
			while(it2.hasNext()) {
				System.out.println(it2.next());
			}
			System.out.println("================");
			//역순으로(it2는 끝까지 간 상태에서)
			while(it2.hasPrevious()) {
				System.out.println(it2.previous());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
