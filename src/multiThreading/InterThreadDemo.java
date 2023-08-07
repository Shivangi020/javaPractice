package multiThreading;

//Here  we are achieving interthread communication using Two Thread class Producer and Consumer

class A{
	int num;
	boolean valueSet ;
	
	public synchronized void put(int num) {
		
		while(valueSet) {
			try {wait();} catch (InterruptedException e) {}
		}
		this.num = num;
		System.out.println("Put "+num);
		valueSet = true;
		notify();
	}
	
	public synchronized void get() {
		
		while(!valueSet) {
			try {wait();} catch (InterruptedException e) {}
		}
		System.out.println("Get " + num);
		valueSet = false;
		notify();
		
	}
}


class Producer implements Runnable{
	A a;

	public Producer(A a) {
		this.a = a;		
		Thread t1 = new Thread(this,"Producer");
		t1.start();
	}

	@Override
	public void run() {
		int i = 0 ;
		while(true) {
			a.put(i++);
			try {Thread.sleep(1000);} catch (Exception e) {}
		}
		
	}
	
}


class Consumer implements Runnable{
	A a;

	public Consumer(A a) {
		this.a = a ;
		Thread t2 = new Thread(this,"Consumer");
		t2.start();
		
	}
	@Override
	public void run() {
       while(true) {
    	   a.get();
    	   try {Thread.sleep(1000);} catch (Exception e) {}
       }
	}
	
}
public class InterThreadDemo {

	public static void main(String[] args) {
	  A a = new A();
	  new Producer(a);
	  new Consumer(a);
		
	}

}


// The above code is built such that consumer and producer will wait for each other untill their work is not done

