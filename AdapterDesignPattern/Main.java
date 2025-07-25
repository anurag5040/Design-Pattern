package AdapterDesignPattern;

public class Main {
    public static void main(String[] args) {
        ElectricSocket socket=new ElectricSocket();

        PhoneCharger charger=new ChargerAdapter(socket);
        charger.chargePhone();
    }
}
