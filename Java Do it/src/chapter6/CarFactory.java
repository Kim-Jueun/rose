package chapter6;

public class CarFactory {
		public static int serialNum = 10001;
		public int carID;
		public String carName;
		
		public CarFactory() {
			serialNum++;
			carID = serialNum;
		}
		
		public String getCarName() {
			return carName;
		}
		
		public void setCarName(String name) {
			carName = name;
		}

		public static int  getserialNum() {
			
			return serialNum;
		}
}
