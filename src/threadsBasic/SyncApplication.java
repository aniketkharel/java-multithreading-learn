package threadsBasic;

//synchronized is used when multiple thread acts on a same object
class Printer{
    synchronized void printDoc(int no){
        for (int i = 0; i < no; i++) {
            System.out.println("printing document : "+ i);
        }
    }
}

class MyThread extends Thread{

    Printer pRef;

    MyThread(Printer p){
        pRef = p;
    }

    @Override
    public void run() {
        pRef.printDoc(10);
    }
}


class YourThread extends Thread{

    Printer pRef;

    YourThread(Printer p){
        pRef = p;
    }

    @Override
    public void run() {
        pRef.printDoc(10);
    }
}

public class SyncApplication {
    public static void main(String[] args) {

        //main represents main thread
        System.out.println("Application Started");

        Printer printer = new Printer();
        //printer.printDoc(10);

        MyThread myThread = new MyThread(printer);
        myThread.start();

        YourThread yThread = new YourThread(printer);
        yThread.start();

        System.out.println("Application Finished");
    }
}
