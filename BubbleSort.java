package balaji;

public class BubbleSort {

	public static void main(String[] args) {
		int[] numbers= {2,5,3,6,8};
		for(int i=0;i<numbers.length-1;i++) {
			for(int j=0;j<numbers.length-1;j++) {
				if(numbers[j]>numbers[j+1]) {
					int temp=numbers[j];
					numbers[j]=numbers[j+1];
					numbers[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted list");
		for(int num:numbers) {
			System.out.println(num);
		}
		// TODO Auto-generated method stub

	}

}
