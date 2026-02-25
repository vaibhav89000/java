import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("Starting therad :"+Thread.currentThread().getId());
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace(); // or handle properly
            }
            System.out.println("therad :"+Thread.currentThread().getId()+" i: "+i);
        }

        return "success";
    }
}

public class ThreadCallable
{
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executors = Executors.newFixedThreadPool(2);

        Callable<String> callable1 = new MyCallable();
        Callable<String> callable2 = new MyCallable();

        System.out.println("callable 1");
        Future<String> future1 = executors.submit(callable1);

        System.out.println("callable 2");
        Future<String> future2 = executors.submit(callable2);

        System.out.println("Result from first task:");
        System.out.println(future1.get()); // blocks until done

        System.out.println("Result from second task:");
        System.out.println(future2.get());

        executors.shutdown(); // very important
    }
}