package COLLECTION;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class practice_example1 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(101);
		al.add("ritesh");
		al.add(null);
		al.add(101);
		al.add(null);
		al.add(103);
		al.add(107);
		al.add("kajal");
		
		al.add(5, 102);
		System.out.println(al);
		
		al.remove(5);
		System.out.println(al);
		System.out.println(al.isEmpty());
		System.out.println(al.get(1));
		System.out.println("using itrarator---");
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}System.out.println("using for loop---");
		for(int i=0;i<=al.size()-1;i++) {
			System.out.println(al.get(i));}
			System.out.println("using listitretor");
			ListIterator ltr = al.listIterator();
			while(ltr.hasNext()) {
				System.out.println(ltr.next());
			}
		System.out.println("using for eachloop---");
		for(Object g1 :al) {
			System.out.println(g1);
		}
		
		
		
	}

}
