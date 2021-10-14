package webdeveloper_one.doitjava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

// database(oracle, mysql, mssql, db2, pgsql, mongodb(nosql)) -> jdbc -> new List_4(userid, passwd) -> list -> hash -> board


public class List_4 {
	public String userid;
	public String passwd;

	public List_4() {

	}

	public List_4(String userid, String passwd) {
		this.userid = userid;
		this.passwd = passwd;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public static void main(String[] args) {
		//list: index 0부터 시작 0부터 접근

		ArrayList array = new ArrayList();
		for (int i = 0; i < 10; i++) {
			array.add(i);
		}

		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
		
		array.clear();
		List_4 userlist = new List_4("userid", "1234");
		array.add(userlist);
		for(int i=0;i<array.size();i++) {
			List_4 userlist2 = (List_4) array.get(i);
			System.out.println(userlist2.getUserid());
			System.out.println(userlist2.getPasswd());
		}
		
		//hash: key value  -> 1:1 매칭 -< 속도가 가장 빠르다
		//mybatis, ibatis ->sql, query
		LinkedHashMap link = new LinkedHashMap();
		//key(Object), value(Object)
		//list: 값에 대한 키 이름 없다
		//데이터: 값에 대해 검색해서 찾는다(full index) -> 전체검색
		//hash -> 키가 있으면 값을 찾는다 -> 대리점 -> 서울 총판 대리점
		//put("서울총판"ㅣ 대리점 값들);
		//put("경기도총판"ㅣ 대리점 값들);
		
		for (int i = 1; i <= 10; i++) {
			link.put(i,  i);
		}
		
		for(int i=1;i<=link.size();i++) {
			System.out.println(link.get(i));
		}
//		link.put(userlist, link);
		
		link.clear();
		
		List_4 userlist3 = new List_4("userid", "passwd");
		List_4 userlist4 = new List_4("userid2", "passwd2");
		List_4 userlist5 = new List_4("userid3", "passwd3");
		List_4 userlist6 = new List_4("userid4", "passwd4");
		link.put(1, userlist3);
		link.put(2, userlist4);
		link.put(3, userlist5);
		link.put(4, userlist6);
		
		//공통코드: 공통적으로 쓸 수 있는 패키지 -> 자동업무로직
		//mvc1: model -> 비즈니스로직 | controller -> 리모콘(servlet page action) | view -> front(*.jsp, *.html, *.htm, *.php, *.asp, *.aspx)
		for(int i=1;i<=link.size();i++) {
			List_4 listarray = (List_4) link.get(i);
			
			System.out.println(listarray.getUserid());
			System.out.println(listarray.getPasswd());
		}
		
	}

}
