import org.apache.log4j.Logger;

public class ThreadTwo implements Runnable {
    private static final Logger LOGGER = Logger.getLogger(ThreadTwo.class);
    private Thread thread;
    private int value = 0;
    private String threadName;

    public ThreadTwo(String threadName) {
        this.threadName = threadName;
        System.out.println("Thread " + threadName + " created");
    }

    @Override
    public void run() {
        while (value < 25) {
            System.out.println(Thread.currentThread().getName() + "value is " + value++);
            LOGGER.info(value);
        }
    }

    public void start() {
        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}
