package webdeveloper_one.java;

import java.util.StringTokenizer;

public class StringTokenizer_1 {
	public static void main(String[] args) {
		// StringTokenizer : 토큰으로 구분해서 자른다.
		// Token: 식별자(구분자) - 공백(기본), /, \

		StringBuffer bu = new StringBuffer();

		bu.append("이름: 오다희 1");
		bu.append(" 나이: 10 1 1");
		bu.append(" 주소: 청주 1 1 1");

		System.out.println("============원래 값=============");
		System.out.println(bu.toString());
		
		System.out.println("============토큰 제거============");
		StringTokenizer token = new StringTokenizer(bu.toString());

		int num = 0;
		String strvalue = "";
		while (token.hasMoreElements()) { // hasMoreElements(): 변수 token이 끝날 때까지 반복
			strvalue = token.nextToken();
			
			System.out.println(strvalue);
			if(strvalue.equals("1")) {
				num += 1;
			}
		}
		System.out.println("=============================");
		System.out.println("1) 1의 개수: " + num);
		

		System.out.println("=============================");
		StringBuffer bu2 = new StringBuffer();

		bu2.append("이름: 오다희 1");
		bu2.append(" 나이: 10 1 1");
		bu2.append(" 주소: 청주 1 1 1");
		
		StringTokenizer token2 = new StringTokenizer(bu2.toString());
		num = 0;
		char chvalue;
		while (token2.hasMoreElements()) { // hasMoreElements(): 변수 token이 끝날 때까지 반복
			strvalue = token2.nextToken();
			for (int i = 0; i < strvalue.length(); i++) {
			chvalue = strvalue.charAt(i);
				if(chvalue == '1') {
					num++;					
				}
			} 
		}
		
		System.out.println("2) 10에 있는 1까지의 총 1의 개수: " + num);
		
	}
}
