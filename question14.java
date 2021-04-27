package Assignment_8;

public class question14 {

	public static void main(String[] args) {
		
		System.out.println(truthTable(true,false,true));
		
		}

		public static boolean truthTable(boolean a,boolean b, boolean c) {
		
		if(c==true) {
		return true;
		
		}else if(a==true&&b==true) {
		return true;
		
		}else {return false;}
			
	} 
}