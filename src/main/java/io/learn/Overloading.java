package io.learn;

public class Overloading {

    // overloaded wish method with String as an argument
    public static void wish(String name) {
        System.out.println("Happy birthday " + name + "!");
    }

    // overloaded wish method with no arguments; this method in turn invokes wish(String) method
    public static void wish() {
        wish("to you");
    }

    public static void main(String[] args) {
        wish();
        wish("dear Emily Kirsch");
    }

}

/*
    The signature of a method is made up of the method name, number of arguments, and types of arguments.
        You can overload methods with same name but with different signatures. Since return type and exception
        specification are not part of the signature, you cannot overload methods based on return type or exception
        specification alone
*/
