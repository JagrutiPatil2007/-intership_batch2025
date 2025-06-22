package day14.java;

public class NumberPrinterThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000); // 1 second delay
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }

    public static void main(String[] args) {
        NumberPrinterThread t = new NumberPrinterThread();
        t.start();
    }
}