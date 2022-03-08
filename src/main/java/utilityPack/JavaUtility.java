package utilityPack;

import java.util.Random;

public class JavaUtility {
	
	
	
	public int generateRandomNum() {
		
		Random r= new Random();
		int randomNum = r.nextInt(500);
		return randomNum;
		
	}
	

}
