package balaji;

public class LinearSearchExample {

	public static void main(String[] args) {
		int[] numbers = {5, 8, 3, 5, 1};
		int target = 3;
		boolean found = false;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == target) {
				System.out.println("Found " + target + " at index " + i);
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("Target " + target + " not found in the array.");
		}
	}
}
