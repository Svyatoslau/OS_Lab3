public class BarberShop {

    private int MAX_VISITORS = 5;
    private int numberOfVisitors = 5;

    public int getMAX_VISITORS() {
        return MAX_VISITORS;
    }

    public void setMAX_VISITORS(int MAX_VISITORS) {
        this.MAX_VISITORS = MAX_VISITORS;
    }

    public int getNumberOfVisitors() {
        return numberOfVisitors;
    }

    public void setNumberOfVisitors(int numberOfVisitors) {
        this.numberOfVisitors = numberOfVisitors;
    }

    public boolean isFull() {
        return numberOfVisitors >= MAX_VISITORS;
    }

    public boolean isEmpty() {
        return numberOfVisitors == 0;
    }
}
