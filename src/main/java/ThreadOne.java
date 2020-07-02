import org.apache.log4j.Logger;

public class ThreadOne extends Thread {
    private static final Logger LOGGER = Logger.getLogger(ThreadOne.class);
    private Counter counter;

    public ThreadOne(Counter counter) {
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
