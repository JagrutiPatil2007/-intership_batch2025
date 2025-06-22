package day14.java;


class SharedResource {
 synchronized void printMessage(String msg) {
     System.out.print("[" + msg);
     try {
         Thread.sleep(500);
     } catch (InterruptedException e) {
         System.out.println("Interrupted");
     }
     System.out.println("]");
 }
}

class MyThread extends Thread {
 SharedResource resource;
 String message;

 MyThread(SharedResource res, String msg) {
     resource = res;
     message = msg;
 }

 public void run() {
     resource.printMessage(message);
 }
}

public class SynchronizedExample {
 public static void main(String[] args) {
     SharedResource res = new SharedResource();

     MyThread t1 = new MyThread(res, "Hello");
     MyThread t2 = new MyThread(res, "World");

     t1.start();
     t2.start();
 }
}
