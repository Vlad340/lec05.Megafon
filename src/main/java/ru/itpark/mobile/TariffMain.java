package ru.itpark.mobile;

public class TariffMain extends TariffAbstract {
    private String additionalService;
    private boolean flagHit;

    public TariffMain(long id, String tariffGroup, String tariffName, String basicServices, String price, String billingPeriod, boolean tariffButton, String urlDetail, String additionalService, boolean flagHit) {
        super(id, tariffGroup, tariffName, basicServices, price, billingPeriod, tariffButton, urlDetail);
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
        String result= "id=:"+ getId() +"\nИмя тарифа:" +getTariffName();
        if (isFlagHit()) {
            result +="\nХит";
        }
        result +="\nОсновной пакет:"+getBasicServices()+"\nДополнительный пакет:"+getAdditionalService()+"\nЦена:"+getPrice()+" "+getBillingPeriod();
        if (isTariffButton()) {
            result +="\nкнопка <ВЫБРАТЬ>"+"\nссылка:"+getUrlDetail()+"\n";
        }
        System.out.println(result);
        return;
    }
}
