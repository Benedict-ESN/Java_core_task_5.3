package ru.netology;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;
import java.util.List;

public class JsonParser {
    public static List<Employee> jsonToList(String json) {
        List<Employee> employees = new ArrayList<>();
        JSONParser parser = new JSONParser();
        Gson gson = new GsonBuilder().create();

        try {
            JSONArray jsonArray = (JSONArray) parser.parse(json);
            for (Object obj : jsonArray) {
                Employee employee = gson.fromJson(obj.toString(), Employee.class);
                employees.add(employee);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return employees;
    }


}