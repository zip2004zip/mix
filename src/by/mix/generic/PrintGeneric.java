package by.mix.generic;

/**
 * Created by st on 12.04.2016.
 */
public class PrintGeneric<T> {
    private T t;

    public PrintGeneric(T t) {
        this.t = t;
    }

    public String toString (){
        return "{" + t+"}";
    }

    public T getObject(){
        return t;
    }
}
