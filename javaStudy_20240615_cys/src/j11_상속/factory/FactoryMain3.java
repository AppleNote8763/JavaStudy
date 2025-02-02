package j11_상속.factory;

public class FactoryMain3 {

	public static void main(String[] args) {
		SamsungFactory samsungFactory = new SamsungFactory(1);
		System.out.println();
		System.out.println(samsungFactory);
		samsungFactory.testSamsung();
		
		Factory factory = new SamsungFactory(2);
		System.out.println();
		System.out.println(factory);
		((SamsungFactory)factory).testSamsung();
		
		Factory factory2 = new Factory(1);
		System.out.println();
		System.out.println(factory2);
		//((SamsungFactory)factory).testSamsung(); 잘못된 것
		
		System.out.println(factory instanceof SamsungFactory);
		System.out.println(factory instanceof LGFactory);
	}

}
