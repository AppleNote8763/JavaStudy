package j07_반복;

public class Break {

	public static void main(String[] args) {

		int i = 0;
		
		while (i < 5) {
			System.out.println("i = " + i);
			
			if(i == 3) break;
			i++;
		}
		
		System.out.println("while 밖");
		
		
	}

}
