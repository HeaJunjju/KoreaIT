package webdeveloper_one.doitjava;

import java.util.ArrayList;

public class Constructor_1 {

	ArrayList<Constructor_1> list=new ArrayList ();
	
	public String name;
	public int age;
	public String address;
	public String email;
	

	public Constructor_1() {	}
	public Constructor_1(String name, int age, String address,String email) {
		
		//application: 콘솔 -> 응용프로그램
		//web+application: 브라우저: 사파리, ie, chrome, opera... -> 웹애플리케이션
		//매개변수: 해당하는 지역 변수(app,web)
		//인자(아귀먼트): application(애플리케이션)
		//파라미터(parameter): web+application
		
		//지역변수와 전역변수의 이름이 같으면 반드시 전역변수에 this.전역변수 써야함
		this.name=name;
		this.age=age;
		this.address=address;
		this.email=email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public static void main(String[] args) {
		//Constructor_1 c = new Constructor_1();
		Constructor_1  c2 = new  Constructor_1("최소영", 324, "영통","choi@~.com");
		Constructor_1  c3 = new  Constructor_1("choiso", 324, "ytgu","ddd@.~com");
		Constructor_1  c4 = new  Constructor_1("폰노이만",123,"외국","phone@.~com");
		Constructor_1  c5 = new  Constructor_1("강아지",3,"우리집","woof@.~com");
		Constructor_1  c6 = new  Constructor_1("고양이",2,"친구집","meow@.~com");
		
		Constructor_1 carray[]={c2,c3,c4,c5,c6};
		
		for(int i=0;i<carray.length;i++) {
			System.out.print(carray[i].getName()+"\t");
			System.out.print(carray[i].getAge()+"\t");
			System.out.print(carray[i].getAddress()+"\t");
			System.out.print(carray[i].getEmail()+"\n");
					
		}
		
		//5개의 이름, 나이, 주소, 이메일 입력 new 5개
		//5개의 이름,나이, 주소,이메일을 메소드를 통해 출력하시오
	}

}
