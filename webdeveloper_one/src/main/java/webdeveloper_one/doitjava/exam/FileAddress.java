package webdeveloper_one.doitjava.exam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileAddress {
	private String name;
	private int age;
	private String address;

	Scanner scanner = new Scanner(System.in);
	ArrayList inputArray = new ArrayList();
	ArrayList searchArray = new ArrayList();

	public FileAddress() {
		// TODO Auto-generated constructor stub
	}

	public FileAddress(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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
		return "이름:" + name + " 나이:" + age + " 주소:" + address;
	}

	public void menu() {
		while (true) {
			System.out.println("==============================");
			System.out.println("1. 파일에서 입력받기");
			System.out.println("2. 파일에 검색결과 출력");
			System.out.println("3. 종료");
			System.out.print("선택>>");
			int choice = scanner.nextInt();
			System.out.println("==============================");

			switch (choice) {
			case 1:
				getInput();
				break;
			case 2:
				fileOutput();
				break;
			case 3:
				System.out.println("종료합니다");
				System.exit(0);
			default:
				System.out.println("다시 선택하세요");
				break;
			}
		}
	}

	public void getInput() {
		inputArray.clear();
		try {
			BufferedReader br = new BufferedReader(new FileReader("./file/input.txt"));

			String str = "";
			try {
				while ((str = br.readLine()) != null) {
					String[] person = str.split(" ");
					FileAddress fa = new FileAddress();
					for (int i = 0; i < person.length; i++) {
						String[] value = person[i].split(":");
						if (value[0].equals("이름")) {
							fa.setName(value[1]);
						} else if (value[0].equals("나이")) {
							fa.setAge(Integer.parseInt(value[1]));
						} else if (value[0].equals("주소")) {
							fa.setAddress(value[1]);
						}
					}
					inputArray.add(fa);
				}
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (!inputArray.isEmpty()) {
			for (int i = 0; i < inputArray.size(); i++) {
				System.out.println(inputArray.get(i));
			}
		} else {
			System.out.println("입력리스트가 비어있음");
		}
	}

	public void fileOutput() {
		searchArray.clear();
		System.out.print("이름, 나이, 주소 중에 선택하세오: ");
		String type = scanner.next();
		if (type.equals("이름") || type.equals("나이") || type.equals("주소")) {
			System.out.print(type + "을 입력하세요: ");
			String search = scanner.next();
			search(type, search);
			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter("./file/output.txt"));
				for (int i = 0; i < searchArray.size(); i++) {
					bw.write(searchArray.get(i).toString());
					bw.newLine();
				}
				bw.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("잘못된 입력");
		}
	}

	public void search(String type, String search) {
		for (int i = 0; i < inputArray.size(); i++) {
			FileAddress fa = (FileAddress) inputArray.get(i);

			if (type.equals("이름")) {
				if (search.equals(fa.getName())) {
					searchArray.add(fa);
				}
			} else if (type.equals("나이")) {
				if (Integer.valueOf(search).equals(fa.getAge())) {
					searchArray.add(fa);
				}
			} else if (type.equals("주소")) {
				if (search.equals(fa.getAddress())) {
					searchArray.add(fa);
				}
			}
		}

		if (!searchArray.isEmpty()) {
			for (int i = 0; i < searchArray.size(); i++) {
				System.out.println(searchArray.get(i));
			}
		} else {
			System.out.println("검색결과 없음");
		}
	}

	public static void main(String[] args) {
		FileAddress obj = new FileAddress();
		obj.menu();

	}

}