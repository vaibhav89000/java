// package java.Thread;


class MyThread extends Thread {

    @Override
    public void run(){
        System.out.println("Starting thread :"+Thread.currentThread().getId());
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace(); // or handle properly
            }
            System.out.println("thread :"+Thread.currentThread().getId()+" i: "+i);
        }
    }
}

public class ThreadImpl
{
    public static void main(String[] args) {
        Thread t1 = new MyThread();
        Thread t2 = new MyThread();

        t1.start();
        t2.start();
		
	}
}
