package j05_입력;

import java.util.Scanner;

public class input2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String name = null;
		int age = 0;
		
		System.out.print("이름을 한글과 영어로 작성하시오(띄어쓰기로 구분): ");
		name = scanner.nextLine();
		System.out.print("나이를 입력하시오: ");
		age = scanner.nextInt();
		scanner.close();
		
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		
		
	}

}
