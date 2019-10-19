package ru.itpark.mobile;

public class Main {
    public static void main(String[] args) {
        TariffAbstract[] tariff = new TariffAbstract[10];
        tariff[0]=new TariffMain(0,"Включайся!", "Включайся! Смотри","1200 минут. Безлимитный интернет. 300 SMS", "650 руб.", "за 30 дней",true,"https:url0", "Кино и сериалы в Мегафон ТВ. Кэшбэк до 30%",false);
        tariff[1]=new TariffMain(1,"Включайся!", "Включайся! Общайся","600 минут. Безлимитный интернет.", "350 руб.", "за 30 дней",true,"https:url1", "Всегда оставайся на связи. Кэшбэк до 30%",true);
        for (TariffAbstract result : tariff) {
            if (result == null) {
                return;
            }
            if (result.getTariffGroup() == "Включайся!") {
                result.printTariff();
            }
        }

    }
}
