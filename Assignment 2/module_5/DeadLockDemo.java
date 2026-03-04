package module_5;

public class DeadLockDemo {
    static final Object accountA = new Object();
    static final Object accountB = new Object();

    public static void main(String[] args) {
        Thread t1=new Thread(()->{
            synchronized (accountA){
                System.out.println("Thread 1 locked account A");
                synchronized (accountB){
                    System.out.println("Thread 1 locked B");
                }
            }
        });
        Thread t2=new Thread(()->{
            synchronized (accountB){
                System.out.println("Thread 2 locked account B");
                synchronized (accountA){
                    System.out.println("Thread 2 locked A");
                }
            }
        });
        t1.start();
        t2.start();
    }
}