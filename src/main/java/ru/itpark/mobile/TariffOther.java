package ru.itpark.mobile;

public class TariffOther extends TariffAbstract {
    private String shortDescription;

    public TariffOther(long id, String tariffGroup, String tariffName, String basicServices, String price, String billingPeriod, boolean tariffButton, String urlDetail, String shortDescription) {
        super(id, tariffGroup, tariffName, basicServices, price, billingPeriod, tariffButton, urlDetail);
        this.shortDescription = shortDescription;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

  /*  @Override
    public void printTariff() {
        String result= "id=:"+ getId() +"\nИмя тарифа:" +getTariffName();
        if (isFlagHit()) {
            result +=" Хит";
        }
        result +="\nОсновной пакет:"+getBasicServices()+"\nДополнительный пакет:"+getAdditionalService()+"\nЦена:"+getPrice()+" "+getBillingPeriod();
        if (isTariffButton()) {
            result +="\nкнопка <ВЫБРАТЬ>"+"\nссылка:"+getUrlDetail()+"\n";
        }
        System.out.println(result);
        return;
    }*/
}
