package j07_반복;

public class While2 {

	public static void main(String[] args) {

		/*
		 * 홍길동1
		 * 홍길동2
		 * 홍길동3
		 * ...
		 * 홍길동10
		 */
		
		int i = 0;
		
		while (i < 10) {	// 반복횟수 작성
			int num = i + 1;
			System.out.println("홍길동" + num);
			i++;
		}
		
		
	}

}
