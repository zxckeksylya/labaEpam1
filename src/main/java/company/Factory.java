package company;

import company.model.Smart1;
import company.model.Smart2;
import company.model.Smart3;
import company.model.Tariff;
import company.model.enums.TariffsType;

public class Factory {
    public Tariff createTariff(TariffsType type){
        Tariff tariff = null;

        switch(type){
            case SMART1:
                tariff = new Smart1();
                tariff.setMegaBytes(1000);
                tariff.setMinutes(1000);
                tariff.setAmountClients(10);
                tariff.setUserCharge(30);
                tariff.setName("Smart1");
                break;
            case SMART2:
                tariff = new Smart2();
                tariff.setMegaBytes(500);
                tariff.setMinutes(800);
                tariff.setAmountClients(5);
                tariff.setUserCharge(25);
                tariff.setName("Smart2");
                break;
            case SMART3:
                tariff = new Smart3();
                tariff.setMegaBytes(800);
                tariff.setMinutes(500);
                tariff.setAmountClients(8);
                tariff.setUserCharge(20);
                tariff.setName("Smart3");
                break;
        }
        return tariff;
    }
}
