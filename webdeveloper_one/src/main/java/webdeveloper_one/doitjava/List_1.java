package webdeveloper_one.doitjava;

import java.util.ArrayList;

public class List_1 {

	public static void main(String[] args) {
		// 객체지향:
		// 한국it.5층.502

//		String array[] = { "1", "2", "3", "4", "5" };
//		int array2[] = { 1, 2, 3, 4, 5 };
//		
//		for(int i=0;i<array.length;i++) {
//			System.out.println(array[i]);
//		}
//		System.out.println("=====================");
//		for(int i=0;i<array2.length;i++) {
//			System.out.println(array2[i]);
//		}
		// add, set, put: java에서 값을 담는다
		// ArrayList: list 파생(자식)되는 모든 것들은 index 0부터 시작한다.
		// 요소(elements)에 검색을 값으로만 찾을 수 있다(이름으로 검색할 수 없다)
		ArrayList array = new ArrayList();
		//
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		array.add("아무개");

		// Object: interface x, class만 상속한다

		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}

		// index로 접근
//		array.remove(0);
//		array.remove(2);

		// 값으로 접근
		array.remove(new Integer(1));
		array.remove(new Integer(2));
		array.remove(new Integer(5));
		array.remove(new String("아무개"));
		System.out.println("======================");

		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}

		// 1부터 10까지 3, 6, 9를 뺀 합을 구하시오
		ArrayList<Integer> array2 = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			array2.add(i+1);
		}
		array2.remove(new Integer(3));
		array2.remove(new Integer(6));
		array2.remove(new Integer(9));
		
		int sum = 0;
		for (int i = 0; i < array2.size(); i++) {
			sum += array2.get(i);
		}

		System.out.println("3, 6, 9를 뺀 합: " + sum);

	}

}
