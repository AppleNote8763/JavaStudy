package j11_상속.factory;

public class FactoryMain4 {

	public static void main(String[] args) {
		/*
		 * 공장 배열 만들기
		 * 
		 * 삼성1
		 * 엘지1
		 * 엘지2
		 * 엘지3
		 * 삼성2
		 * 삼성3
		 * 
		 * 모든 공장 가동
		 * 
		 * 각각의 공장에서 제작할 수 있는 물건 제작
		 * 삼성 스마트폰~
		 * 엘지 스마트 티비~
		 * ... 
		 * 다 제작시
		 * 중지
		 * 
		 * 
		 */

		Factory[] factories = {new SamsungFactory(1), 
							new LGFactory(1), 
							new LGFactory(2), 
							new LGFactory(3), 
							new SamsungFactory(2), 
							new SamsungFactory(4)};
		
		for(int i = 0; i < factories.length; i++) {
			factories[i].start();
			
		}
		for(int i = 0; i < factories.length; i++) {
			if(factories[i] instanceof SamsungFactory) {
				((SamsungFactory)factories[i]).produceSmartPhone();
			}else if(factories[i] instanceof LGFactory) {
				((LGFactory)factories[i]).SmartTv();
			}
		}
		}

	}
	

