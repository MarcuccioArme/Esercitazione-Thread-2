public class DueThread {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new StampaNumeri(1, 10));
        Thread thread2 = new Thread(new StampaNumeri(20, 30));

        thread1.start();

        thread2.sleep(50);
        thread2.start();

        thread2.join();
        thread1.join();
    }
}