package j03_연산자;

public class Operation4 {

	public static void main(String[] args) {

		// 관계연산자
		System.out.println(10 > 5);
		
		boolean result = 10 > 5;
		System.out.println("result : "+ result);
		
		boolean result2 = 10 == 5;
		System.out.println("result2 : "+ result2);
		
		boolean result3 = 10 != 5;
		System.out.println("result3 : "+ result3);
		
		// 기준은 무조건 왼쪽 변수는 무조건 왼쪽에 작성
		int num = 10;
		System.out.println(num > 10);
		System.out.println();
		
		
		/*
		 * 논리 연산 : boolean끼리 연산하는것
		 * 
		 * AND 연산(%%) - 곱
		 * true $$ true => true
		 * true $$ false => false
		 * false $$ false => false
		 * 
		 * OR 연산(||) - 합
		 * true || true => true
		 * true || false => true
		 * false || false => false
		 * 
		 * NOT 연산
		 * !true => false
		 * !false => true
		 * 
		 */
		
		
		boolean pwCheck1 = true;
		boolean pwCheck2 = true;
		boolean pwCheck3 = false;
		boolean pwCheck4 = true;
		System.out.print("pwCheck1 && pwCheck2 && pwCheck3 && pwCheck4 = ");
		System.out.println(pwCheck1 && pwCheck2 && pwCheck3 && pwCheck4);
		
		boolean pwCheck11 = true;
		boolean pwCheck22 = true;
		boolean pwCheck33 = false;
		boolean pwCheck44 = true;
		System.out.print("pwCheck11 || pwCheck22 || pwCheck33 || pwCheck44 = ");
		System.out.println(pwCheck11 || pwCheck22 || pwCheck33 || pwCheck44);
		
		
	}

}
