package day14.java;

public class HelloRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello from thread!");
        }
    }

    public static void main(String[] args) {
        Thread t = new Thread(new HelloRunnable());
        t.start();
    }
}
