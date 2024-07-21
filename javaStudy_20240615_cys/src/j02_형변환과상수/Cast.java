package j02_형변환과상수;

public class Cast {

	public static void main(String[] args) {
		
		// 기본 자료형의 형변환
		// 묵시적 형변환(업캐스팅)
		
		char a = 'A';
		int b = a;
		double c = b;
		double k = a;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("k = " + k);
		
		
		// 명시적 형변환(다운캐스팅)
		//int d = c; 는 안됨 c앞에(자료형)을 적어야함
		
		int d = (int)c;
		char e = (char)d;
		
		System.out.println("d = " + d);
		System.out.println("e = " + e);
		

	}

}
