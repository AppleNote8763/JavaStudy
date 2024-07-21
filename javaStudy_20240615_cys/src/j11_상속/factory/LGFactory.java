package j11_상속.factory;

public class LGFactory extends Factory{

	public LGFactory(int factoryNumber) {
		super(factoryNumber);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void start() {
		System.out.print("LG	");
		super.start();
	}
	@Override
	public void stop() {
		System.out.print("LG	");
		super.stop();
	}
	
	public void SmartTv() {
		System.out.println("엘지 스마트TV를 제작합니다.");
	}
}
