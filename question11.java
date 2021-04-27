package Assignment_8;

public class question11 {

	public static void main(String[] args) {

		
		c_profits(100,300);
		
	}

		public static void c_profits(int buyPrice,int sellPrice) {
		
		if(buyPrice<sellPrice) {
		System.out.println("profit"); 
		
		}else if(buyPrice>sellPrice) {
		System.out.println("loss");
		
		}else if(buyPrice==sellPrice) {
		System.out.println("no loss");
		
		}
	
	}
}
