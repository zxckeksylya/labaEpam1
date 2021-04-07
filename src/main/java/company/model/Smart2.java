package company.model;

public class Smart2 extends Tariff {
    @Override
    public String toString() {

        return "\n" + super.getName() + ": \n " +
                "MegaBytes = " + super.getMegaBytes() + "\n" +
                "Amount clients = " + super.getAmountClients() + "\n" +
                "Amount minutes = " + super.getMinutes() + "\n" +
                "User Charge = " + super.getUserCharge();
    }
}
