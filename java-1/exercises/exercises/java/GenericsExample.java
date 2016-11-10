/* Class for the Generics problem
Author: Javier Reyes
*/

import java.util.ArrayList;
import java.util.List;


public class GenericsExample {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Add example");
		list.add("Add another");
		String s = list.get(0);

		System.out.println(s);
		System.out.println(list.get(1));

	}
}