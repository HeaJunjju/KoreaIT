package webdeveloper_one.doitjava.present;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Kimhyejun_present {
	ArrayList studentList = new ArrayList();
	PresentDAO presentDao = new PresentDAO();
	Scanner scanner = new Scanner(System.in);

	public Kimhyejun_present() {
		// 시간이 0~8시 사이면 db startCheck, endCheck 초기화
	}

	private void menu() {
		while (true) {
			System.out.println("=====================");
			System.out.println("1. 검색(출결체크)");
			System.out.println("2. 리스트 보기");
			System.out.println("3. 파일 저장");
			System.out.println("4. 통계");
			System.out.println("5. 종료");
			System.out.print("메뉴 선택>>");
			int choice = scanner.nextInt();
			System.out.println("---------------------------------------");
			switch (choice) {
			case 1:
				checkAttendance();
				break;
			case 2:
				studentList();
				break;
			case 3:
				saveFile();
				break;
			case 4:
				showResult();
				break;
			case 5:
				System.out.println("종료합니다..");
				System.exit(0);
			default:
				System.out.println("1~5 중에 선택하세요");
				break;
			}
		}

	}

	public boolean login() {
		System.out.println("====출석부 시스템 로그인====");
		// membertable로 로그인
		boolean isLogin = false;
		Map map = presentDao.selectAllMember();

		System.out.print("아이디: ");
		String id = scanner.next();
		System.out.print("비밀번호: ");
		String pwd = scanner.next();

		if (map.get(id) != null && map.get(id).equals(pwd)) {
			isLogin = true;
		} else {
			System.out.println("로그인 실패");
			System.exit(0);
		}
		return isLogin;
	}

	public void checkAttendance() {
		System.out.print("검색타입: ");
		String type = scanner.next();
		Object search = null;
		if (type.equals("이름")) {
			System.out.print("검색할 이름: ");
			search = scanner.next();
			type = "name";
		} else if (type.equals("나이")) {
			System.out.print("검색할 나이: ");
			search = scanner.nextInt();
			type = "age";
		} else if (type.equals("주소")) {
			System.out.print("검색할 주소: ");
			search = scanner.next();
			type = "address";
		} else if (type.equals("이메일")) {
			System.out.print("검색할 이메일: ");
			search = scanner.next();
			type = "email";
		} else if (type.equals("핸드폰번호")) {
			System.out.print("검색할 핸드폰번호: ");
			search = scanner.next();
			type = "phone";
		} else {
			return;
		}
		System.out.print("입실/퇴실>>");
		String status = scanner.next();
		if (status.equals("입실")) {
			presentDao.checkAttendance(type, search, "startCheck");
		} else if (status.equals("퇴실")) {
			presentDao.checkAttendance(type, search, "endCheck");
		} else {
			return;
		}
	}

	public void studentList() {
		ArrayList<StudentBean> array = new ArrayList<StudentBean>();
		array = presentDao.studentList();
		System.out.println(
				"번호\t\t이름\t\t나이\t\t주소\t\t이메일\t\t\t폰번호\t\t\t입실시간\t\t퇴실시간\t\t일일점수\t\t주간점수\t\t미니프로젝트\t\t프로젝트\t\t직위\t\t직위점수");
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
	}

	public void saveFile() {
		ArrayList<StudentBean> array = new ArrayList<StudentBean>();
		array = presentDao.studentList();
//		System.out.println(System.getProperty("user.dir"));
		String today = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("./project/present/" + today + "-check.log"));
			for (int i = 0; i < array.size(); i++) {
				bw.write(array.get(i).fileForm());
				bw.newLine();
			}
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void showResult() {
		// 전체 학생수 뽑기
		int allStudentCount = presentDao.allStudentCount();
		System.out.println("전체 학생수: " + allStudentCount);
		// 출석률 계산
		int attendanceCount = presentDao.attendanceCount();
		System.out.println("출석 학생수: " + attendanceCount);
		// 결석률 계산
		int absenceCount = presentDao.absenceCount();
		System.out.println("결석 학생수: " + absenceCount);
		// 지각률 계산
		int lateCount = presentDao.lateCount();
		System.out.println("지각 학생수: " + lateCount);
		// 조퇴율 계산
		int earlyLeaveCount = presentDao.earlyLeaveCount();
		System.out.println("조퇴 학생수: " + earlyLeaveCount);
		System.out.println("출석률: " + calculate(attendanceCount, allStudentCount) + "% 결석률: "
				+ calculate(absenceCount, allStudentCount) + "% 지각률: " + calculate(lateCount, allStudentCount)
				+ "% 조퇴율: " + calculate(earlyLeaveCount, allStudentCount) + "%");

	}

	public String calculate(int value1, int value2) {
		String result = "";
		double cal = value1 / (double) value2 * 100;
		result = String.format("%.2f", cal);
		return result;
	}

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(Locale.KOREA);
		int val = cal.get(Calendar.HOUR_OF_DAY);

		if (val >= 0 && val < 8) {
			new PresentDAO().resetData();
		}
		Kimhyejun_present obj = new Kimhyejun_present();
		boolean isLogin = obj.login();
		if (isLogin == true) {
			obj.menu();
		}
	}

}
