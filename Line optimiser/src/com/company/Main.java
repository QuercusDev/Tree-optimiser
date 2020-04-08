package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	System.out.println("Please enter the legnth of your line: ");
	Scanner lineLength = new Scanner(System.in);

        /*
        double a = 4.9;
        double b = 3.7;
        double c = 2.5;
        double d = 1.9;
        double e = 3.0;
         */

        int [] numberOfCuts = {4,3,2,1,3};
        int smallestModulo=0;
        int newCombo=0;

        for (int i = 0; smallestModulo % numberOfCuts[i]; i++) {
            if (smallestModulo > newCombo) {
                smallestModulo = newCombo;
            }
        }




        }
        }


