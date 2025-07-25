package AdapterDesignPattern;

public class ChargerAdapter implements PhoneCharger{
    private ElectricSocket socket;

    public ChargerAdapter(ElectricSocket socket)
    {
        this.socket=socket;
    }

    @Override
    public void chargePhone() {
        socket.provideElectricity();
        System.out.println("Adapter converts power to 5V USB. Charging phone...");
    }
}
