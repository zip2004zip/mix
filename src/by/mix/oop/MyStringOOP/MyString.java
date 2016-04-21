package by.mix.oop.MyStringOOP;

/**
 * Created by st on 22.03.2016.
 */

public class MyString {
    private String string = "";

    public MyString(String string) {
        this.string = string;
    }

    public String getS() {
        return string;
    }

    public int size() {
        return string.length();
    }

    public boolean equals(MyString myString) {
        if (string.length() == myString.size()) {
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) != myString.string.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public MyString append(MyString myString) {
        string = string.concat(myString.string);
        return this;
    }

    public MyString substring(int start, int length) {
        if (start > size() - 1 || start + length > size()) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer("");
        for (int i = start; i < start + length; i++) {
            stringBuffer.append(string.charAt(i));
        }
        return new MyString(stringBuffer.toString());
    }
}

