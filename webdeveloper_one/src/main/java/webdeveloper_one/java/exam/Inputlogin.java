package webdeveloper_one.java.exam;

import java.util.ArrayList;

public class Inputlogin {
	// 이름, 나이, 주소를 5개 listList로 받고,
	// 이름으로 검색 or 나이로 검색, 주소로 검색
	// 조건문 3개로 해서 검색될 수 있게 하기

	public static ArrayList<Loginbean> list = new ArrayList();

	public void searchName(String userid) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getUserid().equals(userid)) {
				System.out.println("===이름으로 검색===");
				System.out.println("이름: " + list.get(i).getUserid());
				System.out.println("나이: " + list.get(i).getAge());
				System.out.println("주소: " + list.get(i).getAddr());
			}
		}
	}

	public void searchAge(int age) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAge() == age) {
				System.out.println("===나이로 검색===");
				System.out.println("이름: " + list.get(i).getUserid());
				System.out.println("나이: " + list.get(i).getAge());
				System.out.println("주소: " + list.get(i).getAddr());

			}
		}
	}

	public void searchAddr(String addr) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAddr().equals(addr)) {
				System.out.println("===주소로 검색===");
				System.out.println("이름: " + list.get(i).getUserid());
				System.out.println("나이: " + list.get(i).getAge());
				System.out.println("주소: " + list.get(i).getAddr());
			}
		}
	}

	public static void main(String[] args) {
		Inputlogin login = new Inputlogin();

		list.add(new Loginbean("오다희", 23, "청주"));
		list.add(new Loginbean("김지수", 25, "강릉"));
		list.add(new Loginbean("김윤정", 22, "평택"));
		list.add(new Loginbean("김은서", 28, "당진"));
		list.add(new Loginbean("유수진", 21, "공주"));

		String name = "오다희";

		// 이름으로 검색
		login.searchName(name);

		// 나이로 검색
		login.searchAge(25);

		// 주소로 검색
		login.searchAddr("평택");

	}
}
