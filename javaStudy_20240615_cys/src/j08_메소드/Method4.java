package j08_메소드;

import java.util.Scanner;

public class Method4 {

	/*
	 * 펜션 예약(1인 숙박비 10만원)
	 * 1. 1인 예약(숙박자정보 O)
	 *   - 예약자 이름, 나이받기
	 *   - 결제
	 *   
	 * 2. 2인 예약(숙박자정보 O)
	 * 	 - 예약자 이름, 나이(숙박자 모두)받기
	 * 	 - 10% 할인 들어감
	 *   - 결제
	 *   
	 * 3. n명 예약(숙박자정보 X)
	 * 	 - 숙박자 명수만 받기
	 *   - 5인 초과시 20% 할인 들어감
	 *   - 결제
	 */
	
	public static void main(String[] args) {

		int category = 0;
		int totalPrice = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("팬션 예약 인원수를 입력하세요(1. 1인 예약, 2. 2인 예약, 3. n명 예약 : ");
		category = scanner.nextInt();
		
//		if(people == 1) {
//			peopleOne();
//			payment(price(1));
//		}else if (people == 2) {
//			peopleTwo();
//			payment(price(2));
//		}else if (people == 3) {
//			int price = peopleThree();
//			payment(price(price));
//		}else {
//			
//		}
		
		if(category == 1) {
			totalPrice = reserve("홍길동", 18);
		}else if (category == 2) {
			totalPrice = reserve("홍길동", 18, "홍길서", 19);
		}else if (category > 2) {
			totalPrice = reserve(10);
		}else {
			System.out.println("지원하지 않는 상품입니다.");
		}
		
		payment(totalPrice);
		
		scanner.close();
	}

//	public static void peopleOne() {
//		
//		String name = null;
//		int age = 0;
//		
//		Scanner oneScanner = new Scanner(System.in);
//		
//		//oneScanner.nextLine();
//		System.out.println("이름을 입력하세요: ");
//		name = oneScanner.nextLine();
//		System.out.println("나이를 입력하세요: ");
//		age = oneScanner.nextInt();
//		
//		oneScanner.close();
//		
//	}
//	
//	public static void peopleTwo() {
//		
//		String name = null;
//		int age1 = 0;
//		int age2 = 0;
//		
//		Scanner twoScanner = new Scanner(System.in);
//		
//		//twoScanner.nextLine();
//		System.out.println("예약자 이름을 입력하세요: ");
//		name = twoScanner.nextLine();
//		System.out.println("예약자의 나이를 입력하세요: ");
//		age1 = twoScanner.nextInt();
//		System.out.println("동행인의 나이를 입력하세요: ");
//		age1 = twoScanner.nextInt();
//		
//		twoScanner.close();
//		
//	}
//	
//	public static int peopleThree() {
//		
//		int peopleNum = 0;
//		
//		Scanner threeScanner = new Scanner(System.in);
//		
//		System.out.println("숙박 인원수를 입력하세요: ");
//		peopleNum = threeScanner.nextInt();
//		
//		threeScanner.close();
//		
//		return peopleNum;
//		
//	}
//	
//	public static int price(int peopleNumPrice) {
//		int totalPrice = 0;
//		int onePeoplePrice = 100000;
//		
//		if(peopleNumPrice == 1) {
//			totalPrice = onePeoplePrice;
//		}else if(peopleNumPrice == 2) {
//			totalPrice = (int) ((onePeoplePrice * 2) * 0.9);
//		}else if(peopleNumPrice >2 && peopleNumPrice < 5) {
//			totalPrice = onePeoplePrice * peopleNumPrice;
//		}else if (peopleNumPrice > 5) {
//			totalPrice = (int) ((onePeoplePrice * peopleNumPrice) * 0.8);
//		}
//		
//		return totalPrice;
//	}
	
	public static int reserve(String name, int age) {
		System.out.println("예약자 이름: " + name);
		System.out.println("예약자 나이: " + age);
		System.out.println("결제금액: 100000");
		return 100000;
	}
	
	public static int reserve(String name, int age, String name2, int age2) {
		System.out.println("예약자 이름: " + name);
		System.out.println("예약자 나이: " + age);
		System.out.println("동행자 이름: " + name2);
		System.out.println("동행자 나이: " + age2);
		System.out.println("결제금액: 180000");
		return 180000;
	}
	
	public static int reserve(int num) {
		System.out.println("예약 인원: " + num);
		int price = 0;
		if (num < 5) {
			price = 100000 * num;
		}else {
			price = (int) ((100000 * num)*0.8);
		}
		System.out.println("결제금액: " + price);
		return price;
	}
	
	public static void payment(int totalPrice) {
		
		String payOption = null;
		Scanner paymentScanner = new Scanner(System.in);
		
		while (true) {
			System.out.print("결제방식을 선택하시오(1. 현금, 2. 카드): ");
			payOption = paymentScanner.nextInt() == 1 ? "현금" 
						: "카드";
			
			if (payOption.equals("현금")) {
				System.out.print("금액을 입력하시오: ");
				if(paymentScanner.nextInt() == totalPrice) {
					System.out.println("현금결제가 완료되었습니다.");
					break;
				}else {
					System.out.println("결제금액이 옳지 않습니다.");
					continue;
				}
				
			}else if (payOption.equals("카드")) {
				System.out.print("금액을 입력하시오: ");
				if(paymentScanner.nextInt() == totalPrice) {
					System.out.println("카드결제가 완료되었습니다.");
					break;
				}else {
					System.out.println("결제금액이 옳지 않습니다.");
					continue;
				}
			}	
		}
		paymentScanner.close();
	}
	
}
