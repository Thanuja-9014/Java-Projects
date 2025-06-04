package balaji;
import java.util.Stack;
public class StackExample {

	public static void main(String[] args) {
		Stack<Integer> ob=new Stack<>();
		ob.push(81);
		ob.push(82);
		ob.push(83);
		ob.push(84);
		ob.push(86);
		System.out.println(ob);
		System.out.println(ob.pop());
		System.out.println(ob.empty());
		System.out.println(ob.peek());

	}

}
