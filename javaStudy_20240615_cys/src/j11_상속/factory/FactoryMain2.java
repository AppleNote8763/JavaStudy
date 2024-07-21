package j11_상속.factory;

public class FactoryMain2 {


	public static void main(String[] args) {
		
		/*
		 * 팩토리 공장배열 만들기(크기 : 5)
		 * 
		 * 삼성1
		 * 엘지1
		 * 삼성2
		 * 삼성3
		 * 엘지2
		 * 
		 * 모든 공장 다 가동
		 * 가동이 끝난 후
		 * 모든 공장을 다 중지
		 */
			
//		Factory[] factories = new Factory[5];
			
//		factories[0] = new SamsungFactory(1);
//		factories[1] = new LGFactory(1);
//		factories[2] = new SamsungFactory(2);
//		factories[3] = new SamsungFactory(3);
//		factories[4] = new LGFactory(2);
			
		Factory[] factories = {new SamsungFactory(1), 
								new LGFactory(1), 
								new SamsungFactory(2), 
								new SamsungFactory(3), 
								new LGFactory(2)};
			
		for(int i = 0; i < factories.length; i++) {
			factories[i].start();
			
		}
		for(int i = 0; i < factories.length; i++) {
			
			factories[i].stop();
		}
	}

}

	
	

