package ru.itpark.mobile;

public class Main {
    public static void main(String[] args) {
        TariffAbstract[] tariff = new TariffAbstract[10];
        tariff[0]=new TariffMain(0,"Включайся!", "Включайся! Смотри","1200 минут. Безлимитный интернет. 300 SMS", "650 руб.", "за 30 дней",true,"https:url", "Кино и сериалы в Мегафон ТВ. Кэшбэк до 30%",false);
        tariff[0].printTariff();
    }
}
