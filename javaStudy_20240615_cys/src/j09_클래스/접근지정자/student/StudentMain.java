package j09_클래스.접근지정자.student;

public class StudentMain {

	public static void main(String[] args) {

		Student student = new Student();
		Student student2 = new Student("홍길서");
		
		student.setName("최윤수");
		System.out.println(student.getName());
		System.out.println(student2.getName());
		
		/*
		 *  클래스, 생성자, 접근지정자
		 *  변수(필드값) 값 주입(대입)
		 *  1. 주소참조를 통한 값 주입
		 *  2. 생성자를 통한 값 주입
		 *  3. 세터를 통한 값 주입
		 */
		
		/*
		 *  기본생성자는 다른 생성자를 오버로딩하지 않을시 생략이 가능하다.
		 *  
		 *  다른 생성자를 오버로딩할 시 기본생성자를 사용하려면 
		 *  무조건 명시!!!!!!! 해줘야함.
		 */
	}

}
