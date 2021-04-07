package company;

import company.comparators.UserChangeComparator;
import company.filter.MegaBytesFilter;
import company.model.PackageTariffs;
import company.model.Tariff;
import company.model.enums.TariffsType;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static PackageTariffs newPackage(int num, int count) {
        PackageTariffs packageTf = new PackageTariffs();
        packageTf.setNum(num);
        List<Tariff> tariffs = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            int index = random.nextInt(TariffsType.values().length);
            tariffs.add(new Factory().createTariff(TariffsType.values()[index]));

        }
        packageTf.setTariff(tariffs);
        return packageTf;
    }

    public static void main(String[] args) {
        PackageTariffs packageTariffs = newPackage(10,4);
        packageTariffs.sort(new UserChangeComparator());
        System.out.println(packageTariffs.toString());
        List<Tariff> tariffs = new ArrayList<>();
        int count = packageTariffs.find(tariffs,new MegaBytesFilter(500,800));
        for (int i=0;i<count;i++){
            System.out.println(tariffs.get(i).getName()+" : "+ tariffs.get(i).getMegaBytes()+"\n");
        }
        System.out.println("total number of clients : "+packageTariffs.numberOfClients()+"\n");
    }
}
