import org.apache.log4j.Logger;

public class ThreadOne extends Thread {
    private static final Logger LOGGER = Logger.getLogger(ThreadOne.class);
    private int value = 0;
    private String threadName;

    public ThreadOne(String threadName) {
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
}
