package test;

class MyMath {
	
	int add(int a, int b) {
		return a + b;
	}
	
	// 1. 매개 변수의 타입이 다를 때
	double add(double a, double b) {
		return a + b;
	}
	
	//2. 매개변수의 개수가 다를 때
	int add(int a) {
		return a + 5;
	}
	
	//3. 매개변수의 타입의 조합이 다를때
	double add(int a, double b) {
		return a + b;
	}
	double add(double a, int b) {
		return a + b;
	}
	
	// 반환 타입만 다를 땐 불가능
//	double add(int a, int b) {
//		return a + b;
//	}
	
	// 매개변수의 이름만 다를 땐 불가능
//	int add(int x, int y) {
//		return x + y;
//	}
	
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
