package j10_배열;

public class Array3 {

	public static void main(String[] args) {

		/*
		 * 홍길동 3 88.2
		 * 홍길서 2 54.3
		 * 홍길남 1 90.2
		 * 홍길북 3 90.5
		 * 홍길중 2 77.4
		 * 
		 * names, studentYear, scores
		 * 
		 * 홍길동학생 3학년 88.2점
		 * 홍길서학생 2학년 54.3점
		 * ...
		 * 홍길중학생 2학년 77.4점
		 * 
		 */
		
		String[] names = {"홍길동", "홍길서", "홍길남", "홍길북", "홍길중"};
		int[] studentYear = {3, 2, 1, 3, 2};
		double[] scores = {88.2, 54.3, 90.2, 90.5, 77.4};
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + "학생 " + studentYear[i] + "학년 " + scores[i] + "점");
		}
		
		
	}

}
