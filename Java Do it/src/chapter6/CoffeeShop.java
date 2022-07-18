package chapter6;

public class CoffeeShop {

	 String coffeeShopName;
	 String coffeeName;
	 int  money;
	 String Mrs;
	
	public CoffeeShop(String coffeeName) {
		this.coffeeName = coffeeName;
	}
	
	public void sale( int money ) {
		
		this.money += money;
		
	
		
	}
	
	public void showInfo() {
		System.out.println(coffeeShopName+"에서 씨는"+coffeeName+"를"+money+"사 마셨습니다.");
	}
	
	
	
		
	}


