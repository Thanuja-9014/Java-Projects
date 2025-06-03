package balaji;
import java.util.TreeSet;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ob=new TreeSet<Integer>();
		ob.add(50);
		ob.add(10);
		ob.add(50);
		ob.add(20);
		ob.add(50);
		ob.add(70);
		ob.add(30);
		System.out.println(ob);
		System.out.println(ob.first());
		System.out.println(ob.last());
		System.out.println(ob.higher(30));
		System.out.println(ob.pollFirst());
		System.out.println(ob.pollLast());
		System.out.println(ob.contains(40));

	}

}
