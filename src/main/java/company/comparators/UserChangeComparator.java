package company.comparators;

import company.model.Tariff;

import java.util.Comparator;

public class UserChangeComparator implements Comparator<Tariff> {
    @Override
    public int compare(Tariff o1, Tariff o2) {
        return (int) (o1.getUserCharge() - o2.getUserCharge());
    }
}
