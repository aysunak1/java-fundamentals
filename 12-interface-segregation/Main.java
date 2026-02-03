public class Main {
    public static void main(String[] args) {
        OutSourceWorker outSourceWorker = new OutSourceWorker();
        Worker worker = new Worker();
        worker.eat();
        worker.pay();
        outSourceWorker.work();

    }
}
