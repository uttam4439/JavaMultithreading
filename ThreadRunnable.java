/* Use of Runnable in Multithreading when there is already 2 class extending any to other
like public class x extends y implements Runnable                */  

public class ThreadRunnable implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i<100; i++){
            System.out.println(Thread.currentThread().getName());
        }   
    }
}

