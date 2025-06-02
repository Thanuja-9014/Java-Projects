package balaji;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;

public class HashSetexample {

	public static void main(String[] args) {
		HashSet<Integer> ob=new HashSet<>();
		ob.add(1);
		ob.add(3);
		ob.add(4);
		ob.add(2);
		ob.add(5);
		ob.add(1);
		ob.add(2);
		System.out.println(ob);
		if(ob.contains(6)) {
			System.out.println("existed");
		}
		else {
			System.out.println("Not existed");
		}
		ArrayList<Integer> list=new ArrayList<>(ob);
		System.out.println(list);
		Iterator<Integer> it = ob.iterator();

        // Iterate through the LinkedList
        System.out.println("Iterating using Iterator:");
        while (it.hasNext()) {
            int a = it.next();
            System.out.println(a);
		// TODO Auto-generated method stub

	}

}
}
