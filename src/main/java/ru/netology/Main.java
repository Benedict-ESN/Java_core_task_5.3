package ru.netology;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String json = JsonReader.readString("data.json");
        List<Employee> employees = JsonParser.jsonToList(json);

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }




}