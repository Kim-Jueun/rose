package chapter6;

public class CoffeeTest {

	public static void main(String[] args) {
		
		Mrs MrsKim = new Mrs("Kim",4000);
		Mrs MrsLee = new Mrs("Lee",4500);
		
		Coffee coffee아메리카노 = new Coffee("아메리카노");
        MrsKim.buyCoffee(coffee아메리카노);
        MrsKim.showInfo();
        coffee아메리카노.showInfo();
        
        Coffee coffee라떼= new Coffee("라떼");
        MrsLee.buyCoffee(coffee라떼);
        MrsLee.showInfo();
        coffee라떼.showInfo();
	}

}
