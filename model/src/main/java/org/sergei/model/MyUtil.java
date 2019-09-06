package org.sergei.model;

import java.util.ArrayList;
import java.util.List;

public class MyUtil {

    public static String reverse(String input) {

        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException(String.format("Input can be: [%s]", input));
        }

        List<String> tempArray = new ArrayList<>(input.length());

        for (int i = 0; i < input.length(); i++) {
            tempArray.add(input.substring(i, i+1));
        }

        StringBuilder reversedString = new StringBuilder(input.length());

        for (int i = tempArray.size() - 1; i >= 0; i--) {
            reversedString.append(tempArray.get(i));
        }

        return reversedString.toString();
    }

}
