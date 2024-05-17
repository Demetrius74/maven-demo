package org.example;

import com.google.gson.Gson;


public class Main {
    final static Gson gson = new Gson();

    public static void main(String[] args)  {
        Person person = new Person();
        person.setName("Dima");
        person.setLastName("Tyasko");

        String json = gson.toJson(person);

        System.out.println(json);
    }
}