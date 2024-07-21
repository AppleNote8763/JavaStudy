package j08_메소드;

public class Method2 {

	// 반환(리턴값) 없고 매개변수도 없는 메소드
	public static void test1() {
		System.out.println("test1 메소드 호출");
	}
	
	// 반환 없고 매개변수가 하나인 메소드
	public static void test2(int num) {
		System.out.println("num: " + num);
		System.out.println("test2 메소드 호출");
	}
	
	// 반환 없고 매개변수가 두개인 메소드
	public static void test3(int age, String name) {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("test3 메소드 호출");
	}
	
	// 반환 있고 매개변수가 두개인 메소드
		public static String test4(int age, String name) {
			System.out.println("이름: " + name);
			System.out.println("나이: " + age);
			System.out.println("test4 메소드 호출");
			return name + age;
		}
	
		public static String sayHello(String hh) {
			return "hello";
		}
		
	public static void main(String[] args) {

		test1();
		System.out.println();
		
		test2(10);
		System.out.println();
		
		test3(18, "홍길동");
		System.out.println();
		
		String str = test4(18, "홍길동2");
		System.out.println();
		
		System.out.println(str);
		System.out.println();
		
		System.out.println(test4(20, "홍길서"));
		System.out.println();
		
		sayHello("hi1");
		
		
	}

}
