package webdeveloper_one.doitjava;

public class Switch_1 {

	public static void main(String[] args) {
		int choice =10;
		//break: 해당하는 괄호문을 탈출한다
		
		switch (choice) {
		case 10:
			System.out.println(choice);			
			break;
		case 20:
			System.out.println(choice);
			break;
		case 30:
			System.out.println(choice);
			break;
		default:
			break;
		}

		String name="최소영";
		switch (name) {
		case "이순신":
			System.out.println(name);
			break;
		case "폰노이만":
			System.out.println(name);			
			break;
		case "최소영":
			System.out.println(name);
			break;
		default:
			break;
		}

		char ch='최';
		switch (ch) {
		case '이':
			System.out.println(ch);
			break;
		case '폰':
			System.out.println(ch);			
			break;
		case '최':
			System.out.println(ch);
			break;
		default:
			break;
		}
	}

}
