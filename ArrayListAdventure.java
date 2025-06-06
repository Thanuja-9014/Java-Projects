package balaji;
import java.util.ArrayList;
public class ArrayListAdventure {

	public static void main(String[] args) {
		ArrayList<String> ob=new ArrayList<>();
		ob.add("Moto");
		ob.add("Patlu");
		ob.add("Bujji");
		ob.add("Dora");
		ob.add("Sinchan");
		System.out.println(ob);
		ob.set(1, "thanu");
		System.out.println(ob);
		for(String name:ob) {
			System.out.println(name);
		}
		// TODO Auto-generated method stub

	}

}
