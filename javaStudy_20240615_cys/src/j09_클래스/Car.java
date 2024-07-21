package j09_클래스;

public class Car {

	String company;
	String model;
	String color;
	
	public Car() {
		// 기본생성자는 생략이 가능하다.
		// 생성자의 이름은 클래스명과 동일하다.
		// 생성자는 무조건 주소를 리턴한다.
		
		System.out.println("생성자 호출");
	}
	
	
	void showCarInfo() {
		System.out.println("회사명: " + company);
		System.out.println("모델명: " + model);
		System.out.println("색상: " + color);
		System.out.println();
	}
	
	void changeColor(int num) {
		if(num == 1) {
			color = "orange";
		}else if (num == 2) {
			color = "blue";
		}else if (num == 3) {
			color = "green";
		}else {
			System.out.println("지원하지 않는 옵션입니다.");
			return;
		}
		
		System.out.println(color + "색상으로 변경되었습니다.");
		
	}
}
