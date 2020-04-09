package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter the legnth of your line: ");
        Scanner keyboard = new Scanner(System.in);

        double lineLength = keyboard.nextDouble();
        double[] a = {4.9, 3.7, 3.1, 2.5, 1.9, 3.0};

        System.out.println(findMin(a));
        double minCutLength = findMin(a);


        int maxNumberOfCuts = (int) (lineLength / minCutLength);
        System.out.format("%d", maxNumberOfCuts);


    }

    public static double findMin(double[] a) {
        Arrays.sort(a);
        double minCutLength = (a[0]);
        return minCutLength;
    }

}


