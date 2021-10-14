package webdeveloper_one.java;

public class Character_1 {
	public static void main(String[] args) {
		// char(Character): 문자를 나타낼 때 싱글쿼터로 감싼다.
		// 문자+문자 -> 문자열
		char cv1 = '홍';
		char cv2 = '길';
		char cv3 = '동';

		System.out.println(cv1);
		System.out.println(cv2);
		System.out.println(cv3);

		System.out.println("======================");

		String name = "아무개";
		for (int i = 0; i < name.length(); i++) {
			char c1 = name.charAt(i);
			System.out.println(c1);
		}

		System.out.println("======================");
		Character ch = new Character('k');
		System.out.println(ch.charValue());

		// 본인 성을 검색해서 검색되면 예) 이씨로 검색되었습니다.
		// 이, 김, 오
		System.out.println("문제) 내 버전===============");
		String name2 = "오다희";

		Character na = name2.charAt(0);

		if (na.equals('김')) {
			System.out.println(na + "씨로 검색되었습니다.");
		} else if (na.equals('이')) {
			System.out.println(na + "씨로 검색되었습니다.");
		} else if (na.equals('오')) {
			System.out.println(na + "씨로 검색되었습니다.");
		}

		System.out.println("문제) 교수 버전==============");
		String name3 = "김길동";
		Character charr[] = { '김', '이', '오' };

		for (int i = 0; i < name3.length(); i++) {
			char c2 = name3.charAt(i);
			if (i == 0) {
				for (int j = 0; j < charr.length; j++) {
					if (charr[j].equals(c2)) {
						System.out.println(c2 + "씨로 검색되었습니다.");
					}
				}
			}
		}

	}
}
