package COLLECTION;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Vector;

public class vector {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(101);
		v.add("gopal");
		v.add("sandip");
		v.add(null);
		v.add(101);
		v.add(null);
		System.out.println(v);
		Enumeration ele = v.elements();
		while(ele.hasMoreElements()) {
		System.out.println	(ele.nextElement());
				}
		
		System.out.println("using each loop");
		for(Object s1:v) {
			System.out.println(s1);
			System.out.println("---");
			HashSet s2=new HashSet(v);
			for(Object s3:s2) {
				System.out.println(s3);
			}
		}
	}

}
