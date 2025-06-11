package balaji;

public class ConstantTimeExample {
	public static void printFirstElement(int[] arr) {
		if(arr.length>0) {
			System.out.println("First element is:" +arr[0]);
		} else {
			System.out.println("Array is empty");
		}
	}

	public static void main(String[] args) {
		int[] numbers= {10,20,30,40,50,49,439,3498,249,24,49,39,30,28,29,40,49,495,59,509};      //o(1) complexity
		printFirstElement(numbers);    //how much time will be taken for the execution
		
		// TODO Auto-generated method stub

	}

}
