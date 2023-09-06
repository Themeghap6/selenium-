package threading;
// thread : smallest unit of process
//Two ways to achieve thread
//1.By Thread Class
//2.Runnable interface (Run)
//		->Runnable is better way to achieve thread

class ThreadByRunnable extends Object implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Main Threads");
	}
	
}

class ThreadByClass extends Thread{
	public void call() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Main Threads");
	}
}


public class Threaddemo {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread();		
		System.out.println(t1);	
		t1.setName("MyThread");		//name change
		System.out.println(t1);
		for(int i=1;i<=5;i++) {			//loop
			System.out.println(t1+" : "+i);
			Thread.sleep(2000);			//watting mode
		}
		System.out.println("Main Threads");
	}
}