package com.volodymyrvolynets;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Person me = new Person("Volodymyr", "Volynets");
        Gson gson = new Gson();

        System.out.println(gson.toJson(me));
    }
}
