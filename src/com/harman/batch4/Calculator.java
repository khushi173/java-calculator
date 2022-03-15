package com.harman.batch4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Addition adcalc = new Addition();//Object Creation
        Subtraction subcalc = new Subtraction();
        Multiplication mulcalc = new Multiplication();
        Scanner input = new Scanner(System.in);
        int n1, n2, result1, result2, result3, result4;
        System.out.println("ENTER num1");
        n1 = input.nextInt();
        System.out.println("ENTER num2");
        n2 = input.nextInt();
        result1 = adcalc.AdditionOperation(n1,n2);
        result2 = subcalc.SubtractOperation(n1,n2);
        result3 = mulcalc.MultiplicationOperation(n1,n2);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }

}
