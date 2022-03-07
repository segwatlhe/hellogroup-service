package com.hellogroup.controller;

import com.google.gson.Gson;
import org.modelmapper.internal.util.Lists;

import java.util.Collection;

public class GSONController {

    Gson gson = new Gson();
    int[] ints = {1, 2, 3, 4, 5};
    String[] strings = {"abc", "def", "ghi"};

    public static void main(String[] args) {
        System.out.println("hello world");

        Gson gson = new Gson();
        int[] ints = {1, 2, 3, 4, 5};
        String[] strings = {"abc", "def", "ghi"};

       // (Serialization)
        gson.toJson(ints);   //  ==> prints [1,2,3,4,5]
        gson.toJson(strings); // ==> prints ["abc", "def", "ghi"]
        System.out.println(gson.toJson(ints));
        System.out.println(gson.toJson(strings));

        // Collections Examples
    }
}

