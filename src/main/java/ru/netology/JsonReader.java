package ru.netology;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JsonReader {

    public static String readString(String filePath) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line);
            }
        } catch (IOException e) {
            System.err.println(e);

        }
        return content.toString();
    }


}
