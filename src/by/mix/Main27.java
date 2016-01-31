package by.mix;


// массив как проходит рабочий день


import java.util.Random;
import java.util.Scanner;

public class Main27 {
    public static void main(String[] args) {

        rabochDen();

    }

    public static void rabochDen() {
        zahozhyVZdan();
        vsemPrivet();
        // vklKomp();
        questionsNach();
        //  rassmotrenieProekta();
        // obed();
        vyhozhyIzZdan();
        //  vozvrObeda();
        //  privetEsliNoviChel();
        //  zhaloba();
        //  vozvrZhaloba();
        //  otpravkaZhaloba();
      //  domoj();
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
            System.out.println("О, у нас гости, приветствую!)");
        } else {
            System.out.println("после обеда никого нового не появилось");
        }
    }

    public static void questionsNach() {
        int vib, ignore;
        // do {

        System.out.println("Николаевич у тебя сегодня много работы! Определяйся на выбор:");
        System.out.println("1. Рассматриваешь проект");
        System.out.println("2. Разбираешься по жалобе");
        System.out.println("3. Ничего не делаешь, а просто пьешь чай и читаешь новости");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Твой выбор?:");
        vib = scanner.nextInt();

        //     do {
        //       ignore = scanner.nextInt();
        //   } while (ignore != "\n");
        //   }
        //   while (vib < 1 | vib > 3);

        if (vib == 1) {                                      // выбор проекта
            System.out.println("Молодец, хороший выбор");
            rassmotrenieProekta();
        }
        if (vib == 2) {                                     // выбор жалобы
            System.out.println("Неплохой выбор");
            choiceOfComplaint();
        }
        if (vib == 3) {                                     // выбор бездельничать
            int i;
            Random random = new Random();
            i = random.nextInt(2);
            if (i == 1) {
                System.out.println("Губу расскатай, выполнишь два задания");
            } else {
                System.out.println("я сегодня добрый, можешь отдохнуть)");
                System.out.println("Вот это житуха, всегда бы так");
                news();
            }
        }
    }

    public static void choiceOfComplaint() {   // выбор жалобы
        System.out.println("С кем поедещь на жалобу?:");
        System.out.println("1. С Гришей");
        System.out.println("2. Со мной");
        System.out.println("3. Или сам?");
        Scanner scanner = new Scanner(System.in);
        int vib2 = scanner.nextInt();
        if (vib2 == 1) {
            System.out.println("C Гришей");
        }
        if (vib2 == 2) {
            System.out.println("C Вами");
        }
        if (vib2 == 3) {
            System.out.println("Сейчас посмотрю жалобу и определюсь");
            kettle();
            checkEmail();
            drinkTea();
        }
    }

    public static void news() {
        System.out.print("Читаю нвости");
        drinkTea();
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
    }

    public static void pereodev() {
        System.out.println(" и в это время переодеваюсь");
    }

    public static void kettle() {                          // ставлю чайник
        System.out.println("Ставлю чайник");
    }

    public static void checkEmail() {                      // проверяю почту
        System.out.print("Проверяю рабочую почту");
    }

    public static void drinkTea() {                         // пью чай
        System.out.println(" и попиваю чаек");
    }

    public static void otprZhaloby() {
        System.out.println("Перенаправляю жалобы в район");
    }

    public static void rassmotrenieProekta() {
        System.out.println("Рассматриваю строительные проекты");
        izmenenProekt();
        drinkTea();
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
        drinkTea();
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
        vyhozhyIzZdan();
    }
}
