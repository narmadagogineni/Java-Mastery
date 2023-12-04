//nextint()

import java.util.*;

public class JavaMastery {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of two numbers is " + sum);
    }
}

===========================================================================================
  //nextFloat()

import java.util.*;

public class JavaMastery {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float a = sc.nextFloat();
        System.out.print("Enter second number: ");
        float b = sc.nextFloat();
        float sum = a + b;
        System.out.println("The sum of two numbers is " + sum);
    }
}
============================================================================================================
  //To check if the given input is int or not using bool

import java.util.*;

public class JavaMastery {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number");
        boolean b = sc.hasNextInt();
        System.out.println(b);
    }
}
=========================================================================================================
    //operators in java

public class JavaMastery {

    public static void main(String[] args) {
        int a = 5;
        int b = a + 7;           
        System.out.println(b);    
    }
}

=================================================================================================
//Boolean operator

public class JavaMastery {

    public static void main(String[] args) {           
        System.out.println(6 == 8);     
    }
}

==================================================================================================
            //Chapter Strings
    
public class JavaMastery {

    public static void main(String[] args) {          
        
        String name = new String("Narmada");
        System.out.println(name);
        // or
        String place = "Bengaluru";
        System.out.println(place);

        
    }
}
==============================================================================================================
//print, println, printf, format

public class JavaMastery {

    public static void main(String args[]) {

        int a = 5;
        float b = 7.939f;
        
        // print - prints the value of an object without going to next line
        System.out.print("The value of a and b is: ");
        System.out.print(a + b);

        // println - prints the value and goes to next line
        System.out.println();
        System.out.println("The value of a and b is " + (a + b));

        // printf - prints formatted output according to the given format string
        System.out.printf("The value of a is %d and b is %f", a, b);

        // format - returns a formatted string using the specified format string
        System.out.format("The value of a is %d and b is %f", a , b);
    }

    //note: printf n format are similar
  
==========================================================================================================================
public class JavaMastery {

    public static void main(String args[]) {
        int a = 5;
        float b = 7.939f;

        //gives 3 spaces for %d i.e 5
        System.out.format("The value of a is %3d and b is %f", a , b);

        //gives 8 spaces and removed extra digits keeping only 2 digits after decimal point
        System.out.println();
        System.out.format("The value of a is %d and b is %8.2f", a , b);
    }
}
  //note 
// Q : 
    // What is %03d in Java?
    
// A:  
//     You just need to add "%03d" to add 3 leading zeros in an Integer.
//     Formatting instruction to String starts with "%" and 0 is the character which is used in padding.
//     By default left padding is used, 3 is the size and d is used to print integers.
===================================================================================================================

    //if else ladder

import java.util.Scanner;

public class JavaMastery {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int age;
        System.out.println("Enter your age: ");
        age = sc.nextInt();

        if(age > 56) {
            System.out.println("Experienced");
        }
        else if(age > 46) {
            System.out.println("Semi-Experienced");
        }
        else if(age > 36) {
            System.out.println("little Experienced");
        }
        else if(age > 26) {
            System.out.println("Not very Experienced");
        } 
        else{
            System.out.println("Fresher");
        }
    }

}
===================================================================================================================

    //switch statements

import java.text.BreakIterator;
import java.util.Scanner;

public class JavaMastery {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int age;
        System.out.println("Enter your age: ");
        age = sc.nextInt();

        switch (age) {
            case 18:
                System.out.println("Your are going to be an adult");
                break;
            case 22:
                System.out.println("Got a job");
                break;
            case 24:
                System.out.println("Got a hike");
                break;
            case 26:
                System.out.println("Got a promotion");
                break;
            default:
                System.out.println("Enjoying the life");
                break;
        }
    }
}
===================================================================================================================

    //
    
===================================================================================================================
===================================================================================================================
===================================================================================================================
===================================================================================================================
===================================================================================================================
===================================================================================================================
===================================================================================================================
