package company;

import company.model.TariffWithSMS;
import company.model.TariffWithMinutes;
import company.model.Tariff;
import company.model.enums.TariffsType;

public class Factory {
    public Tariff createTariff(TariffsType type) {
        switch (type) {
            case SMART1:
                Tariff smart1 = new Tariff();
                smart1.setMegaBytes(1000);
                smart1.setAmountClients(10);
                smart1.setUserCharge(30);
                smart1.setName("Smart1");
                return smart1;
            case SMART2:
                TariffWithSMS smart2 = new TariffWithSMS();
                smart2.setMegaBytes(500);
                smart2.setSMS(100);
                smart2.setAmountClients(5);
                smart2.setUserCharge(25);
                smart2.setName("Smart2");
                return smart2;
            case SMART3:
                TariffWithMinutes smart3 = new TariffWithMinutes();
                smart3.setMegaBytes(800);
                smart3.setMinutes(500);
                smart3.setAmountClients(8);
                smart3.setUserCharge(20);
                smart3.setName("Smart3");
                return smart3;
        }
        return null;
    }
}
