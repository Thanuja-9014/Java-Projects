package balaji;
class calculator{
	int area(int a,int b) {
		return a*b;
	}
	double area(double a,double b) {
		return a*b;
	}
	int area(int a,int b,int c) {
		return a*b*c;
	}
}

public class Overloadingex {

	public static void main(String[] args) {
		calculator ob=new calculator();
		calculator ob1=new calculator();
		calculator ob2=new calculator();
		System.out.println(ob.area(2, 3));
		System.out.println(ob.area(2.3, 3.5));
		System.out.println(ob.area(2,3,4));
		// TODO Auto-generated method stub

	}

}
