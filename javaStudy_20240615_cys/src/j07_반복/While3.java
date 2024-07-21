package j07_반복;

import java.util.Scanner;

public class While3 {

	public static void main(String[] args) {

		/*
		 * 반복 횟수: 2
		 * 
		 * i = 1
		 * i = 2
		 * 
		 * i = 2
		 * i = 1
		 * 
		 * 반복 횟수: 10
		 * 
		 * i = 1
		 * i = 2
		 * ...
		 * i = 10
		 * 
		 * i = 10
		 * i = 9
		 * ...
		 * i = 1
		 */
		
		Scanner scanner = new Scanner(System.in);
		boolean roop = true;
		
		while (roop) {
			int roopNum = 0;
			int i = 0;
			
			System.out.print("반복 횟수: "); 
			roopNum = scanner.nextInt();
			
			while (i < roopNum) {
				int j = i + 1;
				System.out.println("i = " + j);
				i++;
			}
			System.out.println();
			
			i = 0;
			while (i < roopNum) {
//				int j = roopNum - i;
//				System.out.println("i = " + j);
				System.out.println("i = " + (roopNum - i));
				i++;
			}
			
			System.out.println();
			
			if (roopNum == 0) {
				roop = false;
				scanner.close();
			}
			
		}
		
		
	}

}
