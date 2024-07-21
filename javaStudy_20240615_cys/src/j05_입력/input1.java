package j05_입력;

import java.util.Scanner;

public class input1 {

	public static void main(String[] args) {

		// Scanner 입력을 받을때 사용
		// next 문자열 입력을 받음 띄어쓰기 이후로는 받지못함
		// nextInt 정수를 입력받음
		Scanner scanner = new Scanner(System.in);
		//System.out.println(scanner.next());
		
		
//		System.out.print("이름을 입력하시오: "); 
//		String name = scanner.next();
//		System.out.print("나이를 입력하시오: "); 
//		int age = scanner.nextInt();
//		  
//		scanner.close();
//		System.out.println("이름: " + name);
//		System.out.println("나이: " + age);
		 
		// next는 띄어쓰기를 허용하지 않음
		System.out.println(scanner.next());
		scanner.close();
		
		
	}

}
