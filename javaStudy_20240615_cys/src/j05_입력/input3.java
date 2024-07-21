package j05_입력;

import java.util.Scanner;

public class input3 {

	public static void main(String[] args) {

		/*
		 *										변수명
		 *	이름 : 홍길동	next()				name
		 *	나이 : 18		nextInt()			age
		 *	주소 : 부산 진구 전포동 nextLine()	address
		 *	연락처 : 010-1234-5678	next()		phone
		 *
		 *	출력
		 *	이름은 홍길동이고 나이는 18세 입니다.
		 *	주소지는 부산 진구 전포동 입니다.
		 *	연락처는 010-1234-5678 입니다.
		 *
		 */
		
		Scanner scanner = new Scanner(System.in);
		String name = null;
		int age = 0;
		String address = null;
		String phone = null;
		
		System.out.print("이름 : ");
		name = scanner.next();
		
		System.out.print("나이 : ");
		age = scanner.nextInt();
		
		// nextLine은 엔터키를 인식을 하여 가져오기 때문에 엔터키를 한번 먹어줄 nextLine를 한번더 사용
		address = scanner.nextLine();
		System.out.print("주소 : ");
		address = scanner.nextLine();
		
		System.out.print("연락처 : ");
		phone = scanner.next();
		
		scanner.close();
		
		System.out.println("이름은 " + name + "이고 나이는 " + age + "세 입니다.");
		System.out.println("주소지는 " + address + " 입니다.");
		System.out.println("연락처는 " + phone + " 입니다.");
		
		
		
	}

}
