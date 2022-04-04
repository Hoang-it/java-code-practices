package thread;

public class SyncThread implements Runnable{
    private Object object1;
    private Object object2;

    public SyncThread(Object o1, Object o2){
        this.object1 = o1;
        this.object2 = o2;
    }
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " acquire lock on " + object1);
        synchronized (object1){
            System.out.println(name + " acquire lock on " + object1);
            work();
            System.out.println(name + " acquire lock on " + object2);
            synchronized (object2){
                System.out.println(name + " acquire lock on " + object2);
                work();
            }
            System.out.println(name + " released lock on " + object2);
        }
        System.out.println(name + " released lock on " + object1);
        System.out.println(name + " finish execution");
    }
    private void work(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
