package by.mix.DinamicObjectOOP;

/**
 * Created by st on 24.03.2016.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");


        ObjectArray objectArray = new ConsoleOutputObjectArray();
        Contact contact = new Contact("1", "2342");
        Contact contact2 = new Contact("1", "2342");

        objectArray.add(contact);
        objectArray.add(contact2);
        objectArray.add("2").add(1);

        objectArray.printArray();

        ObjectArray objectArray = new ObjectArray() {
            @Override
            public void printArray() {
                for (int i = 0; i < size(); i++) {
                    System.out.print(get(i));
                }
                System.out.println();
            }
        };

        objectArray.add("1").add("2").add("3");

        objectArray.printArray();

        System.out.println(objectArray.get(2));

        /*for (int i = 0; i < objectArray.size(); i++) {
            System.out.print(objectArray.get(i));
        }

        System.out.println();*/

        objectArray.remove(1);
        for (int i = 0; i < objectArray.size(); i++) {
            System.out.print(objectArray.get(i));
        }
    }
}