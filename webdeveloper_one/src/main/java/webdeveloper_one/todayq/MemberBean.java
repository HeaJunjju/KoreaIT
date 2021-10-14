package webdeveloper_one.todayq;

public class MemberBean {
	private String name;
	private int age;
	private String email;
	private String address;
	private String id;
	private String passwd;
	private String repasswd;

	public MemberBean() {
		// TODO Auto-generated constructor stub
	}

	public MemberBean(String name, int age, String email, String address, String id, String passwd, String repasswd) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
		this.id = id;
		this.passwd = passwd;
		this.repasswd = repasswd;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getRepasswd() {
		return repasswd;
	}

	public void setRepasswd(String repasswd) {
		this.repasswd = repasswd;
	}

}
