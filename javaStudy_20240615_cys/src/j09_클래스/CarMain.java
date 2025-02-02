package j09_클래스;

public class CarMain {

	/*
	 * 변수
	 * 		company
	 * 		model
	 * 		color
	 * 
	 * 메소드
	 * 		showCarInfo()
	 * 			회사명: 000
	 * 			모델명: 000
	 * 			색상: 000
	 * 	
	 * 		changeColor(int)
	 * 			1 - 오렌지
	 * 			2 - 블루
	 * 			3 - 그린
	 * 			000 색으로 변경되었습니다.
	 * 
	 * 3대 생산
	 * 현대자동차
	 * 쏘나타
	 * 화이트
	 * 
	 * 기아
	 * k5
	 * 블랙
	 * 
	 * 현대자동차
	 * 아반뗴
	 * 그레이
	 * 
	 */
	
	
	
	public static void main(String[] args) {

		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		
		car1.company = "현대자동차";	// 주소참조를 통한 값주입
		car1.model = "쏘나타";
		car1.color = "화이트";
		
		car2.company = "기아";
		car2.model = "k5";
		car2.color = "블랙";
		
		car3.company = "현대자동차";
		car3.model = "아반떼";
		car3.color = "그레이";
		
		car1.showCarInfo();
		car2.showCarInfo();
		car3.showCarInfo();
		
		car1.changeColor(5);
		car1.showCarInfo();
		
		
	}

}
