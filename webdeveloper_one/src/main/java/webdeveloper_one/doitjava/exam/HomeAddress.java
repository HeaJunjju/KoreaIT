package webdeveloper_one.doitjava.exam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

//본인 이름, 나이, 주소
//입출력을 통해서 이름이면 이름출력, 나이면 나이출력, 주소면 주소 출력

//system.exit(0);

//(선택) FileReader

public class HomeAddress {

	private String name;
	private int age;
	private String address;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public HomeAddress() {
		getData();
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public void getData() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\file\\data.txt"));

			String str = "";
			while ((str = br.readLine()) != null) {
				String[] value = str.split(":");
				if (value[0].equals("이름")) {
					this.name = value[1];
				} else if (value[0].equals("나이")) {
					this.age = Integer.parseInt(value[1]);
				} else if (value[0].equals("주소")) {
					this.address = value[1];
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void Input() {

		try {
			while (true) {
				System.out.print("이름, 나이, 주소 중에 선택하세오: ");
				String type = br.readLine();
				switch (type) {
				case "이름":
				case "나이":
				case "주소":
					System.out.print(type + "을 입력하세요: ");
					String value = br.readLine();
					search(type, value);
					break;
				case "exit":
					System.out.println("종료됩니다");
					System.exit(0);
				default:
					System.out.println("잘못된 입력");
					break;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void search(String type, String value) {
		if (type.equals("이름")) {
			if (value.equals(getName())) {
				System.out.println(value + " 일치합니다");
			} else {
				System.out.println("일치하지 않습니다");
			}
		} else if (type.equals("나이")) {
			if (Integer.valueOf(value).equals(getAge())) {
				System.out.println(value + " 일치합니다");
			} else {
				System.out.println("일치하지 않습니다");
			}
		} else if (type.equals("주소")) {
			if (value.equals(getAddress())) {
				System.out.println(value + " 일치합니다");
			} else {
				System.out.println("일치하지 않습니다");
			}
		}
	}

	public static void main(String[] args) {

		HomeAddress homeAddress = new HomeAddress();

		homeAddress.Input();

	}

}