package j07_반복;

import java.util.Scanner;

public class While4 {

	public static void main(String[] args) {

		/*
		 * 카페 키오스크
		 * 어서오세요  코리아 it 카페입니다
		 * 
		 * 주문하실 음료를 선택해주세요(1. 아메리카노, 2.라떼, 3. 그린티): 1
		 * 음료의 갯수를 입력하시오: 3
		 * 
		 * 추가 주문하시겠습니까?(1. 네, 2. 아니요): 1
		 * 
		 * 주문하실 음료를 선택해주세요(1. 아메리카노, 2.라떼, 3. 그린티): 2
		 * 음료의 갯수를 입력하시오: 1
		 * 
		 * 추가 주문하시겠습니까?(1. 네, 2. 아니요): 2
		 * 
		 * 아메리카노 나왔습니다.
		 * 아메리카노 나왔습니다.
		 * 아메리카노 나왔습니다.
		 * 
		 * 라떼 나왔습니다.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		boolean order = true;
		int menu = 0;
		int addMenuCkeck = 0;
		int americanoCount = 0;
		int latteCount = 0;
		int greenteaCount = 0;
		int i = 0;
		
		System.out.println("어서오세요  코리아 it 카페입니다");
		
		
		while (order) {
			System.out.print("주문하실 음료를 선택해주세요(1. 아메리카노, 2.라떼, 3. 그린티): ");
			menu = scanner.nextInt();
			
			System.out.print("음료의 갯수를 입력하시오: ");
			if (menu == 1) {
				americanoCount += scanner.nextInt();
			}else if (menu == 2) {
				latteCount += scanner.nextInt();
			}else if (menu == 3) {
				greenteaCount += scanner.nextInt();
			}
			
			System.out.print("추가 주문하시겠습니까?(1. 네, 2. 아니요): ");
			addMenuCkeck = scanner.nextInt();
			
			if (addMenuCkeck == 2) {
				order = false;
				scanner.close();
			}
			
			
		}
		
		i = 0;
		while (i < americanoCount) {
			System.out.println("아메리카노 나왔습니다.");
			i++;
		}
		i = 0;
		while (i < latteCount) {
			System.out.println("라떼 나왔습니다.");
			i++;
		}
		i = 0;
		while (i < greenteaCount) {
			System.out.println("그린티 나왔습니다.");
			i++;
		}
		
		
	}

}
