class StampaNumeri implements Runnable {
    private int inizio;
    private int fine;

    public StampaNumeri(int inizio, int fine) {
        this.inizio = inizio;
        this.fine = fine;
    }

    public void run() {
        for (int i = inizio; i <= fine; i++) {
            System.out.println(i);
        }
        System.out.println();
    }
}