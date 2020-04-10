package producerConsumer;

public class Producer extends Thread{
    Company company;

    Producer(Company company){
        this.company = company;
    }

    @Override
    public void run() {
        int i=1;
        while (true){
            company.produce_item(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}
