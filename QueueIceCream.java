package balaji;
import java.util.Queue;
import java.util.LinkedList;
public class QueueIceCream {

	public static void main(String[] args) {
		Queue<String> ob=new LinkedList<>();
		ob.add("kid 1");
		ob.add("kid 2");
		ob.add("kid 3");
		ob.add("kid 4");
		ob.add("kid 5");
		System.out.println(ob);
		System.out.println(ob.peek());
		System.out.println(ob.poll());
		ob.add("kid 6");
		System.out.println(ob);
		
		// TODO Auto-generated method stub

	}

}
