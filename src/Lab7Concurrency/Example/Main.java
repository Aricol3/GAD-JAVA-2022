package Lab7Concurrency.Example;

public class Main {
    public static int v = 0;

    public static void main(String[] args) throws Exception {
        System.out.println("before="+v);
        Runnable runnable = new Runnable(){
            @Override
            public void run(){
                v++;
                // v++ = read v; v+1; v=v+1;
                System.out.print(":::");
            }
        };
        for(int i=0;i<9000;i++){
            (new Thread(runnable)).start();
        }
        Thread.sleep(300);
        System.out.println("\nafter="+v);
    }
}