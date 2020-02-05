package java8;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Sample {

	public static void main(String[] args) {
		//Run a task specified by a Runnable Object
		CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(() -> {
			System.out.println("In Completable future");
		});
		
		try {
			completableFuture.get();
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}

}


//OutPut --> In Completable future