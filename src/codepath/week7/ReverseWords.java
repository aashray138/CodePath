package codepath.week7;

public class ReverseWords {

	public static void main(String[] args) {
		
		String word = "The words in My eyes ";

		 String[] words = word.trim().split(" +");
		 
	        StringBuilder sb = new StringBuilder();
	        
	        for(int i = words.length - 1; i > 0; i--) 
				sb.append(words[i] + " ");
	        
	       System.out.println(sb.append(words[0]).toString());
}
}

// String[] parts = s.trim().split("\\s+");
//String out = "";
//for (int i = parts.length - 1; i > 0; i--) {
//    out += parts[i] + " ";
//}
//
//System.out.println( out + parts[0]);