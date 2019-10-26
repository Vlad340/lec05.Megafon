package ru.itpark.mobile;

public class Main {
    public static void main(String[] args) {
        TariffAbstract[] tariff = new TariffAbstract[10];
        tariff[0]=new TariffMain(0,"Включайся!", "Включайся! Смотри","1200 минут. Безлимитный интернет. 300 SMS", "650 руб.", "за 30 дней",true,"https:url0", "Кино и сериалы в Мегафон ТВ. Кэшбэк до 30%",false);
        tariff[1]=new TariffMain(1,"Включайся!", "Включайся! Общайся","600 минут. Безлимитный интернет.", "350 руб.", "за 30 дней",true,"https:url1", "Всегда оставайся на связи. Кэшбэк до 30%",true);
        tariff[2]=new TariffOther(2,"Модемы", "Твой безлимит на 6 месяцев","Безлимитный интернет.", "3100 руб.", "",true,"https:url2", "Трафик без ограничений для использования дома и в поездках по России");
        tariff[3]=new TariffOther(3,"Модемы", "Твой безлимит на 12 месяцев","Безлимитный интернет.", "5100 руб.", "",true,"https:url3", "Трафик без ограничений для использования дома и в поездках по России");
        tariff[4]=new TariffOther(4,"Модемы", "МегаФон - Онлайн","Оплата трафика по факту использования", "0 руб.", "в месяц",true,"https:url4", "Базовый тариф для подключения интернет-опций и использования на устройствах.");
        tariff[5]=new TariffOther(5,"Прочие", "#Hello","30 Гб. Безлимитные звонки внутри сети", "750 руб.", "за 14 дней",false,"https:url5", "Тариф для иностранных туристов");
        tariff[6]=new TariffOther(6,"Прочие", "Посекундный","Посекундная тарификация", "0 руб.", "",false,"https:url6", "Тариф без абонентской платы");
        tariff[7]=new TariffOther(7,"Прочие", "Умные вещи","Безлимитный интернет. Звонки и SMS на номера России", "20 руб.", "в неделю",true,"https:url7", "Тариф для умных устройств");

        System.out.println("\nТарифы 'Включайся!'\n");
        for (TariffAbstract result : tariff) {
            if (result == null) {
                break;
            }
            if (result.getGroup() == "Включайся!") {
                result.printTariff();
            }
        }

        System.out.println("\nДля пользователей модемов, роутеров, планшетов\n");
        for (TariffAbstract result : tariff) {
            if (result == null) {
                break;
            }
            if (result.getGroup() == "Модемы") {
                result.printTariff();
            }

        }       System.out.println("\nОстальные тарифы\n");
        for (TariffAbstract result : tariff) {
            if (result == null) {
                break;
            }
            if (result.getGroup() == "Прочие") {
                result.printTariff();
            }
        }
    }
}
