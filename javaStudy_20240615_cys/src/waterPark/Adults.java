package waterPark;

public class Adults extends Residents{

	private String code;
	private int gender;
	private String name;
	private int age;
	
	
	public Adults(String code, int gender, String name, int age) {
		this.code = code;
		this.gender = gender;
		this.name = name;
		this.age = age;
	}

	public String getCode() {
		return code;
	}
	
	
}
