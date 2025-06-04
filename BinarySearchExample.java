package balaji;

public class BinarySearchExample {

	public static void main(String[] args) {
		int[] numbers = {2,3,4,6,8,9}; // Sorted array
		int target = 9;

		int left = 0;
		int right = numbers.length - 1;
		boolean found = false;

		while (left <= right) {
			int mid = (left + right) / 2;

			if (numbers[mid] == target) {
				System.out.println("Found " + target + " at index " + mid);
				found = true;
				break;
			} else if (target < numbers[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}

		if (!found) {
			System.out.println("Target " + target + " not found in the array.");
		}
	}
}
