package balaji;

class Car extends Thread{
	public void run() {
		for(int i=0;i<=3;i++) {
			System.out.println("Car is moving"+i);
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
		}
	}
}
}
class Bike extends Thread{
	public void run() {
		for(int i=0;i<=3;i++) {
			System.out.println("Bike is moving"+i);
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
		}
		}
		}
}

public class RunRace {

	public static void main(String[] args) {
	
		new Car().start();
		new Bike().start();
	}
}
		// TODO Auto-generated method stub}

