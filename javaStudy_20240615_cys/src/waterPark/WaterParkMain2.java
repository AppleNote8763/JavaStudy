package waterPark;

import java.util.Iterator;
import java.util.Scanner;

public class WaterParkMain2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String code = null;
		int gender;
		String name;
		int age;
		
		int maleCode = 20240001;
		int feMaleCode = 20240001;
		
		System.out.println("어서오세요 캘리포니아 비치입니다.");
		System.out.print("총 인원을 입력하시오");
		int peopleNum = scanner.nextInt();
		
		Residents[] residents = new Residents[peopleNum];
		for (int i = 0; i < peopleNum; i++) {
			System.out.print("성별(남1, 여2): ");
			gender = scanner.nextInt();
			
			scanner.nextLine();
			System.out.print("이름: ");
			name = scanner.nextLine();
			
			System.out.print("나이 ");
			age = scanner.nextInt();
			
			if (gender == 1) {
				code = "M" + maleCode;
				maleCode++;
			}else if (gender == 2) {
				code = "F" + feMaleCode;
				feMaleCode++;
			}
			residents[i] = age > 13 ? new Adults(code, gender, name, age)
									: new Kids(code, gender, name, age);
		}
		
		
		String inputCode = null;
		int wishRide = 0;
		while (true) {
			System.out.print("고유번호를 입력하시오: ");
			scanner.nextLine();
			inputCode = scanner.nextLine();
			
			for(int i =0; i < peopleNum; i++) {
				if (residents[i] instanceof Adults) {
					if(((Adults)residents[i]).getCode().equals(inputCode)) {
						System.out.println("타고자 하는 놀이기루를 입력하시오(1. A, 2. B, 3. C): ");
						wishRide = scanner.nextInt();
					}
				}else if (residents[i] instanceof Kids) {
					if (((Kids)residents[i]).getCode().equals(inputCode)) {
						System.out.println("타고자 하는 놀이기루를 입력하시오(1. A, 2. B, 3. C): ");
						wishRide = scanner.nextInt();
					}
				}else {
					System.out.println("발급되지 않은 이용자 입니다.");
				}
				
				if (wishRide == 1) {
					residents[i].rideA();
				}else if (wishRide == 2) {
					residents[i].rideB();
				}else if (wishRide == 3) {
					if (residents[i] instanceof Kids) {
						((Kids)residents[i]).rideC();
					}else {
						System.out.println("이용할 수 없는 연령입니다.");
					}
				}else {
					System.out.println("지원하지 않는 놀이기구 입니다.");
				}
				
			}
				
		}
		
		
	}

}
