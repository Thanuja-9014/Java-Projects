package balaji;
import java.util.Queue;
import java.util.LinkedList;
public class QueueExample {

	public static void main(String[] args) {
		Queue<Integer> ob=new LinkedList<>();
		ob.add(81);
		ob.add(82);
		ob.add(83);
		ob.add(84);
		ob.add(85);
		System.out.println(ob);
		System.out.println(ob.size());
		System.out.println(ob.isEmpty());
		System.out.println(ob.peek());
		System.out.println(ob.poll());
		System.out.println(ob);
		System.out.println(ob.poll());
		System.out.println(ob);
		
		
		// TODO Auto-generated method stub

	}

}
