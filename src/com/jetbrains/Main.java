package com.jetbrains;

import com.sun.istack.internal.NotNull;

public class Main {
    public static void main (@NotNull String[] args){
        System.out.println(args[0]);
        System.out.println("rrryes?");
        String [] soon = {"this","that"};
        start(soon);

    }

    public static void start(String[] args) {
        System.out.println(args[1]);
    }
}