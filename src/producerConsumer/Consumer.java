package producerConsumer;

public class Consumer extends Thread{
    Company company;

    Consumer(Company company){
        this.company = company;
    }

    @Override
    public void run() {
        int i=1;
        while (true){
            company.consume_item();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}
