package webdeveloper_one.doitjava;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class List_5 {
	private String name;
	private String address;

	public List_5(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static void main(String[] args) {
		List link = new ArrayList();

		for (int i = 0; i <= 10; i++) {
			link.add(i);
		}
		
		for (int i = 0; i < link.size(); i++) {
			System.out.println(link.get(i));
		}
		
		link.clear();
		
		link.add(new List_5("홍길동", "조선"));
		link.add(new List_5("아무개", "하와이"));
		link.add(new List_5("이순신", "조선"));
		
		for (int i = 0; i < link.size(); i++) {
			List_5 list = (List_5) link.get(i);
			System.out.println(list.getName());
			System.out.println(list.getAddress());
		}
		
		Hashtable hashtable = new Hashtable();
		hashtable.put(1, 1);
		hashtable.put(2, 2);

		//EnumMap의 사용법은...?
//		EnumMap map = new EnumMap(hashtable);
//		System.out.println(map.get(1).getClass().getName());
//		for (int i = 1; i <= map.size(); i++) {
//			System.out.println(map.get(i));
//		}
		
		LinkedHashMap map = new LinkedHashMap(hashtable);
		
		System.out.println("Hashtable: " + hashtable.getClass().getName());
		System.out.println("LinkedHashMap: " + map.getClass().getName());
		
		//Hashtable -> LinkedHashMap 으로 담았다
		//꺼낼 때는 (int)LinkedHashMap(Hashtable) 반대로
		for (int i = 1; i <= map.size(); i++) {
			System.out.println(map.get(i));
		}
		
		map.clear();
		
		//new List_5(name, address) -> list -> hashtable -> linkedHashMap
		hashtable.put(1, link);
		
		LinkedHashMap map2 = new LinkedHashMap(hashtable);
		
		for (int i = 1; i <= map2.size(); i++) {
			if(map2.get(i).getClass().getName().equals("java.util.ArrayList")) {
				ArrayList linklist = (ArrayList) map2.get(i);
				for(int j=0;j<linklist.size();j++) {
					List_5 list5 = (List_5) linklist.get(j);
					System.out.println(list5.getName());
					System.out.println(list5.getAddress());
				}
			}
		}
	}

}
