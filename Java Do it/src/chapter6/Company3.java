package chapter6;

public class Company3 {
		
	private static Object instance1;
	private static Company instance;

	public static Object getInstance() {
		
		if(instance1 == null) {
			instance1 = new Company();
		}
		return instance1;
	}
}

