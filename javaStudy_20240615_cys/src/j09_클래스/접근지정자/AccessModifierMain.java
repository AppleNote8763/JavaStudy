package j09_클래스.접근지정자;

import j09_클래스.접근지정자.a.TestA_2;
import j09_클래스.접근지정자.b.TestB;

public class AccessModifierMain {

	public static void main(String[] args) {

		TestA_2 testA_2 = new TestA_2();
		// 접근 지정자를 따로 명시하지 않으면 default로 선언
//		testA_2.ta2 = 10;		// TestA_2.java 클래스에 ta2가 public int ta2;가 아닌 그냥 int ta2; 면 오류
		
		testA_2.testA2();
		
		TestB testB = new TestB();
		
		System.out.println(testB.getTb());
		
		
	}

}
