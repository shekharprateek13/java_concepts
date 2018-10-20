/**
 * 
 */
package concepts.implementation.threads;

/**
 * @author shekh
 */
public class FibonacciRunnableTask implements Runnable {

	private int number;
	private long fibonacciNum;

	FibonacciRunnableTask(){}

	FibonacciRunnableTask(int n){
		this.number = n;
	}

	public long getFibonacciNumber(){
		return this.fibonacciNum;
	}

	@Override
	public void run(){
		try{
			long[] cache = new long[number];
			cache[0] = 0;
			cache[1] = 1;

			for(int i = 2; i < number;i++){
				cache[i] = cache[i-1] + cache[i-2];
			}
			fibonacciNum = cache[number - 1];
		}catch(NegativeArraySizeException e){
			System.out.println("Caught Exception inside Runnable Task: ");
			e.printStackTrace();
		}

	}
}