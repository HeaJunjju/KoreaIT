package webdeveloper_one.java;

public class Var_2 {

	public static void main(String[] args) {

		// 정수형 변수: 정수형만 오는 변수, 변할 수 있음

		// 주석문 단축키
		// ctrl+shift+/
		// ctrl+shift+c
		int age = 10;

		// 보라색으로 나오는 것들은 전부 예약어이다.
		// 예약어: 이미 정해져 있어서 변수명이나 메소드명으로 쓸 수 없다.

//		int int = 10; //int는 예약어라 변수로 쓸 수 없다.
		// +10 -10 base=age
		age = 20;
		System.out.println("나이는: " + age);
//		System.out.println(age + 10); //잘못된 방법
//		System.out.println(age - 10); //잘못된 방법

		age = 20;

		age += 10;
		age -= 10;

		System.out.println("나이는: " + age);

	}
}
