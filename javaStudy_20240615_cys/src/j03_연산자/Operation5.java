package j03_연산자;

public class Operation5 {

	public static void main(String[] args) {

		boolean finalCheck = false;
		
		// 비밀번호 길이 (8 ~ 16)
		int pwLength = 10;
		
		// 대문자, 소문자, 연속된 숫자 확인
		boolean pwCheck1 = true;
		boolean pwCheck2 = true;
		boolean pwCheck3 = false;
		
		// 특수기호 확인 (!, @, #, $)
		boolean containSymbol1 = true;
		boolean containSymbol2 = false;
		boolean containSymbol3 = false;
		boolean containSymbol4 = false;
		
		// 관계연산자 잘 활용해서 최종 결과값 출력
		
		boolean finalPwLength = pwLength > 7 && pwLength < 17;
		System.out.println("길이 체크 : " + finalPwLength);
		
		boolean finalPwCheck = pwCheck1 && pwCheck2 && pwCheck3;
		System.out.println("대소문자 연속숫자 체크 : " + finalPwCheck);
		
		boolean finalContainSymbol = containSymbol1 || containSymbol2 || containSymbol3 || containSymbol4;
		System.out.println("특수기호 포함 체크 : " + finalContainSymbol);
		
		finalCheck = finalPwLength && finalPwCheck && finalContainSymbol;
		System.out.println("최종 비밀번호결과 : " + finalCheck);

		finalCheck = (pwLength > 7 && pwLength < 17) 
					&& (pwCheck1 && pwCheck2 && pwCheck3) 
					&& (containSymbol1 || containSymbol2 || containSymbol3 || containSymbol4);
		System.out.println("최종 비밀번호결과 : " + finalCheck);
	
		
	}

}
