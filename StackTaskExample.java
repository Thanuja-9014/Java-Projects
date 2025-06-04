package balaji;
import java.util.Stack;
public class StackTaskExample {

	public static void main(String[] args) {
		Stack<String> ob=new Stack<>();
		ob.push("Plate 1");
		ob.push("Plate 2");
		ob.push("Plate 3");
		ob.push("Plate 4");
		ob.push("Plate 5");
		ob.push("Plate 6");
		System.out.println(ob);
		System.out.println(ob.peek());
		System.out.println(ob.empty());
		System.out.println(ob.pop());
		System.out.println(ob.size());
		
		// TODO Auto-generated method stub

	}

}
