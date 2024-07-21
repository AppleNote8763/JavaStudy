package j07_반복;

import java.util.Scanner;

public class DoubleWhile2 {

	public static void main(String[] args) {

		/*
		 * 10시
		 * 		1분
		 * 		2분
		 * 		3분
		 * 		...
		 * 		50분
		 * 
		 * 		10분 쉬는시간
		 * 		1분
		 * 		...
		 * 		10분
		 * 
		 * 11시
		 * 		1분
		 * 		2분
		 * 		3분
		 * 		...
		 * 		50분
		 * 
		 * 		10분 쉬는시간
		 * 		1분
		 * 		...
		 * 		10분
		 * 12시
		 * 		...
		 * 13시
		 * 		점심식사를 하시겠습니까? 네
		 * 		1분
		 * 		...
		 * 		50분
		 * 		10분 쉬는시간
		 * 		1분
		 * 		...
		 * 		10분
		 * ...
		 * 18시
		 * 		오늘 예상 잔업 시간: 3
		 * 		저녁 식사를 하시겠습니까? 네
		 * 		1분
		 * 		...
		 * 		50분
		 * 		10분 쉬는시간
		 * 		1분
		 * 		...
		 * 		10분
		 * ...
		 * 22시
		 * 		1분
		 * 		...
		 * 		50분
		 * 		퇴근하십시오
		 * 		식대지원: 20000원
		 */
		
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		int lastTime = 9;
		int overtime = 0;
		String lunch = null;
		String dinner = null;
		int rice = 0;
		
		while(i < lastTime) {
			System.out.println(i + 10 + "시");
			
			if (i < 3) {
				int j =0;
				while (j < 60) {
					if (j < 50) {
						System.out.println("\t" + (j+1) + "분");
					}else if (j == 50) {
						System.out.println("\t10분 쉬는시간");
						System.out.println("\t" + (j-49) + "분");
					}else {
						System.out.println("\t" + (j-49) + "분");
					}
					j++;
				}
			}else if (i == 3) {
				int j =0;
				System.out.print("점심식사를 하시겠습니까? (네, 아니오)");
				lunch = scanner.nextLine();
				if (lunch.equals("네")) {
					rice++;
					while (j < 60) {
						if (j < 50) {
							System.out.println("\t" + (j+1) + "분");
						}else if (j == 50) {
							System.out.println("\t10분 쉬는시간");
							System.out.println("\t" + (j-49) + "분");
						}else {
							System.out.println("\t" + (j-49) + "분");
						}
						j++;
					}
				}else {
					while (j < 60) {
						if (j < 50) {
							System.out.println("\t" + (j+1) + "분");
						}else if (j == 50) {
							System.out.println("\t10분 쉬는시간");
							System.out.println("\t" + (j-49) + "분");
						}else {
							System.out.println("\t" + (j-49) + "분");
						}
						j++;
					}
				}
			}else if (i < 8) {
				int j = 0;
				while (j < 60) {
					if (j < 50) {
						System.out.println("\t" + (j+1) + "분");
					}else if (j == 50) {
						System.out.println("\t10분 쉬는시간");
						System.out.println("\t" + (j-49) + "분");
					}else {
						System.out.println("\t" + (j-49) + "분");
					}
					j++;
				}
			}else if (i == 8) {
				System.out.print("\t오늘 예상 잔업시간: ");
				overtime = scanner.nextInt();
				if (overtime == 0) {
					System.out.println("\t퇴근하십시오");
					scanner.close();
				}else {
					lastTime += overtime;
					int j =0;
					scanner.nextLine();
					System.out.print("저녁식사를 하시겠습니까? (네, 아니오)");
					dinner = scanner.nextLine();
					if(dinner.equals("네")) {
						rice++;
						System.out.println(rice);
						while (j < 60) {
							if (j < 50) {
								System.out.println("\t" + (j+1) + "분");
							}else if (j == 50) {
								System.out.println("\t10분 쉬는시간");
								System.out.println("\t" + (j-49) + "분");
							}else {
								System.out.println("\t" + (j-49) + "분");
							}
							j++;
						}
					}else {
						while (j < 60) {
							if (j < 50) {
								System.out.println("\t" + (j+1) + "분");
							}else if (j == 50) {
								System.out.println("\t10분 쉬는시간");
								System.out.println("\t" + (j-49) + "분");
							}else {
								System.out.println("\t" + (j-49) + "분");
							}
							j++;
						}
					}
				}
			}else if (i < (lastTime - 1)) {
				int j = 0;
				while (j < 60) {
					if (j < 50) {
						System.out.println("\t" + (j+1) + "분");
					}else if (j == 50) {
						System.out.println("\t10분 쉬는시간");
						System.out.println("\t" + (j-49) + "분");
					}else {
						System.out.println("\t" + (j-49) + "분");
					}
					j++;
				}
			}else if (i == (lastTime - 1)) {
				int j = 0;
				while (j < 51) {
					if (j < 50) {
						System.out.println("\t" + (j+1) + "분");
					}else if (j == 50) {
						System.out.println("퇴근하십시오");
						System.out.println("식대지원: " + (rice * 10000));
						scanner.close();
					}
					j++;
				}
			}
			
			
			i++;
		}
		
	}

}
