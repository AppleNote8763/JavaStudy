package j10_배열.Arrays;

public class TestMethod {

	public static void main(String[] args) {

		String[] strs = {"홍길동", "홍길서", "홍길남"};
		
		TestMethod testMethod = new TestMethod();
		testMethod.printStr(strs);
		
		/*
		 *  printStr(strs)
		 *  
		 *  1. 홍길동
		 *  2. 홍길서
		 *  3. 홍길남
		 */
		
		 
	}
	
	public void printStr(String[] arrStr) {
		for (int i = 0; i < arrStr.length; i++) {
			System.out.println((i + 1) + ". " + arrStr[i]);
		}
	}

}
