public class Counter {
    private int bottom;
    private int top;

    public Counter(int bottom, int top) {
        this.bottom = bottom;
        this.top = top;
    }

    public void increment() {
        bottom++;
    }

    public int getBottom() {
        return bottom;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }
}
