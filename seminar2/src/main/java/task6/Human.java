package task6;

public class Human {
    private Transport lastTransport;

    public void drive(Transport transport) {
        transport.drive();
        lastTransport = transport;
    }

    public void stop() {
        if (lastTransport != null) {
            lastTransport.stop();
            lastTransport = null;
        } else {
            System.out.println("Мы не движемся");
        }
    }
}
