package Assignment_8;

public class question13 {

	public static void main(String[] args) { 
		
		
			System.out.println(waterBill(151));

	}

			public static double  waterBill(double bill) {
		
			if(bill<=50) {
			return (bill*0.60);
				
			}else if(bill>50&&bill<100) {
			return (bill*0.90);
			
			}else if(bill>100&&bill<150){
			return ((bill*0.9)+50);
		
			}else {
			return ((bill*0.9)+100);
			
			
			}
		
	}
	
	
}