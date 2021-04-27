package Assignment_8;

public class question15 {

	public static void main(String[] args) {
	
		
		int nextID = 2;
		int currentID = 1;
		boolean isNotEmpty = true;

		System.out.println(validateTask(isNotEmpty, currentID, nextID));
	}

	private static boolean validateTask(boolean isNotEmpty, int currentID, int nextID) {
		boolean flag = false;
		if ((nextID - currentID == 1) && isNotEmpty) {
			flag = true;
		}
		return flag;
	}

}
