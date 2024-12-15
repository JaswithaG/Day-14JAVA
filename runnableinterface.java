class a implements Runnable{
    public void run(){
        System.out.println("Hello i'm thread");
    }
}
public class runnableinterface{
    public static void main(String [] args){
        a g=new a();
        Thread s=new Thread(g);
        s.start();
        s.run();
    }
}