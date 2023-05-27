package COLLECTION;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {
public static void main(String[] args) {
	HashSet hs=new HashSet();
	hs.add("swati");
	hs.add(100);
	hs.add(100);
	hs.add(98.5f);
	hs.add("gopal");
	hs.add(null);
	hs.add(null);
	hs.add(null);
	hs.add("satiash");
	System.out.println(hs);
	System.out.println(hs.size());
	 Iterator itr=hs.iterator();
	 while(itr.hasNext()) {
		 System.out.println(itr.next());
	 }
	 System.out.println("--using for each loop--");
	 for(Object s1:hs) {
		 System.out.println(s1);
	 }
	 
	 
}
}
