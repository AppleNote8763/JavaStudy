package j10_배열.Arrays;

import java.util.Arrays;

public class Arrays1 {

	public static void main(String[] args) {

		/*
		 *	1. Arrays 클래스 사용법
		 * 	 - 배열을 관리해주는 객체
		 * 
		 * 	1) 배열의 내용을 검색 후 인덱스 값을 반환벋는 방법
		 * 	 - binarySearch()
		 * 
		 * 	2) 배열을 복사할 때 사용하는 메소드
		 * 	 - copyOf(복사하고자 하는 배열, 새로 생설할 배열의 크기)
		 * 
		 * 	3) 배열을 복사할 때 원하는 범위만 복사해주는 메소드
		 * 	 - copyOfRange(복사하고자 하는 배열, 시작 인덱스, 마지막 인덱스)
		 * 
		 * 	4) 배열을 초기화하고 원하는 값으로 모두 채우는 메소드
		 * 	 - fill(초기화하고자 하는 배열, 채울 값)
		 * 
		 * 	5) 배열을 정렬하는 방법)
		 * 	 - sort(정렬하고자 하는 배열)
		 */
		
		int[] numbers = {1, 8, 4, 2, 3, 4, 6, 8, 7};
//		Arrays1 arrays1 = new Arrays1();
//		arrays1.printArray(numbers);
		
		// 얕은 복사
		int[] numbers2 = numbers;
		printArray(numbers);
		printArray(numbers2);
		System.out.println();
		numbers2[1] = 11;
		
		printArray(numbers2);
		printArray(numbers);
		System.out.println();
		
		System.out.println(numbers);
		System.out.println(numbers2);

		// 깊은 복사 numbers3
		int[] numbers3 = new int[numbers.length];
		for (int i = 0; i < numbers3.length; i++) {
			numbers3[i] = numbers[i];
		}
		
		printArray(numbers3);
		numbers3[2] = 13;
		System.out.println();
		printArray(numbers);
		printArray(numbers3);
		
		System.out.println();
		int[] numbers4 = Arrays.copyOf(numbers, numbers.length + 10);
		
		printArray(numbers4);
		numbers4[0] = 10;
		printArray(numbers);
		printArray(numbers4);
		System.out.println();
		
		// 범위 지정하여 카피
		int[] numbers5 = Arrays.copyOfRange(numbers, 1, 5);
		printArray(numbers5);
		System.out.println();
		
		// 오름차순정렬
		printArray(numbers4);
		Arrays.sort(numbers4);
		printArray(numbers4);
		System.out.println();
		
		// 배열 초기화 후 채우기
		Arrays.fill(numbers5, 10);
		printArray(numbers5);
		
		// 배열 인덱스 검색후 반환
		int index = Arrays.binarySearch(numbers, 3);
		System.out.println("찾은 인덱스: " + index);
		
		
	}
	
	
	/*
	 *  메소드 만들기
	 *  메소드명: printArray
	 *  printArray(numbers);
	 *  
	 *  출력
	 *  Array: [1, 8, 3, 2, 3, 4, 6, 8, 7]
	 *  
	 */
	
	public static void printArray(int[] numbers) {
		
		System.out.print("Array: [");
		for (int i = 0; i < numbers.length; i++) {
//			if (i == 0) {
//				System.out.print(numbers[i]);
//				System.out.print(", ");
//			}else if (i < numbers.length -1) {
//				System.out.print(numbers[i]);
//				System.out.print(", ");
//			}else if (i == numbers.length -1) {
//				System.out.print(numbers[i]);	
//			}
			System.out.print(numbers[i]);
			if(i != numbers.length -1) {
				System.out.print(", ");
			}
			
		}
		System.out.println("]");
	}

}
