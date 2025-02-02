package j09_클래스.접근지정자.student;

public class Student {

	private String name;
	private int studentYear;
	private int age;
	private String address;
	private String phone;
	
	// 생성자(기본, 필수, 전체), set~, get~
	// 단축키
	// alt + shift + S -> generate
	
	public Student() {

	}

	public Student(String name) {
		super();
		this.name = name;
	}

	public Student(int studentYear) {
		super();
		this.studentYear = studentYear;
	}

	public Student(String name, int studentYear, int age, String address, String phone) {
		super();
		this.name = name;
		this.studentYear = studentYear;
		this.age = age;
		this.address = address;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudentYear() {
		return studentYear;
	}

	public void setStudentYear(int studentYear) {
		this.studentYear = studentYear;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	// 생성자(기본, 필수, 전체), set~, get~
	
	
	
	
	
}
