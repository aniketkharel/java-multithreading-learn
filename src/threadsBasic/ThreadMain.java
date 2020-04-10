package threadsBasic;

/*
class threadsBasic.MyTask{
    void executeTask(){
        for (int i = 0; i < 10; i++) {
            System.out.println("@@Printing document from printer 2: "+i);
        }
    }
}
*/
/*
//now its a thread now
class threadsBasic.MyTask extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("@@Printing document from printer 2: "+i);
        }
    }

}
*/
class CA{

}
// we did this because multiple inheritance is not supported in java, so we are implementing runnable interface
class MyTask extends CA implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("@@Printing document from printer 2: "+i);
        }
    }

}

public class ThreadMain {
    //main methods represents main thread
    //will be executed by main thread
    // always execute job in a sequence
    //follows a path of execution4
    //thread is execution context , sequential execution( Operation)
    public static void main(String[] args) {

        //job 1
        System.out.println("Started Application on main thread");

        //job 2
        //if its a long runnign process ,
        //till its not finished the task below wont execute
        //scramble program
        //because main thread is blocked now
        //threadsBasic.MyTask myTask = new threadsBasic.MyTask();
        //myTask.start();

        Runnable runnable = new MyTask();
        Thread task = new Thread(runnable);
        task.start();
        // @todo main thread is not affected by this method

        //job3
        //prints docuements
        for (int i = 0; i < 10; i++) {
            System.out.println("Printing from printer 1"+i);
        }

        //job 4
        System.out.println("Finished 1");
    }
}
