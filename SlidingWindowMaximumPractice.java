package balaji;

import java.util.*;

public class SlidingWindowMaximumPractice {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k <= 0) return new int[0];

        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {
            // Remove indexes of elements not in the window
            if (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }

            // Remove smaller numbers in k range as they are useless
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            deque.offer(i);

            // The front of the deque is the largest element in the window
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peek()];
            }
        }

        return result;
    }

    // ✅ Main method to test the code
    public static void main(String[] args) {
        SlidingWindowMaximumPractice sw = new SlidingWindowMaximumPractice();
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] result = sw.maxSlidingWindow(nums, k);

        System.out.println("Sliding Window Maximums:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
