package multiThreading;

class Hi extends Thread {
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

class Hello extends Thread {
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

public class ThreadDemo {

	public static void main(String[] args) {
		Hi obj1 = new Hi();
		Hello obj2 = new Hello();

		obj1.start();
		obj2.start();
		
//		This will not make the program parallel instead we have to create a method called run
//		obj1.show();
//		obj2.show();
		
//		Whenever we calls start method it actually calls run method in the class so change the method name from show() to run 

	}

}
