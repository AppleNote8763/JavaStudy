package 계산기;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		String textNum1 = null;
		String textNum2 = null;
		int textLength = 0;
		String arithmetic = null;
		String text = null;
		int indexIndexOf = 0;
		
		System.out.println("계산기");
		
		System.out.print("사칙연산을 입력하세요: ");
		text = scanner.nextLine();
		textLength = text.length();
		System.out.println("사칙연산길이\t" + textLength);
		
		
		// 실행됨
//		indexIndexOf = text.indexOf("+");
//		if(indexIndexOf < 0) {
//			indexIndexOf = text.indexOf("-");
//			if(indexIndexOf < 0) {
//				indexIndexOf = text.indexOf("*");
//				if(indexIndexOf < 0) {
//					indexIndexOf = text.indexOf("/");
//				}
//			}
//		}
		
		// 실행됨
		if(text.contains("+")) {
			indexIndexOf = text.indexOf("+");
		}else if (text.contains("-")) {
			indexIndexOf = text.indexOf("-");
		}else if (text.contains("*")) {
			indexIndexOf = text.indexOf("*");
		}else if (text.contains("/")) {
			indexIndexOf = text.indexOf("/");
		}
		
		
		
		// 에러뜸
//		if(text.equals("+")) {
//			indexIndexOf = text.indexOf("+");
//		}else if(text.equals("-")) {
//			indexIndexOf = text.indexOf("-");
//		}else if(text.equals("*")) {
//			indexIndexOf = text.indexOf("*");
//		}else if(text.equals("/")) {
//			indexIndexOf = text.indexOf("/");
//		}
		
		// 에러뜸
//		if(indexIndexOf < 0) {
//			indexIndexOf = text.indexOf("-");	
//		}else if(indexIndexOf < 0) {
//			indexIndexOf = text.indexOf("*");
//		}else if(indexIndexOf < 0) {
//			indexIndexOf = text.indexOf("/");
//		}
		
		// 에러뜸
//		indexIndexOf = text.indexOf("+");
//		indexIndexOf = text.indexOf("-");
//		indexIndexOf = text.indexOf("*");
//		indexIndexOf = text.indexOf("/");
		
		
		System.out.println("사칙연산 부호위치\t" + indexIndexOf);
		
		arithmetic = text.substring(indexIndexOf, indexIndexOf + 1);
		System.out.println("부호\t" + arithmetic);
		
		textNum1 = text.substring(0, indexIndexOf);
		System.out.println("첫숫자String\t" + textNum1);
		
		num1 = Integer.parseInt(textNum1);
		System.out.println("첫숫자int\t" + num1);
		
		textNum2 = text.substring(indexIndexOf + 1);
		System.out.println("끝숫자String\t" + textNum2);
		
		num2 = Integer.parseInt(textNum2);
		System.out.println("끝숫자int\t" + num2);
		
		if(arithmetic.equals("+")) {
			System.out.println("결과" + (num1 + num2));
		}else if (arithmetic.equals("-")) {
			System.out.println("결과" + (num1 - num2));
		}else if (arithmetic.equals("*")) {
			System.out.println("결과" + (num1 * num2));
		}else if (arithmetic.equals("/")) {
			System.out.println("결과" + (num1 / num2));
		}
		
		
		
		
		
		
		scanner.close();
		

		
		
		
		
	}

}
