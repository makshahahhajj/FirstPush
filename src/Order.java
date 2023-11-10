public class Order {
    private int count = 0;

    public Order() {

    }

    public Order(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Order has count: " + count;
    }

    private static boolean check() {
        return true;
    }

    private void increment() {
        count++;
    }
}
