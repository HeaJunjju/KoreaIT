package webdeveloper_one.doitjava;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exception_1 {

	public static void main(String[] args) throws Exception {
		//System: System.out.println() -> output 담당
		//System.in: input 담당
		//System.exit(0) -> 종료
		
		//cache -> 메모리 if(or == true){캐쉬값 가져오기}
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String temp = "";
		while(temp != null) {
			temp = reader.readLine();
			System.out.println(temp);
		}
	}

}
