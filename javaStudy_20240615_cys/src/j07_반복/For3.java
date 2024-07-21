package j07_반복;

import java.util.Scanner;

public class For3 {

	public static void main(String[] args) {

		/*
		 * 주소를 입력하시오 : 부산광역시 진구 전포대로 (1311호)
		 * 
		 * 부
		 * 산
		 * 광
		 * 역
		 * 시
		 * 진
		 * 구
		 * 전
		 * 포
		 * 대
		 * 로
		 * (
		 * 1
		 * 3
		 * 1
		 * 1
		 * 호
		 * )
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		String address = null;
		
		System.out.print("주소를 입력하시오 : ");
		address = scanner.nextLine();
		System.out.println(address);
		
		for (int i = 0; i < address.length(); i++) {
			String str = address.substring(i, i+1);
			
			if(str.equals(" ")) continue;
			
			System.out.println(str);
			
		}
		
		scanner.close();
		
	}

}
