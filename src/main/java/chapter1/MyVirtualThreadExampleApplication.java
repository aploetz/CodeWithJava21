package chapter1;

public class MyVirtualThreadExampleApplication implements Runnable {

    public void startAppThread() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            var vThread = Thread.startVirtualThread(this);
            vThread.join();
        }
    }

    @Override
    public void run() {
        System.out.println("Virtual thread is running");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyVirtualThreadExampleApplication myApplication = new MyVirtualThreadExampleApplication();
        myApplication.startAppThread();
    }
}