package balaji;
import java.util.HashMap;
public class FibonacciWithDp {
	static HashMap<Integer,Integer> memo=new HashMap<Integer,Integer>();
	public static int fib(int n) {
		if(n<=1) {
			return n;
		}
		if(memo.containsKey(n)) {
			return memo.get(n);
		}
		int result=fib(n-1)+fib(n-2);
		memo.put(n,result);
		return result;
	}

	public static void main(String[] args) {
		int n=6;
		System.out.println("fibonacci od"+n+"is"+fib(n));
		// TODO Auto-generated method stub

	}

}
