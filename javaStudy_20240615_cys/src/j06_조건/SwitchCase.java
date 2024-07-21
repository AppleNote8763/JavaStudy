package j06_조건;

public class SwitchCase {

	public static void main(String[] args) {

		switch(35) {
			case 10:
				System.out.println("10입니다.");
			case 20:
				System.out.println("20입니다.");
			case 30:
				System.out.println("30입니다.");
			case 40:
				System.out.println("40입니다.");
			case 50:
				System.out.println("50입니다.");
				
		}
		
		
		switch("40") {
		case "10":
			System.out.println("10입니다.");
		case "20":
			System.out.println("20입니다.");
			break;
		case "30":
			System.out.println("30입니다.");
		case "40":
			System.out.println("40입니다.");
			System.out.println("추가 실행문");
			
			int num = 5;
			if (num == 5) {
				System.out.println("hi1");
				break;
			}else if (num == 10) {
				System.out.println("hi2");
			}
			System.out.println("hi3");
			
		case "50":
			System.out.println("50입니다.");
			
		}
		
		System.out.println("switchCase 밖");
		// break는 멈추고 밖으로 빠져나옴.
		
	}

}
