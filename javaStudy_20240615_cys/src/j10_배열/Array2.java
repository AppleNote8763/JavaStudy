package j10_배열;

public class Array2 {

	public static void main(String[] args) {

		int[] numbers = new int[10];
		
		// 0번 방부터 11, 12, 13... 갑을 넣으시오
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 11;
			System.out.print(numbers[i] + " ");
			if(i == numbers.length -1) System.out.println();
		}
		
		
		int[] numbers2 = new int[] {1, 2, 3, 4, 5};
		System.out.println(numbers2[3]);
		
		int[] numbers3 = {1, 2, 3, 4, 5};
		System.out.println(numbers3[4]);
		
	}

}
