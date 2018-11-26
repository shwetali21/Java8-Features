package com.corejava.java8.features.functionalinterface;

/**A functional interface can extends another interface only when it does not have any abstract method.*//*
interface Sayable1 {  
    void say(String msg);   // abstract method  
} 

//Invalid '@FunctionalInterface' annotation; DoAble is not a functional interface
@FunctionalInterface  
interface DoAble extends Sayable1 {  
    // Invalid '@FunctionalInterface' annotation; Doable is not a functional interface  
    void doIt();  
}  
*/