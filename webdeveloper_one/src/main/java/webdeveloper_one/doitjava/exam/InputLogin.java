package webdeveloper_one.doitjava.exam;

public class InputLogin {
	private String userid;
	private String passwd;
	private String repasswd;
	private String email;
	private String address;

	public InputLogin(String userid, String passwd, String repasswd, String email, String address) {
		this.userid = userid;
		this.passwd = passwd;
		this.repasswd = repasswd;
		this.email = email;
		this.address = address;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
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

	public String getRepasswd() {
		return repasswd;
	}

	public void setRepasswd(String repasswd) {
		this.repasswd = repasswd;
	}
}
