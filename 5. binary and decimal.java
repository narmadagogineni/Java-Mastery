//binary to decimal

import java.util.*;

public class functions {

    public static void binToDec(int binNum) {
        int myNum = binNum;
        int power = 0;
        int decNum = 0;

        while (binNum > 0) {
            int lastDig = binNum % 10;
            decNum = decNum + (lastDig * (int) Math.pow(2, power));
            
            power++;
            binNum = binNum / 10;
        }
        System.out.println("decimal of "+ myNum + " is " + decNum);
    }

    public static void main(String args[]) {
        binToDec(1000);
    }
}

================================================================================================

//DECIMAL TO BINARY

import java.util.*;

public class functions {

    public static void decToBin(int decNum) {
        int myNum = decNum;
        int power = 0;
        int binNum = 0;

        while (decNum > 0) {
            int rem = decNum % 2;
            binNum = binNum + (rem * (int) Math.pow(10, power));
            
            power++;
            decNum = decNum / 2;
        }
        System.out.println("binary of "+ myNum + " is " + binNum);
    }

    public static void main(String args[]) {
        decToBin(11);
    }
}
