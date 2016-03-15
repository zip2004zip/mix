package by.mix.FunccionalnoeProgram;


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
        vklKomp();
        questionsNach();
        goHome();
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
        int j;
        Random rnd = new Random();
        j = rnd.nextInt(2);
        if (j == 1) {
            System.out.println("\n- О, у нас гости, приветствую всех!)");
        } else {
            System.out.println("\nпосле обеда никого нового не появилось\n");
        }
    }

    public static void questionsNach() {
        int vib, ignore;
        // do {

        System.out.println("\n- Николаевич у тебя сегодня много работы! Определяйся на выбор:");
        System.out.println("1. Рассматриваешь проект");
        System.out.println("2. Разбираешься по жалобе");
        System.out.println("3. Ничего не делаешь, а просто пьешь чай и читаешь новости");
        Scanner scanner = new Scanner(System.in);
        System.out.println("- Твой выбор?:");
        vib = scanner.nextInt();

        //     do {
        //       ignore = scanner.nextInt();
        //   } while (ignore != "\n");
        //   }
        //   while (vib < 1 | vib > 3);

        if (vib == 1) {                                      // выбор проекта
            System.out.println("\n- Молодец, хороший выбор");
            System.out.println("- Да, безопасностное строительство превыше всего");
            rassmotrenieProekta();
            obed();
            nothingToDo();

        }
        if (vib == 2) {                                     // выбор жалобы
            System.out.println("\n- Неплохой выбор");
            choiceOfComplaint();
            kettle();
            checkEmail();
            drinkTea();
            withWhomComplain();
            redirectComplaint();
            goComplaint();
            backComplaint();
            obed();
            responseComplaint();

        }
        if (vib == 3) {                                     // выбор бездельничать
            int i;
            Random random = new Random();
            i = random.nextInt(2);
            if (i == 1) {
                System.out.println("\n- Губу расскатай, выполнишь тогда два задания\n");
                choiceOfComplaint();
                kettle();
                checkEmail();
                drinkTea();
                withWhomComplain();
                redirectComplaint();
                goComplaint();
                backComplaint();
                obed();
                responseComplaint();
                rassmotrenieProekta();
            } else {
                System.out.println("\n- я сегодня добрый, можешь отдохнуть)");
                System.out.println("- Вот это житуха, всегда бы так\n");
                news();
                obed();
                news();
            }
        }
    }

    public static void choiceOfComplaint() {                   // выбор жалобы
        System.out.println("\n- С кем поедещь на жалобу?:");
        System.out.println("1. С Гришей");
        System.out.println("2. Со мной");
        System.out.println("3. Или сам?");
        Scanner scanner = new Scanner(System.in);
        int vib2 = scanner.nextInt();
        if (vib2 == 1) {
            System.out.println("\n- C Гришей");
        }
        if (vib2 == 2) {
            System.out.println("\n- C Вами");
        }
        if (vib2 == 3) {
            System.out.println("\n- Сейчас посмотрю жалобу и определюсь");

        }
    }

    public static void withWhomComplain() {               // выбираю с кем поеду на жалобу
        Random random = new Random();
        int i = random.nextInt(3);
        if (i == 1) {
            System.out.println("\n- А так тут не сложно, сам справлюсь");
        }
        if (i == 2) {
            System.out.println("\n- Да, есть над чем подумать, поеду с Гришей)");
        }
        if (i == 3) {
            System.out.println("\n- Сложная задача, с Гришей не справлюсь, поеду с вами");
        }
    }

    public static void nothingToDo() {                                    //нечем заняться
        System.out.println("\n- Все сделал, чем бы заняться таким?)");
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 1) {
            System.out.println("- Займуська я пожалуй еще и жалобой\n");
            kettle();
            checkEmail();
            drinkTea();
            withWhomComplain();
            redirectComplaint();
            goComplaint();
            backComplaint();
            responseComplaint();
        } else {
            System.out.println("- Да ничего не хочу делать, почитаю просто новости\n");
            kettle();
            news();
        }
    }

    public static void news() {
        System.out.print("Читаю новости");
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

    public static void drinkTea() {                         // пью чай
        System.out.println(" и попиваю чаек");
    }


    public static void checkEmail() {                      // проверяю почту
        System.out.print("Проверяю рабочую почту");
    }


    public static void redirectComplaint() {
        System.out.println("Перенаправляю жалобы в район");
    }

    public static void rassmotrenieProekta() {
        System.out.println("\nРассматриваю строительные проекты");
        izmenenProekt();
        drinkTea();
    }

    public static void izmenenProekt() {
        kettle();
        System.out.print("Вношу изменения в проект");
    }

    public static void obed() {
        System.out.println("\nСобираюсь на обед");
        vyhozhyIzZdan();
        vozvrObeda();
        privetEsliNoviChel();
    }

    public static void vozvrObeda() {
        System.out.println("\nВозвращаюсь с обеда");
        zahozhyVZdan();
    }

    public static void vyhozhyIzZdan() {
        otkrDver();
        zakrDver();
        opustPoLest(1);
        System.out.println("Выхожу из здания");
    }

    public static void goComplaint() {
        documentsComplaint();
        System.out.println("Выезжаю на разбирателльство по жалобе");
        vyhozhyIzZdan();
    }

    public static void documentsComplaint() {
        System.out.println("Беру доки по жалобе");
    }

    public static void backComplaint() {
        System.out.println("Возвращаюсь с жалобы");
        zahozhyVZdan();
    }

    public static void responseComplaint() {
        System.out.print("Подготавливаю ответ по жалобе");
        drinkTea();
        otkrDver();
        zakrDver();
        opustPoLest(3);
        sendComplaint();
    }

    public static void sendComplaint() {
        System.out.println("Регистрирую письмо в секретариате и передаю на отправку жалобщику");
        podnPoLest(5);
        otkrDver();
        zakrDver();
    }

    public static void goHome() {
        System.out.println("\n- Вот и рабочий день закончился)");
        System.out.print("\nВыключаю комп");
        pereodev();
        System.out.println("прощаюсь с чувачелами");
        vyhozhyIzZdan();
    }
}
