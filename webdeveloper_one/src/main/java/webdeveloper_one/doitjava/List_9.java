package webdeveloper_one.doitjava;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

//input
//이름, 나이, 주소
//이름, 나이, 주소
//이름, 나이, 주소

//3개입력 생성자 또는 메소드
//ArrayList -> add(new List_9(이름, 10, 주소)
//ArrayList -> add(new List_9(이름2, 20, 주소2)
//ArrayList -> add(new List_9(이름3, 30, 주소3)

//Hashtable put(hash)

//(담기는 순서)List_9->ArrayList -> Hashtable
//(꺼내는 순서)Hashtable->ArrayList->List_9

//이름 검색: 이름 김혜준 검색되었습니다
//나이 검색: 나이 	검색되었습니다
//주소 검색: 주소		검색되었습니다

//이름,나이,주소 3개 중에 하나로도 검색이 되면
//이름,나이,주소 가 검색되었습니다

public class List_9 {
	private String name;
	private int age;
	private String address;

	Scanner scanner = new Scanner(System.in);
	ArrayList arrayList = new ArrayList();
	Hashtable hashtable = new Hashtable();

	public List_9() {

	}

	public List_9(String name, int age, String address) {
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

	public void insert() {
		for (int i = 0; i < 3; i++) {
			System.out.print("이름: ");
			String name = scanner.next();
			System.out.print("나이: ");
			int age = scanner.nextInt();
			System.out.print("주소: ");
			String address = scanner.next();

			arrayList.add(new List_9(name, age, address));
		}
		System.out.println("================================");

		hashtable.put(1, arrayList);
	}

	public void search() {

		while (true) {
			System.out.print("검색 타입(이름/나이/주소): ");
			String type = scanner.next();

			Object search = null;
			if (type.equals("나이")) {
				System.out.print("나이 검색: ");
				search = Integer.valueOf(scanner.nextInt());
			} else if (type.equals("이름")) {
				System.out.print("이름 검색: ");
				search = scanner.next();
			} else if (type.equals("주소")) {
				System.out.print("주소 검색: ");
				search = scanner.next();
			} else {
				System.out.println("종료합니다..");
				System.exit(0);
			}

			ArrayList arrayList2 = (ArrayList) hashtable.get(1);

			int count = 0;
			for (int i = 0; i < arrayList2.size(); i++) {
				List_9 list9 = (List_9) arrayList2.get(i);
				if (list9.getName().equals(search) || Integer.valueOf(list9.getAge()).equals(search)
						|| list9.getAddress().equals(search)) {
					System.out.println(list9 + "\t검색되었습니다");
					++count;
				}
			}
			if (Integer.valueOf(count).equals(0)) {
				System.out.println("검색결과가 없습니다");
			}
			System.out.println("--------------------------------");
		}
	}

	public static void main(String[] args) {
		List_9 list9 = new List_9();
		list9.insert();
		list9.search();

	}

}