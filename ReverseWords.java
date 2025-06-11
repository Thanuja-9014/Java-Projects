package balaji;

public class ReverseWords {
    public static void main(String[] args) {
        String str = "hello world java";
        String[] words = str.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}


        //String str = "java is fun";
       // String[] words = str.split(" ");

        //for (String word : words) {
           // String reversed = new StringBuilder(word).reverse().toString();
            //System.out.print(reversed + " ");
        
