package webdeveloper_one.java.exam;

public class Loginbean {
	public String userid;
	public int age;
	public String addr;

	public Loginbean() {

	}

	public Loginbean(String userid, int age, String addr) {
		this.userid = userid;
		this.age = age;
		this.addr = addr;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
}
