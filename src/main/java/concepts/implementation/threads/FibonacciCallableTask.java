/**
 * 
 */
package concepts.implementation.threads;

import java.util.concurrent.Callable;

/**
 * @author shekh
 */
public class FibonacciCallableTask implements Callable<Long>{
	
	private int number;
	
	FibonacciCallableTask(){}
	
	FibonacciCallableTask(int n){
		this.number = n;
	}

	@Override
	public Long call() throws Exception {
		long[] cache = new long[number];
		cache[0] = 0;
		cache[1] = 1;
		
		for(int i = 2; i < number;i++){
			cache[i] = cache[i-1] + cache[i-2];
		}
		return cache[number - 1];
	}
}