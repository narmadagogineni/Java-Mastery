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

  
