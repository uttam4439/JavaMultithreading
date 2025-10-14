import java.lang.*;

public class MakingThread extends Thread{   // Thread belongs to lang packg so import that packg.

    @Override
    public void run() { 
        for(int i = 0; i<100; i++){
            System.out.println("Hello");
        }
        super.run();
    }
    public static void main(String[] args){
        System.out.println(Thread.currentThread().getName());
    }

    
}