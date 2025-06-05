package balaji;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
public class FriendsGraph {

	public static void main(String[] args) {
		Map<String,List<String>> ob=new HashMap<>();
		ob.put("Alice", Arrays.asList("Bob"));
		ob.put("Bob", Arrays.asList("Alice","Charlie"));
		ob.put("Charlie", Arrays.asList("Bob"));
		
		for(String person:ob.keySet()) {
			System.out.println(person+" is friends with"+ob.get(person));
		}
		// TODO Auto-generated method stub

	}

}
