package webdeveloper_one.java;

public class Casting_1 {
	// 이름(str), 나이(int), 주소(str)

	// (boolean 리턴)이름 메소드(Object name) 정의(이름 받기)
	// -> 문자열 인지 검색(equals)하고 문자면, 문자형로 형변환 후 현재 이름 검색
	// (boolean 리턴)나이 메소드(Object age) 정의(나이 받기)
	// -> 정수형 인지 검색하고 정수면, 정수형으로 형변환 후 현재 나이 검색
	// (boolean 리턴) 주소 메소드(Object addr) 정의(주소 받기)
	// -> 문자열 인지 검색하고 문자면, 문자형으로 형변환 후 현재 주소 검색

	// Allcheck(){} : 이름, 나이, 주소가 맞으면 회원 가입 되었습니다. 출력

	public void Allcheck(boolean bname, boolean bage, boolean baddr) {

		if (bname == true && bage == true && baddr == true) {
			System.out.println("회원가입 되었습니다.");
		} else {
			System.out.println("회원가입 실패했습니다.");
		}
	}

	public boolean Name(Object name) {
		String choice = name.getClass().getName();

		if (choice.equals("java.lang.String")) {
			String obname = (String) name;
			System.out.println("이름: " + obname);
			return true;
		} else {
			System.out.println("이름을 문자열로 입력해주세요.");
			return false;
		}
	}

	public boolean Age(Object age) {
		String choice = age.getClass().getName();

		if (choice.equals("java.lang.Integer")) {
			Integer obage = (Integer) age;
			System.out.println("나이: " + obage);
			return true;
		} else {
			System.out.println("나이를 정수로 입력해주세요.");
			return false;
		}
	}

	public boolean Addr(Object addr) {
		String choice = addr.getClass().getName();

		if (choice.equals("java.lang.String")) {
			String obaddr = (String) addr;
			System.out.println("주소: " + obaddr);
			return true;
		} else {
			System.out.println("주소를 문자형으로 입력해주세요.");
			return false;
		}
	}

	public static void main(String[] args) {

		Casting_1 c = new Casting_1();

		boolean bname = c.Name("홍길동");
		boolean bage = c.Age(21);
		boolean baddr = c.Addr("안산");

		c.Allcheck(bname, bage, baddr);

	}
}
//		// 문자열 -> 정수로
//		Integer intvalue = Integer.parseInt("1");
//		System.out.println(intvalue.getClass().getName());
//		// 정수 -> 문자열로
//		String stringvalue = String.valueOf(1);
//		System.out.println(stringvalue.getClass().getName());
//		// 업캐스팅: 자식에서 부모형으로 전환
//		// 다운캐스팅: 부모형에서 자식으로 전환
//		// 자동캐스팅: 자동으로 변환
//		// 강제캐스팅: 강제적으로 변환
//
//		// 본인나이에서 +10을 하시오.
//		Object age = 10;
//		Object name = "홍길동";
//
//		String choice = age.getClass().getName();
//
//		if (choice.equals("java.lang.String")) {
//			System.out.println("문자열 입니다.");
//
//			// 다운 캐스팅 object -> int
//			int agevalue = (int) age;
//			agevalue += 10;
//			System.out.println(agevalue);
//
//		}
//		if (choice.equals("java.lang.Integer")) {
//			System.out.println("정수형 입니다.");
//		}  
//	}
//}
