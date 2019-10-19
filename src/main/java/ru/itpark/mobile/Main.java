package ru.itpark.mobile;

public class Main {
    public static void main(String[] args) {
        TariffAbstract[] tariff = new TariffAbstract[10];
        tariff[0]=new TariffMain(0,"Включайся!", "Включайся! Смотри","1200 минут. Безлимитный интернет. 300 SMS", "650 руб.", "за 30 дней",true,"https:url0", "Кино и сериалы в Мегафон ТВ. Кэшбэк до 30%",false);
        tariff[1]=new TariffMain(1,"Включайся!", "Включайся! Общайся","600 минут. Безлимитный интернет.", "350 руб.", "за 30 дней",true,"https:url1", "Всегда оставайся на связи. Кэшбэк до 30%",true);
        tariff[2]=new TariffOther(2,"Модемы", "Твой безлимит на 6 месяцев","Безлимитный интернет.", "3100 руб.", "",true,"https:url2", "Трафик без ограничений для использования дома и в поездках по России");
        tariff[3]=new TariffOther(3,"Модемы", "Твой безлимит на 12 месяцев","Безлимитный интернет.", "5100 руб.", "",true,"https:url3", "Трафик без ограничений для использования дома и в поездках по России");
        tariff[4]=new TariffOther(4,"Модемы", "МегаФон - Онлайн","Оплата трафика по факту использования", "0 руб.", "в месяц",true,"https:url4", "Базовый тариф для подключения интернет-опций и использования на устройствах.");

        System.out.println("Тарифы 'Включайся!'\n");
        for (TariffAbstract result : tariff) {
            if (result == null) {
                break;
            }
            if (result.getTariffGroup() == "Включайся!") {
                result.printTariff();
            }
        }

        System.out.println("Для пользователей модемов, роутеров, планшетов\n");
        for (TariffAbstract result : tariff) {
            if (result == null) {
                return;
            }
            if (result.getTariffGroup() == "Модемы") {
                result.printTariff();
            }
        }
    }
}
