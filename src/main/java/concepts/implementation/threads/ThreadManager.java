package concepts.implementation.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ThreadManager {

	static ExecutorService executorService = Executors.newFixedThreadPool(2);

	public static void usingInvokeAllMethod(List<FibonacciCallableTask> list){
		try {
			List<Future<Long>> futureList = executorService.invokeAll(list);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void usingSubmitMethod(){
		FibonacciCallableTask callableTask = new FibonacciCallableTask(-20);
		FibonacciRunnableTask runnableTask = new FibonacciRunnableTask(-20);

		Future<Long> factorial = executorService.submit(callableTask);
		executorService.submit(runnableTask);

		try {
			System.out.println("No Output because the thread is still executing the task: "+runnableTask.getFibonacciNumber());
			System.out.println(factorial.get().longValue());
			System.out.println(runnableTask.getFibonacciNumber());
		} catch (InterruptedException | ExecutionException e) {
			System.out.println("Caught Exception inside Callable Task -> When making a call to Future get():"+e.getCause());
		}
	}

	public static void main(String...args){
		List<FibonacciCallableTask> callableTaskList = new ArrayList<FibonacciCallableTask>();
		for(int i = 10; i <= 100; i+=10){
			callableTaskList.add(new FibonacciCallableTask(i));
		}

		usingInvokeAllMethod(callableTaskList);
		
		executorService.shutdown();
		try {
			executorService.awaitTermination(30, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}