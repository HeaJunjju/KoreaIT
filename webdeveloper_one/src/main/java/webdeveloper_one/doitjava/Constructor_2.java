package webdeveloper_one.doitjava;

public class Constructor_2 extends Parent_1 {

	public String name;
	
	public Constructor_2() {
		//기본생성자로 점프	
		//1. 첫줄만 출력하고
		this("이름");
		//3. 기본생성자로 돌아와서 출력
		System.out.println("기본생성자");
	}
	public Constructor_2(String name) {
		//부모에 있는 기본 생성자로 점프
		super();
		
		//2.아귀먼트 생성자로 갔다가
		System.out.println(name+" 기본생성자에서 점프한 생성자");
	}
	
	public void Upmethod() {
		super.Parentmethod();
		
		System.out.println("자식에 있는 Upmethod()");
	}
	
	@Override
	//@: 어노니테이션 Override 겹쳐썼다
	//override: 메소드이름(아귀먼트갯수, 아귀먼트 타입)->오버라이딩 아니면 오버로딩
	public void Overmethod() {
		System.out.println("자식에 있는 Overmethod()");
	}
	public static void main(String[] args) {
	
		Constructor_2 cst=new Constructor_2();
		
		cst.Upmethod();
		cst.Overmethod();
	}

}
