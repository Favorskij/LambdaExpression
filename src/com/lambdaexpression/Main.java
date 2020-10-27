package com.lambdaexpression;

public class Main {

    public static void main(String[] args) {

        SumImpl sum1 = Integer::sum;
        System.out.println(sum1.sum(1,2));

        SumImpl sum2 = (a, b) -> a + b;
        System.out.println(sum2.sum(2,3));

        SumImpl sum3 = (a, b) -> {
            return a + b;
        };
        System.out.println(sum3.sum(3,4));

        Sqrt sqrt1 = x -> x + 2;
        System.out.println(sqrt1.sqrt(5));

        Sqrt sqrt2 = x -> Math.sqrt(x);
        System.out.println(sqrt2.sqrt(6));


        Sqrt sqrt3 = Math::sqrt;
        System.out.println(sqrt3.sqrt(7));

    }


}
