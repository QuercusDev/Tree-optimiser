package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
	System.out.println("Please enter the large end diamter of the tree (m):");
        double treeButt = keyboard.nextDouble();
	System.out.println("Please enter the length of the tree (m):");
        double treeLength = keyboard.nextDouble();



        double treeVol = Math.PI * (treeButt/2) * (treeButt/2) * treeLength / 3;
        System.out.println("Tree volume is: " + treeVol + " m3");
        double taper = treeButt/treeLength;
        System.out.format("The taper is: %.2f cm's", taper);
        System.out.format("\nFor every 1 meter of length the diameter decreases by: %.2f cm's",taper);
        double nonMerchantableLength = 7/taper;
        double MerchantableLength = treeLength - nonMerchantableLength;

        double [] [] cuttingStrategy1 = {{5.4, 400, 3.7, 300, 2.5, 200, 1.9, 100, 3.0, 10}};
        double [] [] cuttingStrategy2 = {{4.9, 400, 3.7, 300, 3.1, 200, 1.9, 100, 3.0, 10}};
        double [] [] cuttingStrategy3 = {{4.3, 400, 3.1, 300, 2.5, 200, 1.6, 100, 3.0, 10}};



    }

    public static double taper() {



        return 0;
    }




    }


