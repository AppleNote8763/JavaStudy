package j07_반복;

import java.util.Scanner;

public class DouleWhile3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int i = 0;
		int rice = 0;
		
		while (i < 8) {
			int clock = i + 10;
			System.out.println(clock + "시");
			
			if (i == 3) {
				System.out.print("\t점심 식사를 하시겠습니까?(네, 아니오): ");
				if(scanner.nextLine().equals("네")) rice++;
				
				System.out.println(rice);
			}
			
			int j = 0;
			while(j < 60) {
				int time = j + 1;
				if(j < 50) {
					System.out.println("\t" + time + "분");
				}else {
					if (j == 50) System.out.println("\t10분쉬는시간");
					System.out.println("\t" + (time -50) + "분");
				}
				j++;
			}
			
			
			if (i == 7) {
				int plusNum = 0;
				int realPlusNum = 0;
				String dinner = null;
				int finish = 0;
				while (true) {
					System.out.println((plusNum + 18) + "시");
					if (plusNum == 0) {
						System.out.print("\t오늘 예상 잔업 시간:");
						realPlusNum = scanner.nextInt();
						scanner.nextLine();
						System.out.print("\t저녁 식사를 하시겠습니까?");
						dinner = scanner.nextLine();
						if(dinner.equals("네")) {
							rice++;
							realPlusNum++;
						}
					}
					
					int k = 0;
					while(k < 60) {
						int time = k + 1;
						if(k < 50) {
							System.out.println("\t" + time + "분");
						}else {
							if (k == 50 && realPlusNum != 0) System.out.println("\t10분쉬는시간");
							System.out.println("\t" + (time -50) + "분");
						}
						k++;
					}
					
					finish = realPlusNum--;
					
					if(finish == 0) break;
					plusNum++;
					
				}
			}
			i++;
			
		}
		
		System.out.println("퇴근하십시오");
		System.out.println("식대지원: " + (rice * 10000));
		scanner.close();
	}

}
