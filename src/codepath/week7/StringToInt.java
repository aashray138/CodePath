package codepath.week7;

public class StringToInt {

	public static void main (String [] args) {
		
		String str = "211";
		
		 int i = 0;
		    int num = 0;
		    boolean isNeg = false;

		    //Check for negative sign; if it's there, set the isNeg flag
		    if (str.charAt(0) == '-') {
		        isNeg = true;
		        i = 1;
		    }

		    //Process each character of the string;
		    while( i < str.length()) {
		        num *= 10;
		        num += str.charAt(i++) - '0'; //Minus the ASCII code of '0' to get the value of the charAt(i++).
		    }

		    if (isNeg)
		        num = -num;
	
		    	System.out.println(num);
		    
		}
	}
	   