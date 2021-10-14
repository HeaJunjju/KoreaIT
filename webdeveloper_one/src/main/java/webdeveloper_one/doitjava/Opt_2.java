package webdeveloper_one.doitjava;

public class Opt_2 {

	public static void main(String[] args) {
		//산술연산  +-*/%
		System.out.println(2+3);
		System.out.println(8-5);
		System.out.println(7*2);
		System.out.println(8/2);
		System.out.println(4%3);
		
		//비교연산 == != < >
		int one=5;
		int two=2;
		
		System.out.println(one<two);
		System.out.println(one>two);
		System.out.println(one<=two);
		System.out.println(one>=two);
		System.out.println(two==one);
		System.out.println(two!=one);
		
		one=10; two=10; int three=4;
		
		//new: 새로운 방을 만든다(객체)
		//자바는 주소로 가지 못한다. 객체를 통해서만 접근할 수 있다
		String strvalue1=new String("안녕");
		String strvalue2=new String("안녕");
		
		//문자열 비교
		if(strvalue1.equals(strvalue2)) {
			System.out.println("같다");
		}
		
		
	}

}
