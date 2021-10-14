package webdeveloper_one.doitjava.exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	Scanner scanner = new Scanner(System.in);
	private List<InputLogin> list = new ArrayList<InputLogin>();
	private Map<String, String> map = new HashMap<String, String>();

	public void menu() {
		while (true) {
			System.out.println("==================================================");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 종료");
			System.out.println("==================================================");

			System.out.print("메뉴 선택> ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				insert();
				break;
			case 2:
				login();
				break;
			case 3:
				System.out.println("종료합니다.");
				return;
			default:
				System.out.println("다시 선택하세요.");
				break;
			}
		}
	}

	public void insert() {
		String userid = null;

		while (true) {
			System.out.print("아이디: ");
			userid = scanner.next();
			if (map.get(userid) != null) {
				System.out.println("이미 회원가입된 아이디입니다.");
			} else {
				break;
			}
		}

		System.out.print("비밀번호: ");
		String passwd = scanner.next();
		String repasswd = null;
		while (true) {
			System.out.print("비밀번호 재확인: ");
			repasswd = scanner.next();

			if (passwd.equals(repasswd)) {
				break;
			} else {
				System.out.println("비밀번호가 일치하지않습니다.");
			}
		}
		System.out.print("이메일: ");
		String email = scanner.next();
		System.out.print("주소: ");
		String address = scanner.next();

		InputLogin inputLogin = new InputLogin(userid, passwd, repasswd, email, address);
		boolean value1 = list.add(inputLogin);

		Login login = new Login(userid, passwd);
		String value2 = map.put(login.getUserid(), login.getPasswd());

		if (value1 == true && value2 == null) {
			System.out.println(userid + "님 회원가입 되었습니다");
		}
	}

	public void login() {
		System.out.print("아이디: ");
		String userid = scanner.next();
		System.out.print("비밀번호: ");
		String passwd = scanner.next();

		if (map.get(userid) != null && map.get(userid).equals(passwd)) {
			System.out.println(userid + "님 로그인 되었습니다");
		} else {
			System.out.println("로그인 실패");
		}
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.menu();
	}
}
