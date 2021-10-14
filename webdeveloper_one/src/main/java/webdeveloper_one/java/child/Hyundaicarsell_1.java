package webdeveloper_one.java.child;

public class Hyundaicarsell_1 implements Commoncar {
	@Override
	public void Carname(String name) {
		System.out.println("차 이름은: " + name);
	}

	@Override
	public void Carprise(String price) {
		System.out.println("차 가격은: " + price);
	}

	public static void main(String[] args) {
		// 비지니스 로직, 비지니스 : 업무
		// 현대 자동차 대리점 1에 손님 gv80 가격은

		Commoncar ccar = new Hyundaicarsell_1();

		ccar.Carname("gv80");
		ccar.Carprise("8000");
	}

}
