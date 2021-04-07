package company.filter;

import company.model.Tariff;

public class MegaBytesFilter implements Filter{
    private int start;
    private int finish;
    public MegaBytesFilter(int start,int finish){
        this.start=start;
        this.finish=finish;
    }
    @Override
    public boolean check(Tariff tariff){
        if(tariff.getMegaBytes()>=start && tariff.getMegaBytes()<=finish)
            return true;
        else return false;
    }
}
