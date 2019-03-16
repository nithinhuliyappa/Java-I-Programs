
public class LargestPossibleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12344;
	    int[] times = new int[10];
	    while (num != 0) {
	        if (num == 0) {
	            break;
	        }
	        int val = num % 10;
	        System.out.println("Val is "+ val);
	        times[val]++;
	        num /= 10;
	        System.out.println("num is "+ num);
	    }
	    String largestNumber = "";
	    for (int i = 9; i >= 0; i--) {
	        for (int j = 0; j < times[i]; j++) {
	            largestNumber += i;
	        }
	    }
	    
	    int n = Integer.valueOf(largestNumber);
	    
        System.out.println("Largest Number possible is "+ n);
	}
}
