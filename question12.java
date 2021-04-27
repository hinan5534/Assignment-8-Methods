package Assignment_8;

public class question12 {

	public static void main(String[] args) {
		
		
		System.out.println(hamletQuote(true,false));
		
		
	}

		public static boolean hamletQuote(boolean q1,boolean q2) {
		
		if((q1==true&&q2==true)||(q1!=true&&q2==true)||(q1==true&&q2!=true)){
		return true;
			
		}else {
		return false;
		
		}
	
	}
}