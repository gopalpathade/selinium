package COLLECTION;

import java.util.Iterator;
import java.util.LinkedList;

public class linklist {
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add("gopal");
		l1.add("nikhil");
		l1.add(102);
		l1.add(102);
		l1.add(null);
		l1.add("rupesh");
		System.out.println(l1);
Iterator itr = l1.iterator()	;	
		while(itr.hasNext())
		{System.out.print(itr.next()+" ");}
		
		System.out.println("using for each loop");	
		for(int i=0;i<=l1.size()-1;i++) {
			System.out.print(l1.get(i));
			
		}
		
		
		
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	


