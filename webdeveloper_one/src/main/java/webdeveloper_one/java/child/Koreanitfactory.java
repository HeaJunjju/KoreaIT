package webdeveloper_one.java.child;

//추상클래스: 추상이므로 객체 생성을 할 수 없다.
//몸체구현은 가능하다.
//인터페이스를 추상클래스에서 상속을 받으면, 몸체 구현을 안해주어도 된다.
//class(front) <-> abstract class(factory) <-> interface(command)

public abstract class Koreanitfactory implements Koreanit {

	public String classname;
	public String classtype;

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public String getClasstype() {
		return classtype;
	}

	public void setClasstype(String classtype) {
		this.classtype = classtype;
	}

	@Override
	public void Classroom(String classname, String classtype) {
		System.out.println("클래스 이름은: " + classname);
		System.out.println("클래스 타입은: " + classtype);

	}

	public static void main(String[] args) {
		// abstract(추상): 객체 생성 x
		// koreanitfactory ko = new koreanitfactory();
	}
}
