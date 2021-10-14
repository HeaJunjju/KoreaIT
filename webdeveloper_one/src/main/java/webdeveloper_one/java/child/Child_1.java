package webdeveloper_one.java.child;

public class Child_1 extends Parent {

	@Override
	public boolean equals(Object ob) {
		System.out.println("오버라이딩 된 메소드");

		return true;
	}

	public static void main(String[] args) {
		Child_1 ch = new Child_1();
		ch.equals("아무개"); // override가 있으면 equals는 자식 것, 없으면 부모 것

		Parent ch2 = new Child_1();
		ch2.equals(ch2);

		// 한국it직업전문학교 ( 학교 이름만 알면 나머지는 다 출력 가능)
		// 5층
		// 501, 502, 503

	}
}
