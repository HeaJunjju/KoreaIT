package webdeveloper_one.doitjava.child;

public class CarManager {

	public static void main(String[] args) {
		//현대, 기아, 삼성
		CarDealer1 car1 = new CarDealer1();
		car1.Car("현대");
		car1.Car("기아");
		car1.Car("삼성");
		
		//삼성, 현대
		CarDealer2 car2 = new CarDealer2();
		car2.Car("현대");
		car2.Car("삼성");
		
		CommandCar common = new CarDealer1();
		common.Car("현대");
		common.Car("기아");
		common.Car("삼성");
		
		CommandCar common2 = new CarDealer2();
		common2.Car("현대");
		common2.Car("삼성");
		
		//java io, network, new, new instance -> Exception
		
		//대리점이 천개면 천번 돌릴 수 있음
		try {
			//서울 대리점
			//서울 총판 02
			//List: 요소(element) 검색하는데 이름으로 검색이 안됨 0 1 2 ...
			//Hash: 이름이 있다. 강원도 대리점1, 강원도 대리점2, .... Hash - key, value 1:1매칭
			
			for(int i=1;i<=2;i++) {
				CommandCar commoncar = (CommandCar) Class.forName("webdeveloper_one.doitjava.child.CarDealer"+i).newInstance();
				System.out.println(commoncar.Car(i + "대리점 삼성 기아 현대 판매"));
			}
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
