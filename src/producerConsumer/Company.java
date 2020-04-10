package producerConsumer;

public class Company {
    int n;
    boolean f=false;
    synchronized void produce_item(int n){
        this.n = n;
        System.out.println("Produced: "+this.n);
    }

    synchronized int consume_item(){
        System.out.println("Consumed :"+this.n);
        return this.n;
    }
}
