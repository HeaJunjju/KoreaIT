package webdeveloper_one.doitjava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

//본인 이름,나이,주소
//3명입력(생성자 또는 메소드)
//hash->put(담기)
//hash.put(new List_6(이름,10,주소)
//hash.put(new List_6(이름,20,주소)
//hash.put(new List_6(이름,30,주소)
//ArrayList add(hash): arraylist에 hash를 넣기

//이름,나이,주소 3개중에 하나로 검색이 되면
//누구누구가 검색되었습니다

//검색: 20
//이름, 나이, 주소 가 검색되었습니다
public class List_6 {
	public String name;
	public int age;
	public String address;

	public List_6(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return name + "\t" + age + "\t" + address + "\t";
	}

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(1, new List_6("김혜준", 20, "송파1"));
		map.put(2, new List_6("김혜준2", 20, "송파2"));
		map.put(3, new List_6("김혜준3", 30, "송파3"));

		List list = new ArrayList();
		list.add(map);

		Scanner scanner = new Scanner(System.in);
		System.out.print("검색 타입(이름/나이/주소): ");
		String type = scanner.next();

		Object search = null;
		if (type.equals("나이")) {
			System.out.print("검색어: ");
			search = Integer.valueOf(scanner.nextInt());
		} else if (type.equals("이름") || type.equals("주소")) {
			System.out.print("검색어: ");
			search = scanner.next();
		} else {
			System.exit(0);
		}

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getClass().getName().equals("java.util.HashMap")) {
				Map map2 = (Map) list.get(i);
				int count = 0;
				for (int j = 1; j <= map2.size(); j++) {
					List_6 listvalue = (List_6) map2.get(j);

					if (listvalue.getName().equals(search) || Integer.valueOf(listvalue.getAge()).equals(search)
							|| listvalue.getAddress().equals(search)) {
						System.out.println(listvalue.toString() + "\t검색되었습니다");
						++count;
					}
				}
				if (Integer.valueOf(count).equals(0)) {
					System.out.println("검색결과가 없습니다");
				}
			}
		}
	}

}
