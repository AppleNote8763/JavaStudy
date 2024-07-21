package j09_클래스;

public class Computer {

	int year;
	String company;
	String cpu;
	int ram;
	String graphic;
	
	void showInfo() {
		System.out.println("제조년: " + year);
		System.out.println("제조사: " + company);
		System.out.println("CPU: " + cpu);
		System.out.println("RAM: " + ram);
		System.out.println("FraphicCard: " + graphic);
		
	}
	
	/*
	 * addRam 이라는 메소드 만들기
	 * 추가할 램을 받아서 기존램에 추가하고
	 * 최종램의 값을 출력해주기
	 */
	
	void addRam(int gigaByte) {
		ram += gigaByte;
		System.out.println("RAM: " + ram);
		
	}

	/*
	 * removeRam 메소드 만들기
	 * 줄이고자 하는 값을 받아서 줄이면 됨
	 * 기존에 있는 값보다 줄이고자 하는 값이 더크면
	 * 램은 1로 만들고
	 * 그리고 "램은 최소 1기가 바이트 이상은 장착하여야 합니다." 라고 출력
	 * 
	 * 기존에 있는 값보다 줄이고자 하는 값이 작으면
	 * 줄이고 현재램 보여주기
	 */
	
	void removeRam(int gigaByte) {
		if(ram > gigaByte) {
			ram -= gigaByte;
			System.out.println("Ram: " + ram);
		}else {
			ram = 1;
			System.out.println("램은 최소 1기가 바이트 이상은 장착하여야 합니다.");
			System.out.println("Ram: " + ram);
		}
	}
	
}
