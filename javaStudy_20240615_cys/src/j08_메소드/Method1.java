package j08_메소드;

public class Method1 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;
		
		// 더하기를 해주는 함수
		int sum = add(num1, num2);	// num1, num2 인수
		System.out.println("두 수의 합: " + sum);
		
	}
	
	public static int add(int n1, int n2) {	// n1, n2 매개변수
		int result = n1 + n2;
		return result;
	}

}
