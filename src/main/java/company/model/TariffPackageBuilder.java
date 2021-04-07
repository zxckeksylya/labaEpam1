package company.model;

import company.Factory;
import company.model.enums.TariffsType;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TariffPackageBuilder {
    private final int num;
    private final int count;

    public TariffPackageBuilder(int num, int count) {
        this.num = num;
        this.count = count;
    }

    public  TariffPackage build() {
        TariffPackage packageTf = new TariffPackage();
        packageTf.setNum(num);
        List<Tariff> tariffs = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            int index = random.nextInt(TariffsType.values().length);
            tariffs.add(new Factory().createTariff(TariffsType.values()[index]));

        }
        packageTf.setTariffList(tariffs);
        return packageTf;
    }
}
