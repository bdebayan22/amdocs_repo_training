package Assignment7;

public class MyThread extends Thread{
    private Thread t;
    private String name;
    public MyThread(String name,int priority) {
        super(name);
        this.name=name;
        setPriority(priority);
        t=new Thread(this);


        System.out.println(this.name +" is started");
        t.start();
    }



    @Override
    public void run() {
        try {
            for(int i=0;i<5;i++) {
                System.out.println(this.name +" is Running..");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.name +" is Finished..");

    }
}
