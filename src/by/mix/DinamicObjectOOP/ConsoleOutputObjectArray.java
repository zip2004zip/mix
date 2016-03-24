package by.mix.DinamicObjectOOP;

/**
 * Created by st on 24.03.2016.
 */

//

public class ConsoleOutputObjectArray extends ObjectArray {

    @Override
    public void printArray() {
        for (int i = 0; i < size(); i++) {
           if (get(i) instanceof Printable) {
               ((Printable) get(i)).print();
           }
        }
    }
}
