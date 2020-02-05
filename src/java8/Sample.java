package java8;

import java.util.concurrent.CompletableFuture;

public class Sample {
	
	public static CompletableFuture<Integer> create(Integer n) {
		//Run a task specified by a Supplier Object
				return CompletableFuture.supplyAsync(() -> n*2 );
	}

	public static void main(String[] args) {
		create(19).thenApply(n -> n+1).thenAccept(System.out::println).thenRun(() -> System.out.println("Run method"));
		
	}

}


/*OutPut --> 39
			Run method
			
			thenApply accepts and retuns a value
			thenAccept accept and does not return any value.
			thenRun does not accept and does not return any value.
			
*/