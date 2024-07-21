package j10_배열;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {

		// *배열 정적 메모리 할당
		
		// 정수 배열
		int[] number = new int[5];
		
		number[0] = 10;
		number[1] = 20;
//		number[5] = 30;
		
		System.out.println(number[0]);
		System.out.println(number[1]);
//		System.out.println(number[5]);
	
		
		// 문자열 배열
		String[] strArray = new String[5];
		strArray[3] = "hihi";
		System.out.println(strArray[3]);
		
		// 객체(데이터 + 기능) 배열
		Scanner[] scanners = new Scanner[3];
		
		scanners[0] = new Scanner(System.in);
		
		
		
	}

}
