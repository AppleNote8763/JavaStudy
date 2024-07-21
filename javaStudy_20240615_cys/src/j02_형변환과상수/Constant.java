package j02_형변환과상수;

public class Constant {

	public static void main(String[] args) {
		
		// 상수값을 지정시 자료형 앞에 final을 붙임 변수명을 대문자로 표현
		
		final int MAX_NUMBER = 100;
		final int MIN_NUMBER = 0;
		
		int num = 10;
		
		num = 50;
		num = 60;
		
		System.out.println("최대값 : " + MAX_NUMBER);
		System.out.println("최소값 : " + MIN_NUMBER);
		System.out.println("현재값 : " + num);
		
		
	}

}
