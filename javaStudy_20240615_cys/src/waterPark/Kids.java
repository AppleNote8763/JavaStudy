package waterPark;

public class Kids extends Residents{

	private String code;
	private int gender;
	private String name;
	private int age;
	
	
	public Kids(String code, int gender, String name, int age) {
		this.code = code;
		this.gender = gender;
		this.name = name;
		this.age = age;
	}
	
	public String getCode() {
		return code;
	}

	public void rideC() {
		System.out.println("C 놀이기구를 탑니다.");
	}
	
	
}
