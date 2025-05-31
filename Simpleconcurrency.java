package balaji;
class mytask extends Thread{
	private String taskname;
	public mytask(String taskname) {
		this.taskname=taskname;
	}
	
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(taskname + "step" + i);
			try {
				Thread.sleep(5000);
			} catch(InterruptedException e) {
				System.out.println(taskname + "was interrupted");
			}
		}		
	}
}

public class Simpleconcurrency {

	public static void main(String[] args) {
		mytask t1=new mytask("talking");
		mytask t2=new mytask("Cooking");
		t1.start();
		t2.start();
	}
}
