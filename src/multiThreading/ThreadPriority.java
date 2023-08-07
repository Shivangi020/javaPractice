package multiThreading;

public class ThreadPriority {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Hello" + Thread.currentThread().getPriority());
				try { Thread.sleep(1000);} catch (Exception e) {}
			}

		},"HelloThread");
		
		Thread t2 = new Thread(() -> {

			for (int i = 0; i < 5; i++) {
				System.out.println("Hi"  + Thread.currentThread().getPriority() );
				try {Thread.sleep(1000);} catch (Exception e) {}
			}
		},"HiThread");

		t1.start();
		try {
			Thread.sleep(10);
		} catch (Exception e) {
		}
		t2.start();
		
//		The below are default name each thread will get but we can also give name 
		System.out.println(t1.getName()); // Thread-0
		System.out.println(t2.getName()); // Thread-1
		
//		This can change the thread name but there are other ways also
		t1.setName("HiThread");
		t2.setName("HelloName");
	
		
//		Now let's talk about thread priority
//		initially each thread have default priority
//		Range of priority is 1 to 10
		System.out.println(t1.getPriority()); // 5  --> default is 5 ; it is also called normal priority
		System.out.println(t2.getPriority()); // 5 
		
//		But now lets change the priority of our threads
//		t1.setPriority(1);
//		t2.setPriority(10);
		
//		or
		
		t1.setPriority(Thread.MIN_PRIORITY); // MIN_PRIORITY = 1
		t2.setPriority(Thread.MAX_PRIORITY);  // MAX_PRIORITY = 10
		
		t1.join();
		t2.join();
		
		System.out.println("Okay Bye"); 


	}

}
