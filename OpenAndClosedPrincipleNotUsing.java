package com.keyword;

import java.util.Scanner;

class Calculations
{
    String operator;
    double number1;
    double number2;
    double result;
    public void perform()     //If we want to include comparison operator ,Equal to operators
                             // then we have to modify perform method in class Calculations.
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the operator : ");
        operator = in.next();
        System.out.print("Enter the first number : ");
        number1 = in.nextInt();
        System.out.print("Enter the second number : ");
        number2 = in.nextInt();
        if(operator.equals("+"))
        {
         result = number1 + number2;
        }
        else if(operator.equals("-"))
        {
            result = number1 - number2;
        }
        else if(operator.equals("*"))
        {
            result = number1 * number2;
        }
        else if(operator.equals("/"))
        {
            result = number1 / number2;
        }
        else if(operator.equals("%"))
        {
            result = number1 % number2;
        }
        System.out.println(result); //Since result is of double type,if we want to print only statements for comparison and equal to
                                    //operators,then it should be modified.So program is modified.
    }
}

public class OpenAndClosedPrincipleNotUsing
{
    public static void main(String[] args)
    {
        Calculations calculate = new Calculations();
        calculate.perform();
    }
}

