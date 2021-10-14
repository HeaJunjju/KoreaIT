package webdeveloper_one.todayq;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
일일 문제
 
게시판

회원가입	이름,나이,주소,아이디(중복체크), 비밀번호 이중확인
로그인
아이디/비밀번호

리스트, 검색 조회수 1증가
글쓰기, 리스트, 검색(아이디, 이름, 날짜, 이메일) - 조회 +1 카운터 10
글 읽으면 조회수 +1
*/
public class TodayBoard {
	Scanner scanner = new Scanner(System.in);

	private List<MemberBean> memberList = new ArrayList<MemberBean>();
	private Map<String, String> memberMap = new HashMap<String, String>();
	private MemberBean loginMember = new MemberBean();
	private List<BoardBean> boardList = new ArrayList<BoardBean>();
	private List<BoardBean> searchList = new ArrayList<BoardBean>();

	public void menu1() {
		while (true) {
			System.out.println("======================");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 종료");
			System.out.print("메뉴선택>>");
			int choice = scanner.nextInt();
			System.out.println("----------------------------------------");
			switch (choice) {
			case 1:
				registerMember();
				break;
			case 2:
				if (login() == true) {
					menu2();
				} else {
					System.out.println("로그인 실패");
				}
				break;
			case 3:
				System.out.println("종료합니다..");
				System.exit(0);
			default:
				System.out.println("메뉴를 다시 선택하세요");
				break;
			}
		}
	}

	public void registerMember() {
		System.out.print("이름: ");
		String name = scanner.next();
		System.out.print("나이: ");
		int age = scanner.nextInt();
		System.out.print("이메일: ");
		String email = scanner.next();
		System.out.print("주소: ");
		String address = scanner.next();

		String id = null;

		while (true) {
			System.out.print("아이디: ");
			id = scanner.next();
			if (memberMap.get(id) != null) {
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
		MemberBean memberBean = new MemberBean(name, age, email, address, id, passwd, repasswd);
		boolean value1 = memberList.add(memberBean);

		String value2 = memberMap.put(memberBean.getId(), memberBean.getPasswd());

		if (value1 == true && value2 == null) {
			System.out.println(id + "님 회원가입 되었습니다");
		}

	}

	public boolean login() {
		boolean value = false;
		System.out.print("아이디: ");
		String id = scanner.next();
		System.out.print("비밀번호: ");
		String passwd = scanner.next();

		if (memberMap.get(id) != null && memberMap.get(id).equals(passwd)) {
			System.out.println(id + "님 로그인 되었습니다");
			value = true;
			for (int i = 0; i < memberList.size(); i++) {
				if (memberList.get(i).getId().equals(id)) {
					loginMember = memberList.get(i);
				}
			}
		}
		return value;
	}

	public void menu2() {
		while (true) {
			System.out.println("======================");
			System.out.println("1. 글쓰기");
			System.out.println("2. 리스트");
			System.out.println("3. 검색");
			System.out.println("4. 로그아웃");
			System.out.print("메뉴 선택>>");
			int choice = scanner.nextInt();
			System.out.println("-----------------------------------------");
			switch (choice) {
			case 1:
				registerBoard();
				break;
			case 2:
				showBoardList();
				break;
			case 3:
				searchBoard();
				break;
			case 4:
				System.out.println("로그아웃");
				return;
			default:
				System.out.println("메뉴를 다시 선택하세요");
				break;
			}
		}
	}

	public void registerBoard() {
		if (loginMember != null) {
			System.out.print("제목: ");
			String title = scanner.next();
			String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
			BoardBean board = new BoardBean(title, loginMember.getId(), loginMember.getName(), date,
					loginMember.getEmail(), 0);

			boardList.add(board);
		}
	}

	public void showBoardList() {
		System.out.println("제목\t\t아이디\t\t작성자\t\t작성일\t\t이메일\t\t\t조회수");
		for (int i = 0; i < boardList.size(); i++) {
			System.out.println(boardList.get(i));
		}
	}

	public void searchBoard() {
		System.out.print("검색 타입 선택(이름, 아이디, 날짜, 이메일): ");
		String type = scanner.next();
		if (type.equals("이름") || type.equals("아이디") || type.equals("날짜") || type.equals("이메일")) {
			System.out.print(type + "을 입력하세요: ");
			String search = scanner.next();
			search(type, search);
		} else {
			System.out.println("잘못된 입력");
		}
	}

	public void search(String type, String search) {
		for (int i = 0; i < boardList.size(); i++) {
			BoardBean board = (BoardBean) boardList.get(i);

			if (type.equals("이름")) {
				if (search.equals(board.getName())) {
					searchList.add(board);
					System.out.println(board);
					board.setHits(board.getHits() + 1);
				}
			} else if (type.equals("아이디")) {
				if (search.equals(board.getName())) {
					searchList.add(board);
					System.out.println(board);
					board.setHits(board.getHits() + 1);
				}
			} else if (type.equals("날짜")) {
				if (search.equals(board.getDate())) {
					searchList.add(board);
					System.out.println(board);
					board.setHits(board.getHits() + 1);
				}
			} else if (type.equals("이메일")) {
				if (search.equals(board.getEmail())) {
					searchList.add(board);
					System.out.println(board);
					board.setHits(board.getHits() + 1);
				}
			}
		}

		if (searchList.isEmpty()) {
			System.out.println("검색결과 없음");
		}
	}

	public static void main(String[] args) {
		TodayBoard obj = new TodayBoard();
		obj.menu1();

	}

}
