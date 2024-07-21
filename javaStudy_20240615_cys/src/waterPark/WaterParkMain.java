package waterPark;

import java.util.Scanner;
//import java.util.concurrent.atomic.LongAccumulator;

public class WaterParkMain {

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
		
//		String name = "경주";
//		String name2 = null;
//		
//		name2 = scanner.nextLine();
//		
//		System.out.println(name.equals(name2));
		
		
		Scanner scanner = new Scanner(System.in);
		int category = 0;								// 1. 현장구매, 2. 온라인 티켓발권, 3. 렌탈, 4. 팔찌충전
		int week = 0;									// 1. 주중, 2. 주말
		int weekendTime = 0;							// 1. 종일권, 2. 14시간권
		int childCount = 0;								// 소인 인원수
		int adultCount = 0;								// 대인 인원수
		final int CHILD_WEEKDAYS_MONEY = 32000;			// 소인 주중 가격
		final int ADULT_WEEKDAYS_MONEY = 46000;			// 대인 주중 가격
		final int CHILD_WEEKEND_MONEY = 38000;			// 소인 주말 종일권 가격
		final int ADULT_WEEKEND_MONEY = 54000;			// 대인 주말 종일권 가격
		final int CHILD_WEEKEND_14TIME_NONEY = 30000;	// 소인 주말 14시간권 가격
		final int ADULT_WEEKEND_14TIME_MONEY = 42000;	// 대인 주말 14시관권 가격
		int partnership = 0;							// 재휴항목할인
		String localDiscount = null;					// 거주지역할인
		int totalPrice = 0;								// 총 가격
		String weekdaysWeekend = null;					// 주중 주말 주말 14시관권 이름
		String partnershipName = null;					// 재휴항목 이름
		String localDiscountCheck = null;				// 거주지역할인 체크
		int payment = 0;								// 현금결제, 카드결제 확인
		
		System.out.println("어서오세요 캘리포니아비치입니다~");
		System.out.println("1. 현장구매");
		System.out.println("2. 온라인 티켓 발권");
		System.out.println("3. 렌탈");
		System.out.println("4. 팔찌 충전");
		
		System.out.print("원하시는 상품을 입력하시오: ");
		category =  scanner.nextInt();
		
		if(category == 1) {
			System.out.print("예약일을 선택하시오: (1. 주중, 2. 주말): ");
			week = scanner.nextInt();
			
			if (week == 1) {
				weekdaysWeekend = "주중권";
			}else if (week == 2) {
				System.out.print("원하시는 상품을 입력하시오(1. 종일권, 2. 14시간권): ");
				weekendTime = scanner.nextInt();
				if (weekendTime == 1) {
					weekdaysWeekend = "주말 종일권";
				}else if (weekendTime == 2) {
					weekdaysWeekend = "주말 14시간권";
				}
			}
			
			System.out.print("예약인원을 입력하시오(소인): ");	// 인원
			childCount = scanner.nextInt();
			System.out.print("예약인원을 입력하시오(대인): ");
			adultCount = scanner.nextInt();
			
			// 기본계산
						if(week == 1) {
							totalPrice = (childCount * CHILD_WEEKEND_MONEY) + (adultCount * ADULT_WEEKEND_MONEY);
						} else if (week == 2) {
							if (weekendTime == 1) {
								totalPrice = (childCount * CHILD_WEEKDAYS_MONEY) + (adultCount * ADULT_WEEKDAYS_MONEY);
							}else if (weekendTime == 2) {
								totalPrice = (childCount * CHILD_WEEKEND_14TIME_NONEY) + (adultCount * ADULT_WEEKEND_14TIME_MONEY);
							}
						}
			
			System.out.print("제휴항목을 입력하시오(1. 삼성카드(10%) 2. 신한카드(15%) 3. 통신사(인원당 3,000원 할인)): ");	// 재휴할인
			partnership = scanner.nextInt();
			
			// 기본계산 + 재휴할인
						if (partnership == 1) {
							totalPrice = (int) (totalPrice * 0.9);	// totalPrice = totalPrice * 90 / 100; 처음에 한 방식
							partnershipName = "삼성카드(10%)";
						}else if (partnership == 2) {
							totalPrice = (int) (totalPrice * 0.85);	// totalPrice = totalPrice * 85 / 100; 처음에 한 방식
							partnershipName = "신한카드(15%)";
						}else if (partnership == 3) {
							totalPrice = totalPrice - (childCount + adultCount) * 3000;
							partnershipName = "통신사(인원당 3,000원 할인)";
						}else {
							System.out.println("제공하지 않는 제휴항목입니다.");
						}
			
			scanner.nextLine();
			System.out.print("지역민 할인_전체금액의 5% 할인(거주 지역을 입력하시오): ");	// 지역민 할인
			localDiscount = scanner.nextLine();
			System.out.println();
			
			// 기본계산 + 재휴할인 + 지역할인
			if (localDiscount.equals("경주")) {
				System.out.println("총 결제금액에서 5% 할인 되었습니다.");
				totalPrice = (int) (totalPrice * 0.95);
				localDiscountCheck = "해당있음";
			}else {
				System.out.println("할인을 지원하지 않는 지역입니다.");
				localDiscountCheck = "해당없음";
			}
			
			// 최종 출력
			System.out.println(">> 예약 내역 <<");
			System.out.println(weekdaysWeekend + " 소인" + childCount + "명, 대인" + adultCount + "명");
			System.out.println("제휴항목 : " + partnershipName);
			System.out.println("지역민 : " + localDiscountCheck);
			System.out.println("총 결제 금액 : " + totalPrice + "원");
			System.out.println();
			
			while (true) {
				System.out.print("결제방식을 선택하시오(1. 현금, 2. 카드): ");
				payment = scanner.nextInt();
				if (payment == 1) {
					System.out.println("현금결제가 완료되었습니다.");
					break;
				}else if (payment == 2) {
					System.out.println("카드결제가 완료되었습니다.");
					break;
				}else {
					System.out.println("잘못된 결제방식 입니다.");
					continue;
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

}
