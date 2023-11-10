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

    private boolean check() {
        if (count > 0) {
            return true;
        }

        return false;
    }

    private void increment() {
        count++;
    }
}
