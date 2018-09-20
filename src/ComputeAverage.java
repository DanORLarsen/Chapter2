import java.util.Scanner;

public class ComputeAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input 3 numbers to find the average of those numbers");
        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();
        double number3 = sc.nextDouble();

        double average = (number1 + number2 + number3)/3;
        System.out.println(average);


    }}