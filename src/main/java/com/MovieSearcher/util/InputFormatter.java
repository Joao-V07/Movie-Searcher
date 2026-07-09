package com.MovieSearcher.util;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class InputFormatter {
    public static String formatInput(String input) {
        if (input == null || input.trim().isEmpty()) {
            throw new IllegalArgumentException("Input cannot be empty");
        }
        String trimmedInput = input.trim();
        String normalizedInput = trimmedInput.replaceAll("\\s+", " ");
        System.out.println(URLEncoder.encode(normalizedInput, StandardCharsets.UTF_8));
        return URLEncoder.encode(normalizedInput, StandardCharsets.UTF_8);
    }
}
