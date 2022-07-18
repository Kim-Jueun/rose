package chapter6;

public class Card {
	
	public static int serialNum = 100;
	public int cardID;
	
	
		public Card() {
		serialNum++;
		cardID = serialNum; 
		}
		
					
		public int getCardID() {
			return cardID;
		}
		
		public void setCardID(int ID) {
			cardID = ID;
		}
		
		public static void main(String[] args) {
		System.out.println(serialNum);

		}
}	
	
	

	
	
	

