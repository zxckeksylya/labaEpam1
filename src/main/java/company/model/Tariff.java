package company.model;

public abstract class Tariff {
    private String name;
    private int userCharge;
    private int amountClients;
    private int minutes;
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

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getMegaBytes() {
        return megaBytes;
    }

    public void setMegaBytes(int megaBytes) {
        this.megaBytes = megaBytes;
    }
}
