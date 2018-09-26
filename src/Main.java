import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
//opgave 2.2
        System.out.println("opgave 2.2");
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter Radius");
        double radius = sc.nextDouble();
        double area = radius * radius * 3.14159;
        System.out.println(area);

        System.out.println("Opgave 2.3 = no diffrence between java.util.* og java.util.scanner andet en man nu har adgang til alt i util");

//opgave 2.4 (edition 10 after)
        System.out.println();
        System.out.println("opgave 2.4");
        System.out.println("Insert pounds to convert into kilogram");

        double pound = sc.nextDouble();
        double kilo = pound*0.454;
        System.out.println(pound + " pounds is " + kilo + " kg");
        System.out.println();
//opgave 2.5
        System.out.println("Opgave 2.5");
        System.out.println("Write subtotal and gratuity");
        double subtotal = sc.nextDouble();
        double gratuity = sc.nextDouble();
        double total = subtotal*(1+(gratuity/100));
        double gratuityTotal = subtotal*(1+(gratuity/100))-subtotal;
        System.out.println(total);
        System.out.println(gratuityTotal);
        System.out.println();
//opgave 2.6
        System.out.println("Opgave 2.6");
        System.out.println("Write a number between 0 and 1000");
        int number = sc.nextInt();
        int sumOfDigits = (number % 10) + (number/10)% 10 + (number/100)% 10;
        System.out.println("the sum of the digits is " + sumOfDigits);
        System.out.println();
//opgave 2.7
        System.out.println("Opgave 2.7");
        System.out.println("Write minutes and get it in years and days");
        int minutes = sc.nextInt();

        int years = minutes/(60*24*365);
        int days = minutes/((60*24)%365);
        System.out.println(minutes + " minutes is approx " + years + " years and " + days + "days");
        System.out.println();
//opgave 2.8
        System.out.println("Opgave 2.8");
        //Kan ikke få ShowCurrentTime.java frem.... lidt svær at lave uden at det virker :)
        System.out.println();
//opgave 2.9
        System.out.println("Opgave 2.9");
        System.out.println("Write start velocity(M/S), end velocity(M/S) and Time in seconds");
        double v0 = sc.nextDouble();
        double v1 = sc.nextDouble();
        double time = sc.nextDouble();
        double aceleration = (v1-v0)/time;
        System.out.println(aceleration);
        System.out.println();

//opgave 2.13
        System.out.println("Opgave 2.13");
        System.out.println("Enter savings amount put in the account every month");
        double money = sc.nextDouble();
        double month1 = money * (1 + 0.00417);
        double month2 = (month1 + money)*1.00417;
        double month3 = (month2 + money)*1.00417;
        double month4 = (month3 + money)*1.00417;
        double month5 = 1.00417*(money + month4);
        double month6 = 1.00417*(money + month5);
        System.out.println("you will have " + month6 + "$ after 6 months");
//opgave 2.14
        System.out.println();
        System.out.println("Opgave 2.14");
        System.out.println("Calculation your BMI");
        System.out.println("Write hight in inches");
        double inch = sc.nextDouble();
        double meters = inch/0.0254;
        System.out.println("Write weight in pounds");
        double pounds = sc.nextDouble();
        double kg = pounds/0.45359237;
        double bmi = kg/Math.sqrt(meters);
        System.out.println("Your BMI is = " + bmi);
        System.out.println();

//Opgave 2.17
        System.out.println("Opgave 2.17");
        System.out.println("Enter the temp in fahrenheit between -58'f and 41'f");
        double t = sc.nextDouble();
        System.out.println("Enter wind speed above 2mph");
        double v = sc.nextDouble();
        double windchill = 35.74 + 0.6215*t - 35.75*Math.pow(v, 0.16)+0.4275*t*v*Math.pow(v,0.16);
        System.out.println(windchill);
        //Kan ikke få den til at virke, men alt er rigtigt skrevet
//Opgave 2.19
        System.out.println();
        System.out.println("Opgave 2.19");
        System.out.println("Enter three points (x1, y1) (x2, y2) and (x3, y3)");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        double area1 = (x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))/2.0;
//????
        System.out.print("The area of the triangle is  " + area);
        System.out.println();
//Opgave 2.20
        System.out.println("Opgave 2.20");
        System.out.println("Enter Balance and Annual interest whole number ( eg 3 = 3%)");
        double balance = sc.nextDouble();
        double interest = sc.nextDouble();
        double payoff = balance * (interest/1200.);
        System.out.println(payoff);
        System.out.println();
//Opgave 2.21
        System.out.println("Opgave 2.21");
        System.out.println("Enter amount, interest rate in percentages, number of years after interests");
        double amount = sc.nextDouble();
        double mRate = sc.nextDouble()/1200;
        double nrYears= sc.nextDouble();
        double accumulated = amount * Math.pow((1+ mRate), nrYears*12);
        System.out.println("Accumulated value is " + accumulated);
//Opgave 2.23
        System.out.println();
        System.out.println("Opgave 2.23");
        System.out.println("Enter distance in miles");
        double distance = sc.nextDouble();
        System.out.println("Enter miles per gallon");
        double mpg = sc.nextDouble();
        System.out.println("Enter price per gallon");
        double ppg = sc.nextDouble();
        double cost = (distance/mpg)*ppg;
        System.out.println("The price for driving " + distance + " miles is " + cost + "$");
    }
    }
