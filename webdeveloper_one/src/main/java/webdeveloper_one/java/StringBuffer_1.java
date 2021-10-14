package webdeveloper_one.java;

public class StringBuffer_1 {
	public static void main(String[] args) {
		StringBuffer bu = new StringBuffer();

		bu.append("이름: 오다희 1");
		bu.append(" 나이: 10 1");
		bu.append(" 주소: 청주 1 1 1");

		// System.out.println(bu.toString());

		// 1의 개수 구하기(총 4개 출력되어야 함)
		// System.out.println(bu.indexOf("1")); -> 출력이 이상하게 됨.

		int num = 0;
		for (int i = 0; i < bu.length(); i++) {
			String strvalue = String.valueOf(bu.charAt(i));
			if (strvalue.equals("1")) {
				num += 1;
			}
		}
		System.out.println("1 의 총 개수: " + num + "개");
	}
}
