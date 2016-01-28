package by.mix;


// массив как проходит рабочий день


import java.util.Random;

public class Main27 {
    public static void main(String[] args) {

        rabochDen();

    }

    public static void rabochDen() {
        zahozhyVZdan();
        vsemPrivet();
        vklKomp();
        rassmotrenieProekta();
        obed();
        vyhozhyIzZdan();
        vozvrObeda();
        privetEsliNoviChel();
        zhaloba();
        vozvrZhaloba();
        otpravkaZhaloba();
        domoj();
    }

    public static void zahozhyVZdan() {
        System.out.println("Захожу в здание");
        podnPoLest(5);
        otkrDver();
        zakrDver();
    }

    public static void vsemPrivet() {
        System.out.println("Говорю \"Здорова чувачелы!\"");
    }

    public static void privetEsliNoviChel() {
        int i;
        Random rnd = new Random();
        i = rnd.nextInt(2);
        if (i == 1) {
            System.out.println("кто-то новый появился после обеда, здороваюсь");
        } else {
            System.out.println("после обеда никого нового не появилось");
        }
    }

    public static void podnPoLest(int etazhVverh) {
        System.out.println("Поднимаюсь на " + etazhVverh + " этаж");
    }

    public static void opustPoLest(int etazhVniz) {
        System.out.println("Опускаюсь на " + etazhVniz + " этаж");
    }

    public static void otkrDver() {
        System.out.println("Открываю дверь в кабинет");
    }

    public static void zakrDver() {
        System.out.println("Закрываю дверь в кабинет");
    }

    public static void vklKomp() {
        System.out.print("Включаю комп");
        pereodev();
        stavlChaj();
        pochta();
        chaj();
        otprZhaloby();
    }

    public static void pereodev() {
        System.out.println(" и в это время переодеваюсь");
    }

    public static void stavlChaj() {
        System.out.println("Ставлю чайник");
    }

    public static void pochta() {
        System.out.print("Проверяю рабочую почту");
    }

    public static void chaj() {
        System.out.println(" и пью чай");
    }

    public static void otprZhaloby() {
        System.out.println("Перенаправляю жалобы в район");
    }

    public static void rassmotrenieProekta() {
        System.out.println("Рассматриваю строительные проекты");
        izmenenProekt();
        chaj();
    }

    public static void izmenenProekt() {
        System.out.print("Вношу изменения в проект");
    }

    public static void obed() {
        System.out.println("Собираюсь на обед");
        otkrDver();
        zakrDver();
        opustPoLest(1);
    }

    public static void vyhozhyIzZdan() {
        System.out.println("Выхожу из здания");
    }

    public static void vozvrObeda() {
        System.out.println("Возвращаюсь с обеда");
        zahozhyVZdan();

    }

    public static void zhaloba() {
        System.out.println("Выезжаю на разбирателльство по жалобе");
        dokiZhaloba();
        otkrDver();
        zakrDver();
        opustPoLest(1);
        vyhozhyIzZdan();

    }

    public static void dokiZhaloba() {
        System.out.println("Беру доки по жалобе");
    }

    public static void vozvrZhaloba() {
        System.out.println("Возвращаюсь с жалобы");
        zahozhyVZdan();
        otvetZhaloba();
    }

    public static void otvetZhaloba() {
        System.out.print("Подготавливаю ответ по жалобе");
        chaj();
        otkrDver();
        zakrDver();
        opustPoLest(3);
    }

    public static void otpravkaZhaloba() {
        System.out.println("Отправка письма по жалобе");
        podnPoLest(5);
        otkrDver();
        zakrDver();
    }

    public static void domoj() {
        System.out.print("Выключаю комп");
        pereodev();
        System.out.println("прощаюсь с чувачелами");
        otkrDver();
        zakrDver();
        opustPoLest(1);
    }
}
