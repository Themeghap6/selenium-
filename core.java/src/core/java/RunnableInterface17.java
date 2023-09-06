package core.java;



class threadbyRunnable1 implements Runnable{
	// to implement runnable method
	public void Run() {	
		for(int i=1;i<=5;i++) {	
		}
		System.out.println("i am a thread 1");
	}
}
public class RunnableInterface17 {
	public static void main(String[] args) {
		threadbyRunnable1 bullet1 = new threadbyRunnable1();   // to making object
		Thread gun1=new Thread(bullet1);					
		gun1.start();
		for(int i=1;i<=5;i++) {	
		}
		System.out.println("main method");
		
		
	}
}




		
	