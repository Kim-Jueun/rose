package chapter6;

public class CardCompanyTest {

	public static void main(String[] args) {
     CardCompany myCardCompany1 = CardCompany.getInstance();
     CardCompany myCardCompany2 = CardCompany.getInstance();
     System.out.println(myCardCompany1 == myCardCompany2 );
     
	}

}
