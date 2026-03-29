// CompletableFuture is a modern Java concurrency utility that supports asynchronous, 
// non-blocking programming with features like chaining, combining multiple tasks, and handling results or exceptions.

import java.util.concurrent.CompletableFuture;

public class CompletableFutureProgram {
    
    // Simulated API 1
    public static String api1() {
        try {
            Thread.sleep(1000); // simulate delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Response from API 1";
    }

    // Simulated API 2
    public static String api2() {
        try {
            Thread.sleep(1500); // simulate delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Response from API 2";
    }

    public static void main(String[] args) {

        // Async API calls
        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> api1());
        CompletableFuture<String> f2 = CompletableFuture.supplyAsync(() -> api2());

        // Wait for both and then process
        CompletableFuture.allOf(f1, f2)
                .thenRun(() -> {
                    // join() gets result without checked exception
                    String result1 = f1.join();
                    String result2 = f2.join();

                    System.out.println("Combined Result: " + result1 + " " + result2);
                });
                // .join(); // wait for completion (main thread) -> this will make it wait

        System.out.println("parallel");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } // wait for async tasks to complete before main thread exits
    }

}