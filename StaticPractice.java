package com.CSCI185;

public class StaticPractice {

    public static void main(String[] args) {
        double num1 = square(5);
        System.out.println("Square of 5 is: "+num1);
        double num2 = cube(2);
        System.out.println("Cube of 2 is: "+num2);
    }
    public static double square(double n)
    {
                return n*n;

    }

//    public static void cube(double n)
//    {
//        double answer = n*n*n;
//        System.out.println("n cubed is: "+answer);
//    }

    public static double cube(double n)
    {
        return n*n*n;
    }
}
