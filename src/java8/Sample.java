package java8;

import java.util.concurrent.CompletableFuture;

public class Sample {
	
	public static CompletableFuture<Integer> create(Integer n) {
		//Run a task specified by a Supplier Object
				return CompletableFuture.supplyAsync(() -> n*2 );
	}

	public static void main(String[] args) {
		create(19).thenApply(n -> {
			System.out.println("Current Thread --> "+ Thread.currentThread());
			return n+1;
			}).thenAccept(System.out::println);
		
		create(10).thenApplyAsync(n -> {
			// using Async, the execution will be done in a separte thread rather than he  main thread.
			System.out.println("Current Thread --> "+ Thread.currentThread());
			return n+1;
			}).thenAccept(System.out::println);
	}
}


/*OutPut -->
   	Current Thread --> Thread[main,5,main]
	39
	Current Thread --> Thread[ForkJoinPool.commonPool-worker-1,5,main]
	39
*/