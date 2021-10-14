package webdeveloper_one.java.child;

//interface: 추상이므로, 몸체가 없고 객체 생성을 할 수 없다.

//같은 추상(abstract)끼리는 상속을 받아도 몸체선언을 안해도 된다.
//class는 객체 생성이 되고 추상을 받게 되면 반드시 몸체선언을 해야한다.

//ctrl+shift+r
public abstract interface Basecommon {
	public void C501(String classname);

	public void C502(String classname);

	public void C503(String classname);

	// 인터페이스는 객체생성이 안되기 때문에 main을 생성해도 호출되지 않는다.
	// 따라서 main는 인터페이스에서 사용하지 않는다.
}
