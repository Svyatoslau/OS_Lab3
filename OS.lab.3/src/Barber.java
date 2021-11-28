public class Barber implements Runnable {

    private boolean sleeping;

    private Customer customer;

    private Thread thisThread = new Thread(this);

    private BarberShop barberShop;

    public boolean isSleeping() {
        return sleeping;
    }

    public void setSleeping(boolean sleeping) {
        this.sleeping = sleeping;
        System.out.println(sleeping ? "ZZZ" : "Парикмахер стрижёт посетителя");
    }

    public Barber(BarberShop barberShop) {
        this.barberShop = barberShop;
        this.sleeping = true;
        this.thisThread.start();
    }


    @Override
    public void run() {
        while (true) {
            if(!barberShop.isEmpty()) {

                customer=barberShop.pop();

                barberShop.setNumberOfVisitors(barberShop.getNumberOfVisitors() - 1); //Закинуть одного клиента барберу

                setSleeping(false);
                System.out.println("Посетителей в очереди: " + barberShop.getNumberOfVisitors());

                try {
                    thisThread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Парикмахер ПОСТРИГ!!!...");


            } else {
                setSleeping(true);
            }
        }
    }
}
