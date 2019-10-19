package ru.itpark.mobile;

public class TariffOther extends TariffAbstract {
    private String shortDescription;

    public TariffOther(long id, String tariffGroup, String tariffName, String[] basicServices, float price, boolean tariffButton, String urlDetail, String shortDescription) {
        super(id, tariffGroup, tariffName, basicServices, price, tariffButton, urlDetail);
        this.shortDescription = shortDescription;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }
}
