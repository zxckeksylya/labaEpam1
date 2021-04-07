package company.model;

import company.filter.Filter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TariffPackage {
    private int num;
    private List<Tariff> tariffList;


    public List<Tariff> getTariffList() {
        return tariffList;
    }

    public void setTariffList(List<Tariff> tariffList) {
        this.tariffList = tariffList;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "PackageTariffs{" +
                "\n num=" + num +
                ",\n tariff=" + tariffList +
                '}';
    }

    public void sort(Comparator<Tariff> comparator) {
        Collections.sort(getTariffList(), comparator);
    }

    public List<Tariff> find(Filter filter) {
        List<Tariff> result = new ArrayList<>();

        for (Tariff tariff : getTariffList()) {
            if (filter.check(tariff)) {
                result.add(tariff);
            }
        }

        return result;
    }

    public int numberOfClients() {
        int sum = 0;
        for (Tariff tariff : getTariffList()) {
            sum += tariff.getAmountClients();
        }
        return sum;
    }
}
