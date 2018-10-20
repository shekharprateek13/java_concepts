package concepts.implementation.threads;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerClass {
	
	static AtomicInteger atInteger = new AtomicInteger();
	
	static class Counter implements Runnable {
		int count;

		@Override
		public void run() {
			count = atInteger.getAndIncrement();
			System.out.println();
			System.out.println("Thread "+Thread.currentThread().getName()+" Previous Value of Count:"+count);
			System.out.println("Thread "+Thread.currentThread().getName()+" Current Value of Count:"+atInteger.get());
		}
	}
	
	public static void main(String...args){
		Thread t1 = new Thread(new Counter(),"1");
		t1.start();
		Thread t2 = new Thread(new Counter(),"2");
		t2.start();
	}

}
