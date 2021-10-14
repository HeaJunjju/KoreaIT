package webdeveloper_one.doitjava;

public class Casting_1 {

	public static void main(String[] args) {
		//업캐스팅, 다운 캐스팅
		//강제캐스팅, 자동 캐스팅
		
		//문자열 제일크다
		//문자열이 크기때문에 자동으로 정수형이 
		//문자형으로 바꾼다
		
		System.out.println("문자열"+10);
		String strvalue="1";
		System.out.println("문자형: "+strvalue);
		//문자형->정수형
		int intvalue = Integer.parseInt(strvalue);
		intvalue += 10;
		System.out.println("정수형으로 변환:"+intvalue);
		
		//정수형->문자형
		strvalue = String.valueOf(intvalue).toString();
		System.out.println("문자형으로 변환:"+strvalue);
	
		//업캐스팅
		//모든 클래스는 반드시 Obejct를 상속받아야한다
		//Object를 상속받지 않으면 자바가 아니다
		//자바 외의 언어: native
		
		//모든 클래스의 부모는 Object
		//모든 타입 (type)을 부모가 받을 수 있다
		//상속의 개념으로 보면 자식이 부모보다 크거나 같다
		Object ob= (Object)new String("업캐스팅");
		//ob는 Object 타입임. String인 "업캐스팅"을 Object ob로 업캐스팅
		
		if(ob.equals("업캐스팅")) {
			System.out.println("true입니다");
		}
		//String으로 다운캐스팅
			 //1. 강제형변환 캐스팅
			 String obstrvalue = (String)ob;
			 //2. api
			 String obstrvalue2 = String.valueOf(ob);
			
		 System.out.println("다운캐스팅\n1:"+obstrvalue+"\n2:"+obstrvalue2);
	
		 
	}
}
