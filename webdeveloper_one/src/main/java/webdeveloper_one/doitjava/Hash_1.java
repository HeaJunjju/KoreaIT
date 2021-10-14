package webdeveloper_one.doitjava;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Hash_1 {

	public static void main(String[] args) {

		HashMap hash = new HashMap();
		
		//key(Object), value(Object)
		hash.put(1, 1);
		hash.put(2, 2);
		hash.put(3, 3);
		hash.put(4, 4);
		hash.put(5, 5);
		
		for(int i=0;i<hash.size();i++) {
			int intvalue = (int)hash.get(i+1);
			
			System.out.println(intvalue);
		}
		
		System.out.println("================");
		
		hash.clear();
		hash.put(1, "1");
		hash.put(2, "2");
		
		for(int i=1;i<=hash.size();i++) {
			String strvalue = hash.get(i).toString();
			
			System.out.println(strvalue);
		}
		
		System.out.println("================");
		
		hash.clear();
		hash.put("김혜준", "김혜준");
		hash.put("홍길동", "홍길동");
		hash.put("아무개", "아무개");
		
		//값을 출력하세요
		Collection coll = hash.values();
		Object[] arr = coll.toArray();
		for(int i=0;i<arr.length;i++) {
			String strvalue = (String)arr[i];
			System.out.println(strvalue);
		}
		
		//키와 값이 일치 -> 키를 찾으면 값이 나와야한다
		System.out.println("=================");
		
		Set set = hash.keySet();
		Object[] obj = set.toArray();
		for(int i=0;i<obj.length;i++) {
			System.out.println("key: "+obj[i] + " value: " + hash.get(obj[i]));
		}
	}

}
