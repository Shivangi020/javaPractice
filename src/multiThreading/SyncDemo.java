package multiThreading;

class Counter {
	int count;

//	With this synchronized keyword only one thread can access this method so when t1 access this t2 will wait and vice versa
	public synchronized void increment() {
		count++;
	}
}

public class SyncDemo {

	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();

		Thread t1 = new Thread(() -> {

			for (int i = 0; i < 1000; i++) {
				c.increment();
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				c.increment();
			}
		});

		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Count " + c.count);
	}
	
	
  

}
