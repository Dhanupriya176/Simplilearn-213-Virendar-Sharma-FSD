package Collections;

import java.util.HashSet;

public class Hashset {

		public static void main(String[] args){
			
			//LinkedHashSet<String> has=new LinkedHashSet<String>();
			HashSet<String> fruits =new HashSet<String>();
			
			fruits.add("mango");
			fruits.add("orange");
			fruits.add("papaya");
			fruits.add("grapes");
			fruits.add("pears");
			fruits.add("dragon");
			fruits.add("kiwi");
			fruits.add("guava");
			fruits.add("watermelon");
			fruits.add("banana");
					
			System.out.println("Hashset is "+fruits);
			System.out.println("Size of Hashset is "+ fruits.size());
			System.out.println("remove the kiwi,papaya "+fruits.remove("kiwi")+fruits.remove("papaya"));
			System.out.println("add 3 the fruits "+fruits.add("cherry")+fruits.add("apple")+fruits.add("red banana"));

			
			System.out.println("Size of Hashset is "+ fruits.size());

			System.out.println("Does hashset contains orange fruits  " + fruits.contains("orange"));		
			
		    fruits.clear();
			
		    System.out.println("is hashset empty  " +fruits.isEmpty());
		    
		    
			
		}

		}
	





