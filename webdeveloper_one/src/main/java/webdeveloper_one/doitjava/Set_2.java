package webdeveloper_one.doitjava;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Set_2 {

//LinkedHashSet
//userid,address 추가입력, 삭제(이름 또는 주소), 리스트 출력

	private String name;
	private String address;
	Scanner scanner = new Scanner(System.in);
	LinkedHashSet list = new LinkedHashSet();

	public Set_2() {

	}

	public Set_2(String name, String address) {
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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + "\t" + address;
	}

	public void menu() {
		while (true) {
			System.out.println("=====================");
			System.out.println("1. 입력");
			System.out.println("2. 삭제");
			System.out.println("3. 리스트");

			System.out.print("메뉴 선택>>");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				insert();
				break;
			case 2:
				delete();
				break;
			case 3:
				list();
				break;
			default:
				System.out.println("종료합니다");
				System.exit(0);
			}
		}

	}

	public void insert() {
		System.out.print("이름: ");
		String name = scanner.next();
		System.out.print("주소: ");
		String address = scanner.next();

		list.add(new Set_2(name, address));
	}

	public void delete() {
		System.out.print("검색어 입력: ");
		String search = scanner.next();
		
		Object ob[] = list.toArray();
		
		int count = 0;
		for(int i=0;i<ob.length;i++) {
			Set_2 set2 = (Set_2) ob[i];
			
			if(set2.getName().equals(search)||set2.getAddress().equals(search)) {
				boolean isRemove = list.remove(set2);
				if(isRemove==true){
					System.out.println("삭제되었습니다");
					++count;
				}else {
					System.out.println("삭제 실패");
				}
			}
		}
		if(Integer.valueOf(count).equals(0)) {
			System.out.println("해당하는 값이 없습니다");
		}
	}

	public void list() {
		System.out.println("이름\t\t주소");
		System.out.println("----------------------------");
		Object ob[] = list.toArray();
		if(Integer.valueOf(ob.length).equals(0)) {
			System.out.println("리스트 없음");
		}else {
			for (int i = 0; i < ob.length; i++) {
				Set_2 set = (Set_2) ob[i];
	
				System.out.println(set);
			}
		}
	}

	public static void main(String[] args) {
		Set_2 set2 = new Set_2();
		set2.menu();

	}

}
