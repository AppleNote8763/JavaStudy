package j11_상속;

public class Human extends Animal{

//	public void move() {
//		System.out.println("동물이 움직입니다.");
//	}
	
	public Human() {
		super();	// super는 부모
		System.out.println("Human 객체 생성");
	}
	
	
	/*
	 *  오버라이딩: 재정의
	 */
	@Override
	public void move() {
//		super.move();	// 부모에(Animal) 있는 move를 사용
		System.out.println("피아노를 칩니다.");
	}
	
	public void game() {
		System.out.println("게임을 합니다.");
	}
	
	
}
