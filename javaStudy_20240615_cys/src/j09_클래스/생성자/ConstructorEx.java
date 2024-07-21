package j09_클래스.생성자;

public class ConstructorEx {

	String name;
	int age;
	
	// 생성자 : 클래스명과 동일하다
	//			주소를 반환한다
	//			기본생성자는 생략이 가능하다
	//			다른 생성자를 오버로딩할 시 기본생성자를 사용하려면 
	//			무조건 명시!!!!!!! 해줘야함.
	//			생성자의 접근지정자는 public이다.
	
	// 오버로딩 : 동일한 함수명을 사용하고 매개변수의 종류와 갯수가 다른것 생성자 오버로딩
	// alt + shift + S + generate
	
	// 접근지정자	->	캡슐화
	// public		->	전부다
	// protected	->	동일패키지 + 상속받은거
	// default		->	동일패키지
	// private		->	동일클래스
	
	// 접근지정자를 명시하지 않으면 접근지정자는 default로 선언
	
	// 데이터값은 접근지정자를 private으로 설정
	// -> 주소참조를 통한 값 주입이 외부 클래스 안된다.
	// -> 생성자를 통한 값 주입은 가능하다 -> 생성자의 접근지정자가 public 이기 때문
	
	// -> 우회 -> set이라는 메소드를 만들어서 메소드를 타고 우회
	
	// 값불러올때 우회 -> get
	
	// 기본생성자
	// NoArgsConstructor
	public ConstructorEx() {
		
		System.out.println("기본생성자");
		
	}
	
	// Args -> Arguments(인수, 매개변수)
	
	// RequiredArgsConstructor
	public ConstructorEx(String name) {
		System.out.println("매개변수: " + name);
		System.out.println("name을 매개면수로 받는 생성자");
		this.name = name;	// 생성자를 통한 값주입
	}
	
	// RequiredArgsConstructor
	public ConstructorEx(int age) {
		System.out.println("매개변수: " + age);
		System.out.println("age를 매개면수로 받는 생성자");
	}
	
	
	// AllArgsConstructor
	public ConstructorEx(String name, int age) {
		System.out.println("매개변수: " + name);
		System.out.println("매개변수: " + age);
		System.out.println("전체 생성자");
	}
	
}
