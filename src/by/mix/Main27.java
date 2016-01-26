package by.mix;


// многомерный массив как проходит рабочий день


public class Main27 {
    public static void main(String[] args) {

        zashVZdan();
vklKomp();
    }

    public static void zashVZdan() {
        System.out.println("Зашел в здание");
        podnPoLest(5);
        otkrDver();
        zakrDver();
    }

    public static void podnPoLest(int etazhVverh) {
        System.out.println("Поднялся на " + etazhVverh + " этаж");
    }

    public static void opustPoLest(int etazhVniz) {
        System.out.println("Опустился на " + etazhVniz + " этаж");
    }

    public static void otkrDver() {
        System.out.println("Открыл дверь в кабинет");
    }

    public static void zakrDver() {
        System.out.println("Закрыл дверь в кабинет");
    }

    public static void vklKomp() {
        System.out.println("Включаю комп");
        pereodev();
    }
    public static void pereodev(){
        System.out.println("Пока включаю комп переодеваюсь");
    }

    public static void stavlChaj (){
        System.out.println();
    }


}
