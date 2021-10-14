package webdeveloper_one.doitjava;

public class Method_1 {

	public String name="최소영";
	public int age=26;
	public String address="영통구";
	
	public void Print() {
		System.out.println("void 는 return 타입이 필요없을 때 사용한다");		
	}
	public void Name() {
		System.out.println("최소영");
	}
	public void Age() {
		System.out.println(26);
	}
	public void Address() {
		System.out.println("영통구");
	}
	
	public String Strname() {
		return name;
	}
	public Integer Intage() {
		return age;
	}
	public String Straddress() {
		return address;
	}
	public static void main(String[] args) {

		//변수: 움직일 수 없다(명사)
		//메소드가 움직인다(동사)
		//메소드는 괄호가 있다
		//변수는 없다
		System.out.println("출력한다");
		
		Method_1 ob= new Method_1();
		ob.Print();
		
		//이름,나이,주소를 void Address()출력

		ob.Name();
		ob.Age();
		ob.Address();
		
		ob.Strname();
		ob.Intage();
		ob.Straddress();
	}

}
