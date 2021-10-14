package webdeveloper_one.doitjava.child;

public class Finalparent_1 {
	public String name = "전역이름";
	
	public final String getName() {	//final 걸면 수정은 안되도 가져다가 쓸 수는 있음(호출가능)
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
