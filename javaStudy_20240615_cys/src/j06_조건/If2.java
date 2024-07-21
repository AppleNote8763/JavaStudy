package j06_조건;

public class If2 {

	public static void main(String[] args) {

		int score = 85;
		String result = null;
		
		if(score < 0 || score > 100) {
			result = "계산불가";
			System.out.println("채점완료");
		}else if(score > 89) {
			result = "A";
			System.out.println("채점완료");
		}else if(score > 79) {
			result = "B";
			System.out.println("채점완료");
		}else if(score > 69) {
			result = "C";
			System.out.println("채점완료");
		}else if(score > 59) {
			result = "D";
			System.out.println("채점완료");
		}else {
			result = "F";
			System.out.println("채점완료");
		}
		
		System.out.println(result);
		
		
	}

}
