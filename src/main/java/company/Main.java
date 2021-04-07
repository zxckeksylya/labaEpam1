package company;

import company.comparators.UserChangeComparator;
import company.filter.MegaBytesFilter;
import company.model.TariffPackage;
import company.model.Tariff;
import company.model.TariffPackageBuilder;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        TariffPackage packageTariffs = new TariffPackageBuilder(10, 4).build();
        packageTariffs.sort(new UserChangeComparator());
        System.out.println(packageTariffs.toString());

        List<Tariff> tariffs = packageTariffs.find(new MegaBytesFilter(500, 800));

        for (Tariff tariff : tariffs) {
            System.out.println(tariff.getName() + " : " + tariff.getMegaBytes() + "\n");
        }

        System.out.println("total number of clients : " + packageTariffs.numberOfClients() + "\n");
    }
}
