package com.chetan.lambda;

/*
* This is test class for testing  custom functional interface through various ways
* */
public class TestMyFunctionalInterface {

    public static void main(String[] args) {

        // Implementing using anonymous inner class
        MyFunctionalInterface functionalInterfaceAnonymousInnerClass = new MyFunctionalInterface() {
            @Override
            public void print(Object input) {
                System.out.println(input);
            }
        };
        functionalInterfaceAnonymousInnerClass.print("Hello From Anonymous inner class");

        // Implementing using lambda expression
        MyFunctionalInterface functionalInterfaceLambda = input -> System.out.println(input);
        functionalInterfaceLambda.print("Hello from lambda");

        // Implementing using method reference
        MyFunctionalInterface functionalInterfaceMethodRef = System.out::println;
        functionalInterfaceMethodRef.print("Hello from method reference");

    }

}
