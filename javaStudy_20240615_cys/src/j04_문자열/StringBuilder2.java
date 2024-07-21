package j04_문자열;

public class StringBuilder2 {

	public static void main(String[] args) {

		String names = "홍길동님, 홍길서님,홍길남님,가나다님, 가가가님";
		
		
		/*
		 * 실습
		 * names를 앞에서 학습한 내용을 활용하여
		 * StringBuilder에 정리해서 넣으시오
		 * 최종결과물: 홍길동/홍길서/홍길남/가나다/가가가
		 */
		
		// 방법1(append) 하드코딩
//		System.out.println("append");
//		names = "홍길동님, 홍길서님,홍길남님,가나다님, 가가가님";
//		System.out.println(names);
//		StringBuilder stringBuilderAppend = new StringBuilder();
//		
//		stringBuilderAppend.append(names.substring(0, 3));
//		stringBuilderAppend.append("/");
//		stringBuilderAppend.append(names.substring(6, 9));
//		stringBuilderAppend.append("/");
//		stringBuilderAppend.append(names.substring(11, 14));
//		stringBuilderAppend.append("/");
//		stringBuilderAppend.append(names.substring(16, 19));
//		stringBuilderAppend.append("/");
//		stringBuilderAppend.append(names.substring(22, 25));
//		
//		System.out.println(stringBuilderAppend);
//		System.out.println();
		
		
		// 방법2(replace)
//		System.out.println("replace");
//		names = "홍길동님, 홍길서님,홍길남님,가나다님, 가가가님";
//		System.out.println(names);
//		StringBuilder stringBuilderReplace = new StringBuilder();
//		
//		names = names.replace(",", "/")
//				.replace(" ", "")
//				.replace("님", "");
//		stringBuilderReplace.append(names);
//		
//		System.out.println(stringBuilderReplace);
//		System.out.println();
		
		
		// 방법3(indexOf)
		System.out.println("indexOf");
		names = "홍길동님, 홍길서님,홍길남님,가나다님, 가가가님";
		System.out.println(names);
		StringBuilder stringBuilderIndexOf = new StringBuilder();
		
		int indexIndexOf = names.indexOf("님");
		System.out.println(indexIndexOf);
		
		stringBuilderIndexOf.append(names.substring(indexIndexOf - 3, indexIndexOf));
		stringBuilderIndexOf.append("/");
		indexIndexOf = names.indexOf("님", indexIndexOf + 1);
		
		System.out.println(indexIndexOf);
		
		stringBuilderIndexOf.append(names.substring(indexIndexOf - 3, indexIndexOf));
		stringBuilderIndexOf.append("/");
		indexIndexOf = names.indexOf("님", indexIndexOf + 1);
		System.out.println(indexIndexOf);
		
		stringBuilderIndexOf.append(names.substring(indexIndexOf - 3, indexIndexOf));
		stringBuilderIndexOf.append("/");
		indexIndexOf = names.indexOf("님", indexIndexOf + 1);
		System.out.println(indexIndexOf);
		
		stringBuilderIndexOf.append(names.substring(indexIndexOf - 3, indexIndexOf));
		stringBuilderIndexOf.append("/");
		indexIndexOf = names.indexOf("님", indexIndexOf + 1);
		System.out.println(indexIndexOf);
		
		stringBuilderIndexOf.append(names.substring(indexIndexOf - 3, indexIndexOf));
		
		System.out.println(stringBuilderIndexOf);
		System.out.println();
		
		
		// append 여러번 써지는지 테스트 반복문 활용하면 위의 결과랑 같은출력이 가능할거같음
//		System.out.println("test");
//		names = "홍길동님, 홍길서님,홍길남님,가나다님, 가가가님";
//		System.out.println(names);
//		StringBuilder stringBuilderTest = new StringBuilder();
//		
//		int indexTest = names.indexOf("님");
//		stringBuilderTest.append(names.substring(indexTest - 3, indexTest)).append("/")
//							.append(names.substring(indexTest - 3, indexTest)).append("/")
//							.append(names.substring(indexTest - 3, indexTest)).append("/")
//							.append(names.substring(indexTest - 3, indexTest)).append("/")
//							.append(names.substring(indexTest - 3, indexTest));
//		
//		System.out.println(stringBuilderTest);
		
	}

}
