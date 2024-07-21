package j04_문자열;

public class String1 {

	public static void main(String[] args) {

		/* 
		 *  이스케이프 문자 
		 *  \" "출력 
		 *  \' '출력
		 *  \n 다음줄로 띄움
		 *  \t 탭만큼 옆으로 이동
		 * 
		 */
		
		System.out.println(1);
		System.out.println("\"안녕, 나는 홍길동이야!\"");
		
		System.out.println("안녕");
		System.out.println("나는 홍길동이야");
		System.out.println("안녕 \n나는 홍길동이야!");
		System.out.println("나이:\t18");
		System.out.println();

		System.out.println(2);
		String address = "부산시 진구 전포동";
		int index = address.indexOf("시");
		System.out.println("index : " + index);
		System.out.println();

		
		/*
		 *  address2 라는 변수에 "부산시 동래구 사직동" 넣기
		 * 
		 *  동의 위치를 찾아서 index2라는 변수에 넣으시오
		 * 
		 *  index2를 출력하시오
		 * 
		 */
		
		System.out.println(3);
		String address2 = "부산시 동래구 사직동";
		int index2 = address2.indexOf("동");
		System.out.println("index2 : " + index2);
		
		int index3 = address2.lastIndexOf("동");
		System.out.println("index3 : " + index3);
		
		// substring(지울문자시작번호, 지울문자끝번호+1)
		String subSrting = address2.substring(0, 3);
		System.out.println(subSrting);
		System.out.println();

		
		/*
		 * 실습
		 * 부산광역시 서구 부민동 이라는 문장에서
		 * 부산광역시 서구를 잘라서 출력하시오
		 * * indexOf 와 lastIndexOf 를 모두 사용하여 푸시오
		 */
		
		System.out.println(4);
		String address3 = "부산광역시 서구 부민동";
		
		int index4 = address3.indexOf("부");
		int index5 = address3.lastIndexOf("부");
		String subSrting2 = address3.substring(index4, index5-1);
		System.out.println(subSrting2);
		System.out.println();

		
		// 문자열 바꾸기  변수명.replace(기존 문자 지정, 바꿀 문자 지정);
		String address4 = "부산광역시 서구 부민동";
		System.out.println(address4.replace(' ', '-'));
		System.out.println();
		System.out.println(address4);
		System.out.println(address4.replace(" ", "---"));
		System.out.println();
		System.out.println(address4.replaceAll(" ", "---"));
		System.out.println();

		
		/*
		 * 실습
		 */
		
		
		String phoneNumbers = "010/3300/4698, 010/1234/5768";
		
		/*
		 * 출력
		 * 011-3300-4698/011-1234-5678
		 */
		
		phoneNumbers = phoneNumbers.replace("010", "011")
									.replace("/", "-")
									.replace(", ", "/");
		
		System.out.println(phoneNumbers);
		
		phoneNumbers = "010/3300/4698, 010/1234/5768";
		
		System.out.println(phoneNumbers.replace("010", "011").replace("/", "-").replace(", ", "/"));
		
		
	}

}
