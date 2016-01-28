package by.mix;


// многомерный массив как проходит рабочий день


public class Main27 {
    public static void main(String[] args) {

        zahozhyVZdan();
        vklKomp();
        rassmotrenieProekta();
        obed();
        vyhozhyIzZdan();
        vozvrObeda();
        zhaloba();
        vozvrZhaloba();
    }

    public static void zahozhyVZdan() {
        System.out.println("Захожу в здание");
        podnPoLest(5);
        otkrDver();
        zakrDver();
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
        System.out.println("Возвращаюсь с обеда");    // Почему повторяется два раза
        zahozhyVZdan();
        podnPoLest(5);
        otkrDver();
        zakrDver();
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
        podnPoLest(5);
        otkrDver();
        zakrDver();
    }


}
