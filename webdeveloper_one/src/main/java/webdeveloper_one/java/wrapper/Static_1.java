package webdeveloper_one.java.wrapper;

import java.util.Iterator;

public class Static_1 {
	// static: 모든 객체에 공유됨
	public static int init = 0;

	public Static_1() {
		++init;

		System.out.println(init);
	}

	public static void main(String[] args) {

//		Static_1 s = new Static_1();
//		Static_1 s2 = new Static_1();
//		Static_1 s3 = new Static_1();
		for (int i = 1; i <= 5; i++) {
			// 무명 객제
			new Static_1();
		}

		// 클래스명.변수명이나 메소드명
		// ->Static_1.init
		System.out.println(Static_1.init);
	}
}
