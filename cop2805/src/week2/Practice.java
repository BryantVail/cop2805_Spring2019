package week2;

import java.util.ArrayList;
import java.util.Iterator;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = new ArrayList<>();
		names.add("Bry");
		names.add("Lew");
		names.add("John");
		
//		for(int i = 0; i < names.size(); i++) {
//			System.out.print(names.get(i)+", ");
//		}
		
		for(String name: names) {
			System.out.print(name+", ");
		}
		
		Iterator<String> iterator = names.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next());
		}
		

	}

}
