
public class ThreadExample {
	public static void main(String[] args) {
	    
		// Create two Thread objects
	    Thread t1 = new Thread();
	    Thread t2 = new Thread();
	
	    // Start both threads
	    t1.start();
	    t2.start();
	  }

	  public static void print() {
	    for (int i = 1; i <= 500; i++) {
	      System.out.println(i);
	    }
	  }
}
