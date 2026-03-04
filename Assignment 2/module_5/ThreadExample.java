package module_5;

class MyThread extends Thread {
 public void run() {
     System.out.println("Thread using Thread class");
 }
}


class MyRunnable implements Runnable {
 public void run() {
     System.out.println("Thread created using Runnable interface");
 }
}

public class ThreadExample {
 public static void main(String[] args) {

     MyThread th1 = new MyThread();
     th1.start();

     MyRunnable rn = new MyRunnable();
     Thread th2 = new Thread(rn);
     th2.start();
 }
}