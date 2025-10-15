public class MakingThread extends Thread{   

    @Override
    public void run() { 
        // for(int i = 0; i<10; i++){
        //     System.out.println("Hello");
        // }
        System.out.println("States Check...");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) throws InterruptedException{
        System.out.println(Thread.currentThread().getName());

        MakingThread m1 = new MakingThread();
        System.out.println(m1.getState()); // State new
        m1.start();

        System.out.println(m1.getState()); // Running or wating to run if not start 

        Thread.sleep(1000); // timed Wating
        System.out.println(m1.getState());

        m1.join();
        System.out.println(m1.getState());

    }

    /*  States Of Thread Lifecycle
    
    1.New: A thread is in this state when it is created but not yet started.

    2.Runnable: After the start method is called, the thread becomes runnable. 
    It’s ready to run and is waiting for CPU time.

    3.Running: The thread is in this state when it is executing.

    4.Blocked/Waiting: A thread is in this state when it is waiting for a resource or for 
    another thread to perform an action.

    5.Terminated: A thread is in this state when it has finished executing. 
    
    */

}