package codepath.week4;

import java.util.HashMap;

public class NumberOfOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] fruitArray = {"Apple", "Banana", "Orange", "Grapes","Apple"};
		
		HashMap<String, Integer> frequencymap = new HashMap <String, Integer>();
		
		for (int i = 0 ; i < fruitArray.length ; i++) {
		  if(frequencymap.containsKey(fruitArray[i])) {
		    frequencymap.put(fruitArray[i], frequencymap.get(fruitArray[i])+1);
		  }
		  else{ frequencymap.put(fruitArray[i], 1); }
		}
		
		System.out.println("Frequency of word Apple is " + frequencymap.get("Apple"));
	}
		
	}


