package ru.itpark.mobile;

import ru.itpark.main.TariffAbstract;

public class TariffMobile extends TariffAbstract {
    private String additionalService;
    private boolean flagHit;

    public TariffMobile(long id, String group, String name, String basicServices, String price, String billingPeriod, boolean tariffButton, String urlDetail, String additionalService, boolean flagHit) {
        super(id, group, name, basicServices, price, billingPeriod, tariffButton, urlDetail);
        this.additionalService = additionalService;
        this.flagHit=flagHit;
    }

    public String getAdditionalService() {
        return additionalService;
    }

    public void setAdditionalService(String additionalService) {
        this.additionalService = additionalService;
    }

     public void setFlagHit(boolean flagHit) {
        this.flagHit = flagHit;
    }

    public boolean isFlagHit() {
        return flagHit;
    }

    @Override
    public void printTariff() {
        String result= "id=:"+ getId() +"\nИмя тарифа:" + getName();
        if (isFlagHit()) {
            result +="\nХит";
        }
        result +="\nОсновной пакет:"+getBasicServices()+"\nДополнительный пакет:"+getAdditionalService()+"\nЦена:"+getPrice()+" "+getBillingPeriod();
        if (isTariffButton()) {
            result += "\nкнопка <ВЫБРАТЬ>" + "\nссылка:" + getUrlDetail() + "\n";
        } else {
            result += "\nкнопка <" +getUrlDetail() + ">\n";
        }
        System.out.println(result);
    }
}
