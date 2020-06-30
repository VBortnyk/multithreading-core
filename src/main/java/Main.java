public class Main {

    public static void main(String[] args) {
        ThreadOne t1 = new ThreadOne("Thread_one");
        ThreadTwo t2 = new ThreadTwo("Thread_two");

        t1.start();
        t2.start();
    }
}
