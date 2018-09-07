import java.util.Scanner;

public class NumberCheck {

	public static void main(String[] args) {
		
		int[] myArray = new int[11];
		
		Scanner s = new Scanner(System.in);
		
		for (int i=1;i<myArray.length;i++) {
			System.out.print("Number,please:");
			myArray[i]= s.nextInt();
		}
		if(hasSeven(myArray))
			System.out.println("This one has seven");
		else
			System.out.println("no seven ");
		
		if(smallerthan7(myArray)) {
			System.out.println("All numbers are smaller than 7 and not even");
		}else {
			System.out.println("some numbers are bigger than 7 and even");
		}
			
	}
	
	public static boolean smallerthan7(int[] someArray) {
		for (int i=1;i<someArray.length;i++) {
			if (someArray[i]<7|| someArray[i]%2==1) {
				return true;
			}else 
			if(someArray[i]>7 || someArray[i]%2 == 0) {
				return true;
			} 
			
		}
	return false;
	}
	/**
	 * check to see if any number are equal to 7
	 * @param someArray
	 * @return
	 */
    public static boolean hasSeven(int[] someArray){
    	//traverse the array
    	for (int i=1;i<someArray.length;i++) {
			//test if it is equal to 7
    		if (someArray[i]==7) {
    			return true;
    		}
    		
		}
    	return false;
    }
	
}

