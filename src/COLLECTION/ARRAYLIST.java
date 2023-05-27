package COLLECTION;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class ARRAYLIST{
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("gopal");
		al.add(101);
		al.add(null);
		al.add(45.6f);
		al.add(101);
		al.add("riestsh");
		al.add(459);
		al.add(103);
		al.add(4,104);
		System.out.println(al);
		al.remove(4);
		System.out.println(al);
		System.out.println(al.get(1));
Iterator  itr=al.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
System.out.println("---print data using listiterator");
ListIterator   liter=al.listIterator();		
		while(liter.hasNext()) {
			System.out.println(liter.next());}
		System.out.println("---print date using for loop");
		for (int i=0;i<=al.size()-1;i++) {
			System.out.println(al.get(i));}
System.out.println("--print dada usning each loop");
for(Object g1 :al) {
	System.out.println(g1);}
	System.out.println(al.size());
al.clear();
System.out.println(al.size());
		
		
		
	}

	
}
