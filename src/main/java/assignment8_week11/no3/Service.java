package assignment8_week11.no3;

public class Service implements Runnable {
    int start;
    int end;
    Thread thread;

    public Service (String threadName, int start, int end){
        thread = new Thread(this, threadName);
        this.start = start;
        this.end = end;
    }

    @Override
    public void run(){

        try{
            print(this.start, this.end);

            Thread.sleep(1000);
        }catch (InterruptedException exc){
            System.out.println("Interrupted");
        }
    }

    public void print(int start, int end){
        System.out.println(thread.getName() + " Started");
        for(int i = start; i <= end; i++){
            System.out.println(i);
        }
        System.out.println(thread.getName() + " Ended");
    }
}
