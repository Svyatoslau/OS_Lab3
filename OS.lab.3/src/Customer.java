public class Customer implements Runnable{

    private Barber barber;
    private BarberShop barberShop;

    private Thread thread = new Thread(this);

    public Thread getThread() {
        return thread;
    }

    public Customer(Barber barber, BarberShop barberShop) {
        this.barber = barber;
        this.barberShop = barberShop;
    }

    @Override
    public void run() {
        if(barberShop.getBarberTread().getState() == Thread.State.WAITING){
            barberShop.wakeup();
            System.out.println("Парихмехер проснулся!!!!");
        }else{
            if(barberShop.isFull()) {
                System.out.println("МЕСТ больше НЕТ!!!");
            }else{
                System.out.println("Клиент стал в очередь");
                barberShop.push(this);
            }
        }
    }

}
