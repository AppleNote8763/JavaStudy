package j07_반복;

public class Break2 {

	public static void main(String[] args) {

		// break 를 만나면 멈추고 반복문 하나만 빠져나감
		int i = 0;
		
		while (i < 5) {
			System.out.println("i = " + i);
			
			int j = 0;
			while (j < 10) {
				System.out.println("\tj = " + j);
				if (j == 4) {
					break;
				}
				j++;
			}
			System.out.println("j while 밖");
			i++;
		}
		System.out.println("i while 밖");
		
	}

}
