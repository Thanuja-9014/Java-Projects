package balaji;

public class BubbleSortStrings {

    public static void main(String[] args) {
        String[] names = {"thanu", "anil", "mohan", "chitti"};
        int n = names.length;

        // Bubble sort algorithm
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (names[j].compareTo(names[j + 1]) > 0) {
                    // Swap names[j] and names[j + 1]
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        System.out.println("Sorted strings in alphabetical order:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
