package ru.stqa.pft.sandbox;

public class MyFirstProgram{

    public static void main(String[]args) {
        hello("Hallo word!!!");
        double len = 5;
        System.out.println("Площадь квадрата со стороной " + len + " = " + area(len));
    }
    public static void hello(String somebody ){
        System.out.println(somebody);
    }
    public static double area( double len){
        return len * len;
    }

}