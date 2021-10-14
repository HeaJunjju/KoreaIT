package webdeveloper_one.doitjava;

public class Method_2 {

	//public이라도 main에서 바로 변수에 접근하면 위험함.
	//get, set메소드를 통해서 접근
	public String name;
	public int age;
	public String address;
	
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

	public void Home(String name, int age, String address) {
		System.out.println("이름은: " + name + " 나이는: " + age + " 주소는 " + address);
	}

	public static void main(String[] args) {
		Method_2 me = new Method_2();
		me.Home("최소영", 26, "영통구");
	
		//get: 값을 얻는다
		//set: 입력, 수정, 삭제
		//database(oracle11, mysql5.6): jdbc -> get,set -> 자동으로 해당하는 메소드 이름에 주입
		
		me.setName("최길동");
		me.setAge(16);
		me.setAddress("조선구");
		
		System.out.println(me.getName() + " " +me.getAge()+" "+me.getAddress());
		
		
	}

}
