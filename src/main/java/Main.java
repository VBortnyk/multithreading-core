public class Main {

    public static void main(String[] args) {
        Counter counter = new Counter(0, 50);
        new ThreadOne(counter).start();
        new Thread(new ThreadTwo(counter)).start();
    }
}
