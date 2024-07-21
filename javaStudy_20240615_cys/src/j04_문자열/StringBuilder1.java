package j04_문자열;

public class StringBuilder1 {

	public static void main(String[] args) {

		StringBuilder stringBuilder = new StringBuilder();
		String name = "홍길동";
		stringBuilder.append("이름: ");
		stringBuilder.append(name);
		
		stringBuilder.delete(1, 2);
		
		System.out.println(stringBuilder);
		
		String address = "부산광역시 서구 부민동 부민3동";
		int index = address.indexOf("부", 10);
		
		System.out.println(index);
		
		
	}

}
