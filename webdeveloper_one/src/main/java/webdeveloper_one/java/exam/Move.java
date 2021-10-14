package webdeveloper_one.java.exam;

//for, while, dowhile 의 메소드를 만드는데
// 1차원 배열 이용-> int intvalue[] = new int[max];

//각각 인자 start, max를 만들고 , 출력은 Print()에서 합을 출력
// for, while, dowhile 의 생성자를 만들고 start, max
// 생성자 안에서 합해서 출력
//for, while, dowhile  출력

public class Move {
	public int start = 0;
	public int max = 0;
	public int sum1 = 0;
	public int sum2 = 0;
	public int sum3 = 0;
	public int intvalue[];

	public Move() {

	}
	public Move(int start, int max, int sum1, int sum2, int sum3, int[] intvalue) {
		this.start = start;
		this.max = max;
		this.sum1 = sum1;
		this.sum2 = sum2;
		this.sum3 = sum3;
		this.intvalue = intvalue;
	}

	public void Print() {
		System.out.println("1) For 문 합: " + sum1);
		System.out.println("2) While 문 합: " + sum2);
		System.out.println("3) DoWhile 문 합: " + sum3);
	}

	public void For(int start, int max) { 
		intvalue = new int[max+1];
		//System.out.println(intvalue.length);
		for (int i = start; i < intvalue.length; i++) {  
			intvalue[i] = i; 
			System.out.println(intvalue[i]);
			sum1 += intvalue[i]; 
		}
	}

	public void While(int start, int max) {
		intvalue = new int[max+1];
		start -= 1;
		while (++start <= max) { 
			intvalue[start] = start;  
			sum2 += intvalue[start];  
		}
	}

	public void DoWhile(int start, int max) {
		intvalue = new int[max+1];
		do {
			intvalue[start] = start; 
			sum3 += intvalue[start];
			
		} while (++start <= max);
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getSum1() {
		return sum1;
	}

	public void setSum1(int sum1) {
		this.sum1 = sum1;
	}

	public int getSum2() {
		return sum2;
	}

	public void setSum2(int sum2) {
		this.sum2 = sum2;
	}

	public int getSum3() {
		return sum3;
	}

	public void setSum3(int sum3) {
		this.sum3 = sum3;
	}

	public int[] getIntvalue() {
		return intvalue;
	}

	public void setIntvalue(int[] intvalue) {
		this.intvalue = intvalue;
	}

	public static void main(String[] args) {
		Move move1 = new Move();

		move1.For(1, 18);
		move1.While(2, 8);
		move1.DoWhile(3, 6);

		move1.Print();
	} 
}
