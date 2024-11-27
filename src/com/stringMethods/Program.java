package com.stringMethods;

import java.lang.reflect.Method;

public class Program {
    public static void main(String[] args) {

        Class<String> stringClass = String.class;

        Method[] methods = stringClass.getDeclaredMethods();

        System.out.println("Methods of the String class:");
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}
