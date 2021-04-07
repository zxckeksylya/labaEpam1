package company.model;

public class Smart1 extends Tariff {

    public String toString() {

        return "\n" + super.getName() + ": \n " +
                "MegaBytes = " + super.getMegaBytes() + "\n" +
                "Amount clients = " + super.getAmountClients() + "\n" +
                "Amount minutes = " + super.getMinutes() + "\n" +
                "User Charge = " + super.getUserCharge();
    }
}
