package j01_출력;

public class Myinfo {

	public static void main(String[] args) {
		
		// 주석 : 코드에 전혀 영향을 주지 않는 부분(메모에 사용)
		
		
				/*
				 * 장문주석
				 * 자동완성 단축키 : ctrl + space
				 * 실행단축기 : ctrl +F11
				 * 
				 * 출력 : sysout(syso) + ctrl + space
				 * 
				 * 변수를 사용하기 위해서는 선언과 초기화 필요함
				 * 
				 * = 는 같다가 아니라 대입일고 읽음.
				 * 선언은 무조건 한번
				 * 대입은 무한으로 할 수 있음.
				 */
		
		
		// boolean(true / false)
		
		boolean flag;
		flag = true;
		
		System.out.println(flag);
		
		System.out.println(flag);
		
		flag = false;
		
		System.out.println(flag);
		
		
		// char(문자) String(문자열)
		
		char name1 = '홍';
		char name2 = '길';
		char name3 = '동';
		
		System.out.print(name1);
		System.out.print(name2);
		System.out.print(name3);
		System.out.println();
		
		System.out.println(name1 + name2 + name3);
		
		
		String address = "부산 진구 전포동";
		
		System.out.println(address);
		
		System.out.println("" + name1 + name2 + name3);
		
		
	}
}
