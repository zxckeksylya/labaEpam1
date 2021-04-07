package company.model;

public class Tariff {
    private String name;
    private int userCharge;
    private int amountClients;
    private int megaBytes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUserCharge() {
        return userCharge;
    }

    public void setUserCharge(int userCharge) {
        this.userCharge = userCharge;
    }

    public int getAmountClients() {
        return amountClients;
    }

    public void setAmountClients(int amountClients) {
        this.amountClients = amountClients;
    }


    public int getMegaBytes() {
        return megaBytes;
    }

    public void setMegaBytes(int megaBytes) {
        this.megaBytes = megaBytes;
    }

    public String toString() {

        return "\n" + getName() + ": \n " +
                "MegaBytes = " + getMegaBytes() + "\n" +
                "Amount clients = " + getAmountClients() + "\n" +
                "User Charge = " + getUserCharge();
    }
}
