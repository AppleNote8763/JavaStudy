package j08_메소드;

public class Method3 {

	/*
	 * 메소드 오버로딩
	 * : 매개변수의 형태가 다르면 동일한 메소드명을 사용해서
	 *   메소드를 정의할수 있다.
	 */
	
	public static void test1() {
		System.out.println("매개변수가 없는 test1");
	}
	
	public static void test1(int num) {
		System.out.println("매개변수가 하나이고 정수인 test1");
	}
	
	public static void test1(String name, int num) {
		System.out.println("매개변수가 두개이고 문자열, 정수인 test1");
	}
	
	public static void main(String[] args) {

		test1();
		test1(10);
		test1("홍길동", 10);
		
	}

}
