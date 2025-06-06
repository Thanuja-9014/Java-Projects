package balaji;
import java.util.HashMap;
public class GroceryBasketHashMap {

	public static void main(String[] args) {
		HashMap<String,Integer> ob=new HashMap<>();
		ob.put("Apple", 40);
		ob.put("Milk", 60);
		ob.put("Vegetables", 100);
		ob.put("Flowers", 50);
		ob.put("Sweet", 40);
		System.out.println(ob);
		int total=0;
		for(int cost:ob.values()) {
			total+=cost;
		}
		System.out.println(total);
		// TODO Auto-generated method stub

	}

}
