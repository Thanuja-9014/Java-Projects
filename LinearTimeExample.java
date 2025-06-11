package balaji;

public class LinearTimeExample {
	public static void printAllElements(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println("element" +i+":"+arr[i]);;
		}
	}

	public static void main(String[] args) {
		int[] numbers= {10,20,30,30,40,50};        //O(n) - Linear time example
		printAllElements(numbers);          
		// TODO Auto-generated method stub

	}

}
