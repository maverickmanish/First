package collections;

import java.util.HashSet;

public class HashSett {

	public static void main(String[] args) {
		HashSet<String> set= new HashSet<>();
		set.add("java");
		set.add("c");
	      set.add("c++");
	      //Adding duplicate elements
	      set.add("java");
	      set.add("c++");
	      set.add(null);
	      set.add(null);
	      
	      System.out.println(set);
	      System.out.println(set.toString());
	      for(String s:set)
	      {
	    	  System.out.println(s);
	      }
	      
	      System.out.println();
	}
}
