package balaji;
abstract class machine {
	abstract void ATM();
	public void ATM2() {
		System.out.println("ATM is machine");
	}
}
class Bank extends machine{
	void ATM() {
		System.out.println("ATM machine using java");
	}
}
public abstract class Abstractt{
	public static void main(String[] args) {
		Bank ob=new Bank();
		ob.ATM();
		ob.ATM2();
	}

}
