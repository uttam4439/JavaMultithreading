
class MainThread{
    public static void main(String[] args){
        MakingThread kk = new MakingThread();
        kk.start();

        for(int i = 0; i<100; i++){
            System.out.println("World");
        }
    }
}