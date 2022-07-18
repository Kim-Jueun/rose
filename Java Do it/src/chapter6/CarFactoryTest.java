package chapter6;

public class CarFactoryTest {

	public static void main(String[] args) {
       CarFactory factory = new CarFactory();
       factory.setCarName("my Sonatna");
       System.out.println(CarFactory.getserialNum());
       System.out.println(factory.carName+"자동차 번호:"+factory.carID);
       
       CarFactory factorySon = new CarFactory();
       factorySon.setCarName("your Sonatna");
       System.out.println(CarFactory.getserialNum());
       System.out.println(factorySon.carName+"자동차 번호:"+factorySon.carID);
      
       
	}

}
