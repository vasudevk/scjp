package io.learn;

public class OverloadResolution {


/*    The process of the compiler trying to resolve the method call from given overloaded method definitions is called
    overload resolution. For resolving a method call, it first looks for the exact match—the method definition with exactly
    same number of parameters and types of parameters. If it can’t find an exact match, it looks for the closest match by
    using upcasts. If the compiler can’t find any match, then you’ll get a compiler error,*/


    public static void aMethod(int val) {
        System.out.println("int");
    }

    public static void aMethod(short val) {
        System.out.println("short");
    }

    public static void aMethod(Object val) {
        System.out.println("object");
    }

    public static void aMethod(String val) {
        System.out.println("String");
    }

    public static void aMethod(long val1, int val2) {
        System.out.println("long, int");
    }

    public static void aMethod(int val1, long val2) {
        System.out.println("int, long");
    }

    public static void main(String[] args) {
        byte b = 9;
        aMethod(b); // first call
        aMethod(9); // second call
        Integer i = 9;
        aMethod(i); // third call
        aMethod("9"); // fourth call

        /* Overload resolution fails (with a compiler error) if there are no matches or ambiguous matches.*/
        /*aMethod(9, 10);*/
    }
}
