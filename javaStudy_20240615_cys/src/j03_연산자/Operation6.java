package j03_연산자;

public class Operation6 {

	public static void main(String[] args) {

		// 삼항 연산자
		int num = 1000;
		System.out.println(num < 100 ? 1 : 2);
		
		boolean result = num < 100 ? true : false;
		System.out.println(result);
		
		boolean pwCheck1 = true;
		boolean pwCheck2 = true;
		boolean pwCheck3 = false;
		boolean pwCheck4 = true;
		
		String pwResult = !pwCheck1 ? "8 ~ 16 확인필요"
						: !pwCheck2 ? "대문자 확인"
						: !pwCheck3 ? "소문자 확인"
						: !pwCheck4 ? "특수기호 확인"
						: "사용가능";
		
		System.out.println("pwResult: " + pwResult);
		System.out.println();
		
		
		/*
		 *  실습
		 *  score 라는 곳에 점수를 담아라
		 *  
		 *  점수에 따라 학점을 보여주는 로직을 작성해라
		 *  점수가 89점 초과 -> A학점
		 *  점수가 79점 초과 -> B학점
		 *  점수가 69점 초과 -> C학점
		 *  점수가 59점 초과 -> D학점
		 *  점수가 59점 이하 -> F학점
		 *  * 점수가 100점 초과 하거나 0점 미만일 경우 "계산불가"
		 */
		
		int score = 89;
		
		String scoreCheck = score > 100 || score < 0 ? "계산불가" 
							: score > 89 ? "A학점"
							: score > 79 ? "B학점"
							: score > 69 ? "C학점"
							: score > 59 ? "D학점"
							: "F학점";
		
		System.out.println("최종학점: " + scoreCheck);
		
		
	}

}
