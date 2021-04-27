package Assignment_8;

public class question16 {

	public static void main(String[] args) {
		
		System.out.println(booking(true,8,4,2019));
		
		}

	
		public static  boolean booking(boolean condition,int month,int day, int year) {
		
		
		if(condition!=true||year!=2018||(month==7&&(day<9||day>1))) {
		return false;
		
		}else {
		return true;
		}
		
	}
	
}