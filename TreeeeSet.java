package balaji;
import java.util.TreeSet;
public class TreeeeSet {

	public static void main(String[] args) {
		TreeSet<Integer> ob=new TreeSet<>();
		ob.add(5002);
		ob.add(4998);
		ob.add(5005);
		ob.add(4999);
		ob.add(5001);
		System.out.println("Book ids:"+ob);
		System.out.println(ob.first());
		System.out.println(ob.last());
		System.out.println(ob.higher(5001));
		System.out.println(ob.lower(5002));
		// TODO Auto-generated method stub

	}

}
