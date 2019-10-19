package ru.itpark.mobile;

public class TariffMain extends TariffAbstract {
    String additionalService [];

    public TariffMain(long id, String tariffGroup, String tariffName, String[] basicServices, float price, boolean tariffButton, String urlDetail, String[] additionalService) {
        super(id, tariffGroup, tariffName, basicServices, price, tariffButton, urlDetail);
        this.additionalService = additionalService;
    }

    public String[] getAdditionalService() {
        return additionalService;
    }

    public void setAdditionalService(String[] additionalService) {
        this.additionalService = additionalService;
    }
}
