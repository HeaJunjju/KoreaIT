package webdeveloper_one.doitjava;

public class Array_2 {

	public static void main(String[] args) {
		int array[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("============================");
		int array2[][]=new int[3][5];
		
		for (int i = 0, t=1; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++,t++) {
				array2[i][j]=t;
				System.out.print(array2[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("============================");
		
		//1~15값 입력, 출력
		//1행 3행을 뺀 합 출력
		int array3[][]=new int[3][5];
		int sum=0;
		
		for (int i = 0, t=1; i < array3.length; i++) {
			for (int j = 0; j < array3[i].length; j++,t++) {
				array3[i][j]=t;
				if(!(i==0 || i==2)) {
					sum+=array3[i][j];
					System.out.print(array3[i][j]+"\t");
				}
			}
			System.out.println();
		}
		System.out.println(sum);
		
		
		System.out.println("============================");
		

	}

}
