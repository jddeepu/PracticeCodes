
public class Mthreat implements Runnable {

	public void run() {

		for (int i = 0; i <= 10; i++) {
    
			System.out.println("valu of i=" + i);
		
	try {
		Thread.sleep(1000);
	}
	catch (Exception e){
		
		
	}	
	}
	}
	public static void main (String []arg) {
		Mthreat t1 = new Mthreat();
		 Thread	thr= new Thread(t1);
		 thr.start();
		 
		

	}
}
