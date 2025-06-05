package balaji;
import java.util.TreeSet;
import java.util.NavigableSet;
public class EmployeeReverse {

	public static void main(String[] args) {
		TreeSet<String> ob=new TreeSet<>();
		ob.add("sumit");
		ob.add("kiran");
		ob.add("Anjali");
		ob.add("Mohan");
		ob.add("Zoya");
		System.out.println(ob);
		
		
		 NavigableSet<String> reversed = ob.descendingSet();
	        System.out.println("Reversed TreeSet: " + reversed);
		// TODO Auto-generated method stub

	}

}
