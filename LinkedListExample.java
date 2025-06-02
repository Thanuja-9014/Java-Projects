package balaji;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> ob=new LinkedList<>();
		ob.add("aa");
		ob.add("bb");
		ob.add("cc");
		ob.add("dd");
		ob.add("zz");
		ob.add("hh");
		System.out.println(ob);
		ob.remove(2);
		ob.remove("bb");
		System.out.println(ob);
		Collections.reverse(ob);
		System.out.println(ob);
		Collections.sort(ob);
		System.out.println(ob);
		int index=ob.indexOf("zz");
		System.out.println(index);
		if(ob.contains("ja")) {
			System.out.println("aa exixted in the list");
		}
		else {
			System.out.println("Not existed");
		}
		
		// TODO Auto-generated method stub

	}

}
