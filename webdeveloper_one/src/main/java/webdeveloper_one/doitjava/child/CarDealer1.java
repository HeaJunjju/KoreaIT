package webdeveloper_one.doitjava.child;

////현대차 타입
//interface Hyundai{
//	public String Car(String carname);
//}
////기아차 타입
//interface Kia{
//	public String Car(String carname);
//}
//
////삼성차가 새로 생겼다
////삼성타입
//interface Samsung{
//	public String Car(String carname);
//}


//삼성, 현대, 기아 대리점
//class는 하나만 상속받을 수 있다(Object 생략)
//interface는 상속받는 제한이 없다
public class CarDealer1 implements Hyundai, Kia, Samsung{

	public void Name() {
		System.out.println("InheritanceOfInterface_1 name");
	}
	
	@Override
	public String Car(String carname) {
		System.out.println(carname + "차입니다");
		return carname + "차";
	}
	
//	@Override
//	public String KCar() {
//		System.out.println("기아차입니다");
//		return "기아차";
//	}
//	
//	@Override
//	public String HCar() {
//		System.out.println("현대차입니다");
//		return "현대차";
//	}
//	
	public static void main(String[] args) {
		CarDealer1 ob = new CarDealer1();
		ob.Name();
//		System.out.println(ob.SCar());
//		ob.HCar();
//		ob.KCar();
		System.out.println(ob.Car("테슬라"));
		System.out.println(ob.Car("기아 Ev6"));
		System.out.println(ob.Car("현대 gv80"));
	}




}
