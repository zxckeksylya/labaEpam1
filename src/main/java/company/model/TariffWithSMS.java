package company.model;

public class TariffWithSMS extends Tariff {
    private int SMS;

    public int getSMS() {
        return SMS;
    }

    public void setSMS(int SMS) {
        this.SMS = SMS;
    }

    @Override
    public String toString() {

        return "\n" + super.getName() + ": \n " +
                "MegaBytes = " + super.getMegaBytes() + "\n" +
                "Amount clients = " + super.getAmountClients() + "\n" +
                "Amount minutes = " + getSMS() + "\n" +
                "User Charge = " + super.getUserCharge();
    }
}
