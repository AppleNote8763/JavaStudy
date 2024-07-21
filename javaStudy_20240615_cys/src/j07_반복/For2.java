package j07_반복;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {

		/*
		 * 구구단
		 * 원하시는 단수를 입력하시오: 3
		 * 
		 * 3 x 1 = 3
		 * 3 x 2 = 6
		 * ...
		 * 3 x 9 = 27
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("구구단");
		
		
		while (true) {
			System.out.print("원하시는 단수를 입력하시오(0. 종료): ");
			num1 = scanner.nextInt();
			
			if(num1 > 0) {
				for(int i = 0; i < 9; i++) {
					num2 = i + 1;
					System.out.println(num1 + "X" + num2 + "=" + num1*num2);
				}
			}else if(num1 == 0) {
				scanner.close();
				break;
			}else {
				System.out.println("음수는 안됩니다.");
			}
			
		}
		
		
		
		
		
	}

}
