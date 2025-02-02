package j11_상속.factory;

public class FactoryMain {

	public static void main(String[] args) {

		/*
		 *  삼성공장 5개
		 *  1공장을 가동합니다.
		 *  2공장을 가동합니다.
		 *  ...
		 *  5공장을 가동합니다.
		 *  
		 *  1공장을 중지합니다.
		 *  2공장을 중지합니다.
		 *  ...
		 *  5공장을 중지합니다.
		 *  
		 *  삼성공장 배열 만들기
		 *  배열안에 5개의 삼성 1,2,3,4,5 공장 넣기
		 *  배열을 반복을 돌려 가동, 중지하기
		 *  
		 */
		
		
		SamsungFactory[] samsungFactory = new SamsungFactory[5];
		
		for (int i = 0; i < samsungFactory.length; i++) {
			samsungFactory[i] = new SamsungFactory(i + 1);
		}
		
		for (int i = 0; i < samsungFactory.length; i++) {
			samsungFactory[i].start();
		}
		
		for (int i = 0; i < samsungFactory.length; i++) {
			samsungFactory[i].stop();
		}
		
	}

}
