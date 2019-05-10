package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionRotation {

	public static void main(String[] args) {
		 List list = Arrays.asList("one Two three Four five six".split(" "));
	      System.out.println("List :"+list);
	      Collections.rotate(list, 1);
	      System.out.println("rotate: " + list);

	}

}
