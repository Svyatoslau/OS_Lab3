public class Customer implements Runnable{

    private Barber barber;
    private BarberShop barberShop;


    public Customer(Barber barber, BarberShop barberShop) {
        this.barber = barber;
        this.barberShop = barberShop;
    }

    @Override
    public void run() {
        if(barber.isSleeping()){
            barber.wakeup();
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
