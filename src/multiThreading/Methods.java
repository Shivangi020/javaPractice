package multiThreading;

public class Methods {

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Hello");
				try { Thread.sleep(1000);} catch (Exception e) {}
			}

		});
		
		Thread t2 = new Thread(() -> {

			for (int i = 0; i < 5; i++) {
				System.out.println("Hi");
				try {Thread.sleep(1000);} catch (Exception e) {}
			}
		});

		t1.start();
		try {
			Thread.sleep(10);
		} catch (Exception e) {
		}
		t2.start();
		
		System.out.println(t1.isAlive()); // true 
		
//		Let say we wants to print bye after all the threads job end and directly write print(bye) we will
//		not get our desirable result because this print statement will handle by main thread which is unused right now and 
//		main thread will print "bye" any time 
//		so to overcome this we can use join() method
		
		t1.join();
		t2.join();
		
		System.out.println("Okay Bye"); // now we will get "okay bye" when thread t1 and t2 will die
		
		System.out.println(t1.isAlive()); // false because t1 thread is died
	}

}
