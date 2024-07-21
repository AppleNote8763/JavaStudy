package WaterPrak_T;

import java.util.Scanner;

public class WaterParkMain_T {

	public static void main(String[] args) {
		
		/*
		 * 워터파크 키오스크
		 * 
		 * 어서오세요 캘리포니아비치입니다~
		 * 
		 * 1. 현장구매
		 * 2. 온라인 티켓 발권
		 * 3. 렌탈
		 * 4. 팔찌 충전
		 * 
		 * 원하시는 상품을 입력하시오: 1
		 * 
		 * 예약일을 선택하시오: (1. 주중, 2. 주말): 1
		 * (
		 * 예약일을 선택하시오: (1. 주중, 2. 주말): 2
		 * 원하시는 상품을 입력하시오(1. 종일권, 2. 14시간권): 1
		 * )
		 * 예약인원을 입력하시오(소인): 2
		 * 예약인원을 입력하시오(대인): 2
		 * 
		 * 제휴항목을 입력하시오(1. 삼성카드(10%) 2. 신한카드(15%) 3. 통신사(인원당 3,000원 할인)): 1
		 * 
		 * 지역민 할인_전체금액의 5% 할인(거주 지역을 입력하시오): 경주
		 * 총 결제금액에서 5% 할인 되었습니다.
		 * (
		 * 지역민 할인_전체금액의 5% 할인(거주 지역을 입력하시오): 부산
		 * 할인을 지원하지 않는 지역입니다.
		 * )
		 * 
		 * 주중 소인 - 32000, 대인 - 46000
		 * 주말 종일권 소인 - 38000, 대인 - 54000
		 * 주말 14시간권 소인 - 30000, 대인 - 42000
		 * 
		 * 주중 소인 2명, 대인 2명
		 * 제휴항목 : 삼성카드
		 * 지역민 할인 : 해당없음
		 * 총 결제 금액 : 67,000원
		 * 
		 * 결제방식을 선택하시오(1. 현금, 2. 카드): 1
		 * 현금결제가 완료되었습니다.
		 * 즐거운 휴가 되십시오.
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int category = 0;
		int totalPrice = 0;
		
		String payOption = null;
		
		System.out.println("어서오세요 캘리포니아비치입니다~");
		System.out.println("1. 현장구매");
		System.out.println("2. 온라인 티켓 발권");
		System.out.println("3. 렌탈");
		System.out.println("4. 팔찌 충전");
		
		System.out.print("원하시는 상품을 입력하시오: ");
		category = scanner.nextInt();
		
		if (category == 1) {
			
			totalPrice = category1();
			
//			System.out.println("예약일을 선택하시오: (1. 주중, 2. 주말): ");
//			int dayNum = scanner.nextInt();
//			int dayNum2 = 0;
//			if(dayNum == 1 ) {
//				day = "주중권";
//			}else if(dayNum == 2) {
//				System.out.println("원하시는 상품을 입력하시오(1. 종일권, 2. 14시간권): ");
//				dayNum2 = scanner.nextInt();
//				
//				if (dayNum2 == 1) {
//					day = "주말 종일권";
//				}else if (dayNum2 == 2) {
//					day = "주말 14시간권";
//				}
//			}
//			
//			System.out.print("예약인원을 입력하시오(소인): ");
//			kids = scanner.nextInt();
//			System.out.print("예약인원을 입력하시오(대인): ");
//			people = scanner.nextInt();
//			
//			if (dayNum == 1) {
//				totalPrice = (kids * 32000) + (people * 46000);
//			}else if (dayNum2 == 1) {
//				totalPrice = (kids * 38000) + (people * 54000);
//			}else if (dayNum2 == 2) {
//				totalPrice = (kids * 30000) + (people * 42000);
//			}
//			
//			System.out.print("제휴항목을 입력하시오(1. 삼성카드(10%) 2. 신한카드(15%) 3. 통신사(인원당 3,000원 할인)): ");
//			int saleOptionNum = scanner.nextInt();
//			if (saleOptionNum == 1) {
//				saleOption = "삼성카드(10%)";
//				totalPrice = (int) (totalPrice * 0.9);
//			}else if (saleOptionNum == 2) {
//				saleOption = "신한카드(15%)";
//				totalPrice = (int) (totalPrice * 0.85);
//			}else if (saleOptionNum == 3) {
//				saleOption = "통신사(인원당 3,000원 할인)";
//				totalPrice = totalPrice - (kids + people) * 3000;
//			}else {
//				System.out.println("제공하지 않는 제휴항목입니다.");
//			}
//			
//			scanner.nextLine();
//			System.out.print("지역민 할인_전체금액의 5% 할인(거주 지역을 입력하시오): ");
//			String address = scanner.nextLine();
//			if(address.equals("경주")) {
//				saleOption2 = "할인 적용";
//				totalPrice = (int) (totalPrice * 0.95);
//			}else {
//				saleOption2 = "해당 없음";
//				System.out.println("지원하지 않는 지역입니다.");
//			}
//			
//			System.out.println(">> 예약 내역 <<");
//			System.out.println(day + " 소인" + kids + "명, 대인" + people + "명");
//			System.out.println("제휴항목 : " + saleOption);
//			System.out.println("지역민 : " + saleOption2);
//			System.out.println("총 결제 금액 : " + totalPrice + "원");
//			System.out.println();
//			
			while (true) {
				System.out.print("결제방식을 선택하시오(1. 현금, 2. 카드): ");
				payOption = scanner.nextInt() == 1 ? "현금" 
							: "카드";
				
				if (payOption.equals("현금")) {
					System.out.print("금액을 입력하시오: ");
					if(scanner.nextInt() == totalPrice) {
						System.out.println("현금결제가 완료되었습니다.");
						break;
					}else {
						System.out.println("결제금액이 옳지 않습니다.");
						continue;
					}
					
				}else if (payOption.equals("카드")) {
					System.out.print("금액을 입력하시오: ");
					if(scanner.nextInt() == totalPrice) {
						System.out.println("카드결제가 완료되었습니다.");
						break;
					}else {
						System.out.println("결제금액이 옳지 않습니다.");
						continue;
					}
				}	
			}
			
			System.out.println("즐거운 휴가 되십시오.");
			
			
		}else if (category == 2) {
			System.out.println("온라인 티켓 발권");
		}else if (category == 3) {
			System.out.println("렌탈");
		}else if (category == 4) {
			System.out.println("팔찌 충전");
		}else {
			System.out.println("잘못된 입력입니다.");
		}
		
		
		
		scanner.close();
		

	}
	
	
//	public static int offlineTicket() {
//		
//		Scanner offlineTicketScanner = new Scanner(System.in);
//		
//		int kids = 0;
//		int people = 0;
//		String day = null;
//		String saleOption = null;
//		String saleOption2 = null;
//		
//		int totalPrice = 0;
//		
//		System.out.println("예약일을 선택하시오: (1. 주중, 2. 주말): ");
//		int dayNum = offlineTicketScanner.nextInt();
//		int dayNum2 = 0;
//		if(dayNum == 1 ) {
//			day = "주중권";
//		}else if(dayNum == 2) {
//			System.out.println("원하시는 상품을 입력하시오(1. 종일권, 2. 14시간권): ");
//			dayNum2 = offlineTicketScanner.nextInt();
//			
//			if (dayNum2 == 1) {
//				day = "주말 종일권";
//			}else if (dayNum2 == 2) {
//				day = "주말 14시간권";
//			}
//		}
//		
//		System.out.print("예약인원을 입력하시오(소인): ");
//		kids = offlineTicketScanner.nextInt();
//		System.out.print("예약인원을 입력하시오(대인): ");
//		people = offlineTicketScanner.nextInt();
//		
//		if (dayNum == 1) {
//			totalPrice = (kids * 32000) + (people * 46000);
//		}else if (dayNum2 == 1) {
//			totalPrice = (kids * 38000) + (people * 54000);
//		}else if (dayNum2 == 2) {
//			totalPrice = (kids * 30000) + (people * 42000);
//		}
//		
//		System.out.print("제휴항목을 입력하시오(1. 삼성카드(10%) 2. 신한카드(15%) 3. 통신사(인원당 3,000원 할인)): ");
//		int saleOptionNum = offlineTicketScanner.nextInt();
//		if (saleOptionNum == 1) {
//			saleOption = "삼성카드(10%)";
//			totalPrice = (int) (totalPrice * 0.9);
//		}else if (saleOptionNum == 2) {
//			saleOption = "신한카드(15%)";
//			totalPrice = (int) (totalPrice * 0.85);
//		}else if (saleOptionNum == 3) {
//			saleOption = "통신사(인원당 3,000원 할인)";
//			totalPrice = totalPrice - (kids + people) * 3000;
//		}else {
//			System.out.println("제공하지 않는 제휴항목입니다.");
//		}
//		
//		offlineTicketScanner.nextLine();
//		System.out.print("지역민 할인_전체금액의 5% 할인(거주 지역을 입력하시오): ");
//		String address = offlineTicketScanner.nextLine();
//		if(address.equals("경주")) {
//			saleOption2 = "할인 적용";
//			totalPrice = (int) (totalPrice * 0.95);
//		}else {
//			saleOption2 = "해당 없음";
//			System.out.println("지원하지 않는 지역입니다.");
//		}
//		
//		System.out.println(">> 예약 내역 <<");
//		System.out.println(day + " 소인" + kids + "명, 대인" + people + "명");
//		System.out.println("제휴항목 : " + saleOption);
//		System.out.println("지역민 : " + saleOption2);
//		System.out.println("총 결제 금액 : " + totalPrice + "원");
//		System.out.println();
//		
//		offlineTicketScanner.close();
//		
//		return totalPrice;
//	}

	public static int category1() {
		
		Scanner offlineTicketScanner = new Scanner(System.in);
		
		int kids = 0;
		int people = 0;
		int totalPrice = 0;
		String day = null;
		String saleOption = null;
		String saleOption2 = null;
		
		System.out.println("예약일을 선택하시오: (1. 주중, 2. 주말): ");
		int dayNum = offlineTicketScanner.nextInt();
		int dayNum2 = 0;
		if(dayNum == 1 ) {
			day = "주중권";
		}else if(dayNum == 2) {
			System.out.println("원하시는 상품을 입력하시오(1. 종일권, 2. 14시간권): ");
			dayNum2 = offlineTicketScanner.nextInt();
			
			if (dayNum2 == 1) {
				day = "주말 종일권";
			}else if (dayNum2 == 2) {
				day = "주말 14시간권";
			}
		}
		
		System.out.print("예약인원을 입력하시오(소인): ");
		kids = offlineTicketScanner.nextInt();
		System.out.print("예약인원을 입력하시오(대인): ");
		people = offlineTicketScanner.nextInt();
		
		if (dayNum == 1) {
			totalPrice = (kids * 32000) + (people * 46000);
		}else if (dayNum2 == 1) {
			totalPrice = (kids * 38000) + (people * 54000);
		}else if (dayNum2 == 2) {
			totalPrice = (kids * 30000) + (people * 42000);
		}
		
		System.out.print("제휴항목을 입력하시오(1. 삼성카드(10%) 2. 신한카드(15%) 3. 통신사(인원당 3,000원 할인)): ");
		int saleOptionNum = offlineTicketScanner.nextInt();
		if (saleOptionNum == 1) {
			saleOption = "삼성카드(10%)";
			totalPrice = (int) (totalPrice * 0.9);
		}else if (saleOptionNum == 2) {
			saleOption = "신한카드(15%)";
			totalPrice = (int) (totalPrice * 0.85);
		}else if (saleOptionNum == 3) {
			saleOption = "통신사(인원당 3,000원 할인)";
			totalPrice = totalPrice - (kids + people) * 3000;
		}else {
			System.out.println("제공하지 않는 제휴항목입니다.");
		}
		
		offlineTicketScanner.nextLine();
		System.out.print("지역민 할인_전체금액의 5% 할인(거주 지역을 입력하시오): ");
		String address = offlineTicketScanner.nextLine();
		if(address.equals("경주")) {
			saleOption2 = "할인 적용";
			totalPrice = (int) (totalPrice * 0.95);
		}else {
			saleOption2 = "해당 없음";
			System.out.println("지원하지 않는 지역입니다.");
		}
		
		System.out.println(">> 예약 내역 <<");
		System.out.println(day + " 소인" + kids + "명, 대인" + people + "명");
		System.out.println("제휴항목 : " + saleOption);
		System.out.println("지역민 : " + saleOption2);
		System.out.println("총 결제 금액 : " + totalPrice + "원");
		System.out.println();
		
		offlineTicketScanner.close();
		
		return totalPrice;
		
	}
	
	
}
