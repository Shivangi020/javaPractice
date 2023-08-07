package multiThreading;


class Hi1 implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {

				e.printStackTrace();
			}
		}
	}
}

class Hello2 implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {

				e.printStackTrace();
			}
		}
	}
}

public class RunnableDemo {
	public static void main(String[] args) {
		Hi1 obj1 = new Hi1();
		Hello2 obj2 = new Hello2();

//		Since start() method is not in the runnable interface we can bot call start() method

//		So we need to create thread also and pass the object
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		try { Thread.sleep(10);} catch (Exception e) {}
		t2.start();
		
		
		

	}

}
