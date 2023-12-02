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
