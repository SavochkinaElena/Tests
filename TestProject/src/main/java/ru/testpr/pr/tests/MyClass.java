package ru.testpr.pr.tests;

public class MyClass {

    public static void main(String[] args) {
        Square s = new Square(5);
        System.out.println(s.area());
        Rectangle r = new Rectangle(5, 6);
        System.out.println(r.area());
    }
}