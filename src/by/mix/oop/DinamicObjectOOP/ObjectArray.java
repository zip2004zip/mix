package by.mix.oop.DinamicObjectOOP;

/**
 * Created by st on 24.03.2016.
 */

public abstract class ObjectArray {
    private Object[] objects;

    public ObjectArray() {
        this(0);
    }

    public ObjectArray(int size) {
        objects = new Object[size];
    }

    protected Object[] getObjects() {
        return objects;
    }

    public Object get(int index) {
        return objects[index];
    }

    public int size() {
        return objects.length;
    }

    public ObjectArray add(Object o) {
        Object[] objects1 = new Object[objects.length + 1];
        for (int i = 0; i < objects.length; i++) {
            objects1[i] = objects[i];
        }
        objects1[objects1.length - 1] = o;
        objects = objects1;
        return this;
    }

    public ObjectArray remove(int index) {
        Object[] objects1 = new Object[objects.length - 1];
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

    public abstract void printArray();
}