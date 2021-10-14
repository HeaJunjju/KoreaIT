package webdeveloper_one.doitjava.present;

import java.util.Date;

public class StudentBean {
	private int studentNumber;
	private String name;
	private int age;
	private String address;
	private String email;
	private String phone;
	private Date startCheck;
	private Date endCheck;
	private int todayq;
	private int weekq;
	private int mprojectq;
	private int projectq;
	private String position;
	private int positionpoint;

	public StudentBean() {
		// TODO Auto-generated constructor stub
	}

	public StudentBean(int studentNumber, String name, int age, String address, String email, String phone, Date startCheck, Date endCheck,
			int todayq, int weekq, int mprojectq, int projectq, String position, int positionpoint) {
		this.studentNumber = studentNumber;
		this.name = name;
		this.age = age;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.startCheck = startCheck;
		this.endCheck = endCheck;
		this.todayq = todayq;
		this.weekq = weekq;
		this.mprojectq = mprojectq;
		this.projectq = projectq;
		this.position = position;
		this.positionpoint = positionpoint;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getStartCheck() {
		return startCheck;
	}

	public void setStartCheck(Date startCheck) {
		this.startCheck = startCheck;
	}

	public Date getEndCheck() {
		return endCheck;
	}

	public void setEndCheck(Date endCheck) {
		this.endCheck = endCheck;
	}

	public int getTodayq() {
		return todayq;
	}

	public void setTodayq(int todayq) {
		this.todayq = todayq;
	}

	public int getWeekq() {
		return weekq;
	}

	public void setWeekq(int weekq) {
		this.weekq = weekq;
	}

	public int getMprojectq() {
		return mprojectq;
	}

	public void setMprojectq(int mprojectq) {
		this.mprojectq = mprojectq;
	}

	public int getProjectq() {
		return projectq;
	}

	public void setProjectq(int projectq) {
		this.projectq = projectq;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getPositionpoint() {
		return positionpoint;
	}

	public void setPositionpoint(int positionpoint) {
		this.positionpoint = positionpoint;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return studentNumber + "\t\t" + name + "\t" + age + "\t\t" + address + "\t\t" + email + "\t\t" + phone + "\t\t" + startCheck + "\t\t" + endCheck
				+ "\t\t" + todayq + "\t\t\t" + weekq + "\t\t\t" + mprojectq + "\t\t\t\t" + projectq + "\t\t\t" + position + "\t\t"
				+ positionpoint;
	}

	public String fileForm() {
		// TODO Auto-generated method stub
		return "학생번호: "+studentNumber + " 이름: " + name + " 나이: " + age + " 주소: " + address + " 이메일: " + email + " 폰번호: " + phone + " 입실시간: " + startCheck + " 퇴실시간: " + endCheck
				+ " 일일점수: " + todayq + " 주간점수: " + weekq + " 미니프로젝트: " + mprojectq + " 프로젝트: " + projectq + " 직위: " + position + " 직위점수: "
				+ positionpoint;
	}

}
