package balaji;
interface printable{
	void print();
}
class Message implements printable{
	public void print() {
		System.out.println("Hello hi");
	}
}
public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Message ob=new Message();
		ob.print();
	}

}
