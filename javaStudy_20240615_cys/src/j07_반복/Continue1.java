package j07_반복;

public class Continue1 {

	public static void main(String[] args) {

int i = 0;
		
		while(i < 5) {
			
			if (i == 2) {
				i++;
				continue;	// 반복문 제일 처음으로 돌아감
			}
			
			System.out.println("i = " + i);
			
			i++;
		}
		
		
	}

}
