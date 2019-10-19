package ru.itpark.mobile;

public abstract class TariffAbstract {
    private long id;
    private String tariffGroup;
    private String tariffName;
    private String basicServices;
    private String price;
    private String billingPeriod;
    private boolean tariffButton;
    private String urlDetail;

    public TariffAbstract(long id, String tariffGroup, String tariffName, String basicServices, String price, String billingPeriod, boolean tariffButton, String urlDetail) {
        this.id=id;
        this.tariffGroup=tariffGroup;
        this.basicServices =basicServices;
        this.tariffName=tariffName;
        this.price = price;
        this.billingPeriod=billingPeriod;
        this.tariffButton = tariffButton;
        this.urlDetail = urlDetail;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTariffGroup() {
        return tariffGroup;
    }

    public void setTariffGroup(String tariffGroup) {
        this.tariffGroup = tariffGroup;
    }

    public String getTariffName() {
        return tariffName;
    }

    public void setTariffName(String tariffName) {
        this.tariffName = tariffName;
    }

    public String getBasicServices() {
        return basicServices;
    }

    public void setBasicServices(String basicServices) {
        this.basicServices = basicServices;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBillingPeriod() {
        return billingPeriod;
    }

    public void setBillingPeriod(String billingPeriod) {
        this.billingPeriod = billingPeriod;
    }

    public boolean isTariffButton() {
        return tariffButton;
    }

    public void setTariffButton(boolean tariffButton) {
        this.tariffButton = tariffButton;
    }

    public String getUrlDetail() {
        return urlDetail;
    }

    public void setUrlDetail(String urlDetail) {
        this.urlDetail = urlDetail;
    }

    public void printTariff() {
        return;
    }
}