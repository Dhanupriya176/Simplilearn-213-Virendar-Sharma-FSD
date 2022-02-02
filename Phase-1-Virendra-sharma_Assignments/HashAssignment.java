package ExceptionHandling;

import java.util.*;

	class HashsetAssignment{
		
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
			
			System.out.println("Does hashset contains orange fruits  " + fruits.contains("orange"));		
			System.out.println("is hashset empty  " + fruits.isEmpty());
			System.out.println("remove the kiwi "+fruits.remove("kiwi"));
			
			
		    fruits.clear();
		    System.out.println("get class  " +fruits.getClass());
			
		    System.out.println("is hashset empty  " +fruits.isEmpty());
		    
		    
			
		}

		}
	

