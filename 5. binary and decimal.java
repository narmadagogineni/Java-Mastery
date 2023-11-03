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
