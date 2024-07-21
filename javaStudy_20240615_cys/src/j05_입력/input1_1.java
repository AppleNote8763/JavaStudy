
package j05_입력;

import java.util.Scanner;

public class input1_1 {

	public static void main(String[] args) {

		/*
		 * *8세이상이면 출입가능
		 * 어서오세요 워터파크입니다.
		 * 
		 * 이름을 입력하시오: 홍길동
		 * 나이를 입력하시오: 17
		 * 성별을 입력하시오(남자: 0, 여자:1): 1
		 * 
		 * 출력
		 * 어서오세요 홍길동님.
		 * 여자는 B게이트를 이용하시면 됩니다.
		 * 
		 * 
		 * 이름을 입력하시오: 홍길서
		 * 나이를 입력하시오: 5
		 * 성별을 입력하시오(남자: 0, 여자:1): 1
		 * 
		 * 출력
		 * 어서오세요 홍길서님.
		 * 8세 미만의 어린이는 이용이 불가능합니다.
		 * 
		 * 
		 * 이름을 입력하시오: 홍길남
		 * 나이를 입력하시오: 17
		 * 성별을 입력하시오(남자: 0, 여자:1): 0
		 * 
		 * 출력
		 * 어서오세요 홍길남님.
		 * 남자는 A게이트를 이용하시면 됩니다.
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		String name = null;
		int age = 0;
		int gender = 0;
		
		System.out.println("어서오세요 워터파크입니다.");
		
		System.out.print("이름을 입력하시오: ");
		name = scanner.next();
		System.out.print("나이를 입력하시오: ");
		age = scanner.nextInt();
		System.out.print("성별을 입력하시오(남자: 0, 여자:1): ");
		gender = scanner.nextInt();
		scanner.close();
		
		String ageGenderCheck = age < 8 ? "8세 미만의 어린이는 이용이 불가능합니다." 
							: gender == 0 ? "남자는 A게이트를 이용하시면 됩니다." 
							: gender == 1 ? "여자는 B게이트를 이용하시면 됩니다."
							: "올바르지 않은 입력입니다.";
		
		scanner.close();
		System.out.println("어서오세요 " + name + "님.");
		System.out.println(ageGenderCheck);
		
		
	}

}
