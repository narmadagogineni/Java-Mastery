//star pattern

import java.util.*;

public class patterns {
    public static void main(String args[]) {
        //vertical
        for(int i=1; i<=4; i++) {
            for(int j=1; j<=i; j++) {   //horizontal
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}   //i = line, j = star
-------------------------------------------------------------------------

//Inverted star pattern

  * logic n-i+1 *
 ===================
    
import java.util.*;

public class patterns {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give value for n");

        int n = sc.nextInt();
        //vertical
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i+1; j++) {   //horizontal
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
// i = line, j = star
---------------------------------------------------------------------------
    // Half- Pyramid pattern

import java.util.*;

public class patterns {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give value for n");

        // i = line, j = number 1234
        int n = sc.nextInt();
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        
    }
}
-------------------------------------------------------------------------------------

//CHARACTERS PATTERN 

import java.util.*;

public class patterns {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give value for n");

        // i = line, j = how many aplpabets, ch = "ABCD"
        int n = sc.nextInt();
        char ch = 'A';
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        
    }
}
================================================================================


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

============================================================================================

import java.util.*;

public class functions {
                //matrix application
    public static void hallowRectangle(int totRows, int totCols) {
        //outer loop - rows - i - horizontal
        for(int i=1; i<=totRows; i++) {
            //inner loop - columns - j - vertical
            for(int j=1; j<=totCols; j++) {
                // cell - (i, j)
                if(i == 1 || i == totRows || j == 1 || j == totCols) {
                    //boundary cells
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String args[]) {
        hallowRectangle(4, 5);
    }
}











