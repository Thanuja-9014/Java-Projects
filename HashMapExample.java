package balaji;
import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer,String> ob=new HashMap<>();
		ob.put(3381,"Thanu");
		ob.put(3386,"Varsha");
		ob.put(3384,"vamsi");
		ob.put(3396,"Anil");
		ob.put(3397,"Hadhya");
		ob.put(3397,"upma");
		ob.put(3397,"Hadhya");
		System.out.println(ob);
		ob.remove(3397);
		System.out.println("After removing" +ob);
		ob.put(3397, "Pandu");
		System.out.println("After updating" +ob);
		if(ob.containsKey(3387)) {
			System.out.println("existed");
		}
		else {
			System.out.println("not existed");
		}
		System.out.println("Keys:");
		for(Integer key:ob.keySet()) {
			System.out.println(key);
		}
		System.out.println("Values:");
		for(String value:ob.values()) {
			System.out.println(value);
		}
		for (var entry : ob.entrySet()) {
		    System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}

		// TODO Auto-generated method stub
	}

}
