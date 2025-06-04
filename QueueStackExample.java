package balaji;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class QueueStackExample {

	public static void main(String[] args) {
		Stack<String> ob=new Stack<>();
		ob.push("Ball");
		ob.push("Blocks");
		ob.push("Puzzle");
		System.out.println(ob);
		System.out.println(ob.pop());//pop
		System.out.println(ob.peek());//top item
		System.out.println(ob);
		Queue<String> ob1=new LinkedList<>();
		ob1.add("Maya");
		ob1.add("Leo");
		ob1.add("Nina");
		System.out.println(ob1);
		System.out.println(ob1.peek());//first item
		String[] q = ob1.toArray(new String[0]);//convert string to array
		System.out.println(q[1]);//accessing after first item
		System.out.println(ob);
		// TODO Auto-generated method stub

	}

}
