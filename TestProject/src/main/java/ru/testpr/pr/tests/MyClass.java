package ru.testpr.pr.tests;

public class MyClass {

    public static void main(String[] args) {
        Square s = new Square(5);
        System.out.println(area(s));
        Rectangle r = new Rectangle(5, 6);
        System.out.println(area(r));
    }

    public static double area(Square s) {
       return s.l * s.l;
    }

    public static double area(Rectangle r) {
       return r.a * r.b;
    }
}