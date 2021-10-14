package webdeveloper_one.java.child;

public class C503 extends Koreanitfactory {
	public static void main(String[] args) {

//		Koreanit classroom = new C503();
//		classroom.Classroom("503", "java_B");

		// 네트워크, io, instance : 강제적으로 에러처리를 해주어야 함

		// Koreanit ko = (Koreanit)
		// Class.forName("webdeveloper_one.java.child.C503").newInstance();
		// ko.Classroom("503", "java_1");

		// for문 사용해서
		// 501 ~ 503
		// ko.Classroom("501", "java_1");
		// ko.Classroom("502", "java_2");
		// ko.Classroom("503", "java_3");

		// 검색이 되어야 한다.
		// 501, 502, 503
		try {
			String arr[] = { "webdeveloper_one.java.child.C501", "webdeveloper_one.java.child.C502",
					"webdeveloper_one.java.child.C503" };
			String classname;
			String classtype;

			for (int i = 0; i < arr.length; i++) {
				System.out.println("==============");
				Koreanit ko = (Koreanit) Class.forName(arr[i]).newInstance();
				ko.Classroom("50" + (i + 1), "java_" + (i + 1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
