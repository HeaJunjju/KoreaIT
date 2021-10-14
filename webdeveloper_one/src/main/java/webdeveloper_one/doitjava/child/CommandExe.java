package webdeveloper_one.doitjava.child;

public class CommandExe implements ChildCommand {

	@Override
	public String SellCar() {
		System.out.println("대리점에서 파는 차 종류");
		return "삼성차";
	}
	
	@Override
	public void CarNumber() {
		System.out.println("대리점 차량보유량");
	}
	
	public static void main(String[] args) {
		CommandExe command = new CommandExe();
		System.out.println(command.SellCar());
		command.CarNumber();
	}

}
