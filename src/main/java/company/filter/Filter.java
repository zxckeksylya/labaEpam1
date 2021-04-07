package company.filter;

import company.model.Tariff;

public interface Filter {

    boolean check(Tariff tariff);
}
