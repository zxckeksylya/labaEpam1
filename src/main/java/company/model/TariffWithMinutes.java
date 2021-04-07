package company.model;

public class TariffWithMinutes extends Tariff {
    private int minutes;

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    @Override
    public String toString() {

        return "\n" + super.getName() + ": \n " +
                "MegaBytes = " + super.getMegaBytes() + "\n" +
                "Amount clients = " + super.getAmountClients() + "\n" +
                "Amount minutes = " + getMinutes() + "\n" +
                "User Charge = " + super.getUserCharge();
    }
}
