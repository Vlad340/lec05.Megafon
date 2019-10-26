package ru.itpark.tablet;

import ru.itpark.main.TariffAbstract;

public class TariffTablet extends TariffAbstract {
    private String shortDescription;

    public TariffTablet(long id, String group, String name, String basicServices, String price, String billingPeriod, boolean tariffButton, String urlDetail, String shortDescription) {
        super(id, group, name, basicServices, price, billingPeriod, tariffButton, urlDetail);
        this.shortDescription = shortDescription;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    @Override
    public void printTariff() {
        String result= "id=:"+ getId() +"\nИмя тарифа:" + getName()+"\n"+getShortDescription();
        result +="\nОсновной пакет:"+getBasicServices()+"\nЦена:"+getPrice()+" "+getBillingPeriod();
        if (isTariffButton()) {
            result += "\nкнопка <ВЫБРАТЬ>" + "\nссылка:" + getUrlDetail() + "\n";
        } else {
            result += "\nкнопка <" +getUrlDetail() + ">\n";
        }
        System.out.println(result);
    }
}
