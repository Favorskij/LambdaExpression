package com.lambdaexpression;

public class Main {

    public static void main(String[] args) {

        SumImpl sum1 = Integer::sum;
        System.out.println("1 == " + sum1.sum(1,2));

        SumImpl sum2 = (a, b) -> a + b;
        System.out.println("2 == " + sum2.sum(1,2));

        ///////////////////////////////////////

        SumImpl sum3 = (a, b) -> {
            return a + b;
        };
        System.out.println("3 == " + sum3.sum(3,4));

        ///////////////////////////////////////

        Sqrt sqrt1 = x -> x + 2;
        System.out.println("4 == " + sqrt1.sqrt(5));

        ///////////////////////////////////////

        Sqrt sqrt2 = x -> Math.sqrt(x);
        System.out.println("5 == " + sqrt2.sqrt(6));

        Sqrt sqrt3 = Math::sqrt;
        System.out.println("6 == " + sqrt3.sqrt(6));

        ///////////////////////////////////////

        Printer printer1 = x -> System.out.println(x);
        printer1.sqrt(8);

        Printer printer2 = System.out::println;
        printer2.sqrt(8);




    }


}
