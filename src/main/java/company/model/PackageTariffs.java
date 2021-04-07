package company.model;

import company.filter.Filter;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PackageTariffs {
    private int num;
    private List<Tariff> tariff;



    public List<Tariff> getTariff() {
        return tariff;
    }

    public void setTariff(List<Tariff> tariff) {
        this.tariff = tariff;
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
                ",\n tariff=" + tariff +
                '}';
    }
    public void sort(Comparator<Tariff> comparator){
        Collections.sort(getTariff(),comparator);
    }
    public int find(List<Tariff> tariffs, Filter filter ){
        int index = 0;
        for (Tariff tariff : getTariff()){
            if (filter.check(tariff)){
                tariffs.add(tariff);
                index++;
            }
        }
        return tariffs.size();
    }
    public int numberOfClients(){
        int sum=0;
        for (Tariff tariff : getTariff()){
            sum+=tariff.getAmountClients();
        }
        return sum;
    }
}
