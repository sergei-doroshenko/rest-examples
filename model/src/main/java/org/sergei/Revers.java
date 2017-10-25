package org.sergei;

public class Revers {
    private final String input;

    public Revers(String input) {

        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException(String.format("Input can be: [%s]", input));
        }

        this.input = input;
    }

    public String get() {
        char[] chars = input.toCharArray();

        StringBuilder reversedString = new StringBuilder(input.length());

        for (int i = chars.length - 1; i >= 0; i--) {
            reversedString.append(chars[i]);
        }

        return reversedString.toString();
    }
}
