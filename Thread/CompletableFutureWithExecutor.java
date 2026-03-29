// When used with a custom ExecutorService (like FixedThreadPool), 
// CompletableFuture allows controlled execution of async tasks by managing thread usage, improving scalability, 
// and avoiding reliance on the default common thread pool.
import java.util.concurrent.*;

public class CompletableFutureWithExecutor {

    public static void main(String[] args) {

        // Create custom thread pool
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Async tasks using custom executor
        CompletableFuture<String> f1 =
                CompletableFuture.supplyAsync(() -> api1(), executor);

        CompletableFuture<String> f2 =
                CompletableFuture.supplyAsync(() -> api2(), executor);

        // Combine results
        CompletableFuture<Void> combined =
                CompletableFuture.allOf(f1, f2)
                        .thenRun(() -> {
                            String result1 = f1.join();
                            String result2 = f2.join();

                            System.out.println("Result: " + result1 + " | " + result2);
                        });

        // Wait for completion
        combined.join();

        // Shutdown thread pool (VERY IMPORTANT)
        executor.shutdown();
    }

    public static String api1() {
        sleep(1000);
        return "API 1 Response";
    }

    public static String api2() {
        sleep(1500);
        return "API 2 Response";
    }

    private static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}