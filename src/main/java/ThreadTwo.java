import org.apache.log4j.Logger;

public class ThreadTwo implements Runnable {
    private static final Logger LOGGER = Logger.getLogger(ThreadTwo.class);
    private Counter counter;

    public ThreadTwo(Counter counter) {
        this.counter = counter;
        LOGGER.info("Thread " + Thread.currentThread().getName() + " created");
    }

    @Override
    public void run() {
        while (counter.getBottom() <= counter.getTop()) {
            LOGGER.info(counter.getBottom());
            counter.increment();
        }
    }
}
