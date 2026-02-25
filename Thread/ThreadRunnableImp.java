
class MyRunnable implements Runnable {

    @Override
    public void run(){
        System.out.println("Starting therad :"+Thread.currentThread().getId());
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace(); // or handle properly
            }
            System.out.println("therad :"+Thread.currentThread().getId()+" i: "+i);
        }
    }
}

public class ThreadRunnableImp
{
    public static void main(String[] args) {


        MyRunnable runnable = new MyRunnable();

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);

        t1.start();
        t2.start();
		
	}
}