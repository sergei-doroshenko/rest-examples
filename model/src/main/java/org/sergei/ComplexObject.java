package org.sergei;

public class ComplexObject {
    private final int value;

    public ComplexObject(int i) {
        this.value = i;
    }

    @Override
    public String toString() {
        return "ComplexObject{" +
                "value=" + value +
                '}';
    }
}
