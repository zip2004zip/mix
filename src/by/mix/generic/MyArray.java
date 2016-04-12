package by.mix.generic;

/**
 * Created by st on 12.04.2016.
 */
public class MyArray<T extends Printable> {
    private T[] objects;

    public MyArray() {
        this(0);
    }

    public MyArray(int size) {
        objects = (T[]) new Object[size];
    }

    public T get(int index) {
        return objects[index];
    }

    public int size() {
        return objects.length;
    }

    public MyArray add(T o) {
        T[] objects1 = (T[]) new Object[objects.length + 1];
        for (int i = 0; i < objects.length; i++) {
            objects1[i] = objects[i];
        }
        objects1[objects1.length - 1] = o;
        objects = objects1;
        return this;
    }

    public MyArray remove(int index) {
        T[] objects1 = (T[]) new Object[objects.length - 1];
        int index1 = 0;
        for (int i = 0; i < objects.length; i++) {
            if (i != index) {
                objects1[index1] = objects[i];
                index1++;
            }
        }
        objects = objects1;
        return this;
    }

    public void print() {
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
    }
}
