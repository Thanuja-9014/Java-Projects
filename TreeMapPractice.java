package balaji;
import java.util.TreeMap;
import java.util.Scanner;
public class TreeMapPractice {

	public static void main(String[] args) {
		TreeMap<Integer,String> ob=new TreeMap<>();
		Scanner sc=new Scanner(System.in);
		ob.put(20,"thanu");
		ob.put(20,"mohan");
		ob.put(15,"chitti");
		ob.put(19,"anu");
		System.out.println(ob);
		for (int name : ob.keySet()) {
            System.out.println(name + " => "+ ob.get(name));
        }

        // Search for a contact
        System.out.print("\nEnter marks to search: ");
        int searchName = sc.nextInt();

        if (ob.containsKey(searchName)) {
            System.out.println("Found: " + searchName + " => " + ob.get(searchName));
        } else {
            System.out.println("Contact not found: " + searchName);
        }

        sc.close();
		
		
		// TODO Auto-generated method stub

	}

}
