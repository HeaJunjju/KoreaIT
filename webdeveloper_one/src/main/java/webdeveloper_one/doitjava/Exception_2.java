package webdeveloper_one.doitjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception_2 {

	public void Print() {
		//부모형의 에러클래스가 나오면 자식의 에러클래스는 올 수 없다
		//Exception 오면 에러 자식클래스는 올 수 없다.
		try {
			// Exception: 모든 예외상황의 부모
			// 부모이기 때문에 모든 에러를 처리할 수 있다
//			Exception_2 ex = new Exception_2();
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			String temp = "";
			while (temp != null) {
				temp = buffer.readLine();
				System.out.println(temp);
			}
		} catch (IOException e) {
			new Exception("에러메세지");
		} catch (Exception e) {

		} finally {
			System.out.println("에러가 나던 안나던 무조건 실행");
		}
	}
	
	//해당하는 메소드를 호출(call)하면 호출하는 곳에서도 에러처리를 해주어야 한다.
	public static String Name() throws Exception {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String temp = "";
		while (temp != null) {
			temp = buffer.readLine();
			System.out.println(temp);
			if(temp.equals("exit")) {
				//System.exit(0) -> 프로그램 종료, 메모리에서도 없어지는
				System.exit(0);
			}
		}
		return "홍길동";
	}

	//메소드는 스스로 호출할 수 없다
	//main -> c, java, c# -> java에서는 jvm이 호출한다
	//java -> jvm이 해석한다(번지수 x, 객체)
	//자바의 은닉화, 캡슐화
	//자바의 재사용성 -> 자바의 공통
	public static void main(String[] args) {
		try {
			Exception_2.Name();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//jdbc: connection close;
			//stat close;
			//resultset close;
			try {
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}
