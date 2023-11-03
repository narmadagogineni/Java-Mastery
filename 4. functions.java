//METHODS OR FUNCTIONS

// func to print hello world

import java.util.*;

public class functions {

    public static void printHello() {
        System.out.println("Hello world!");
    }

    public static void main(String args[]) {
        printHello();
    }
}

-------------------------------------------------------------------------------------
  //NOTE: by default functions shd return a value so we use return keyword or else it thorws an error
  //but void func doesnt return anything so we can skip return 

import java.util.*;

public class functions {

    public static void printHello() {
        System.out.println("Hello world!");
        return;
    }

    public static void main(String args[]) {
        printHello();
    }
}
-------------------------------------------------------------
  // assume it as an int func then return value shd be given in int form
  
import java.util.*;

public class functions {

    public static void printHello() {
        System.out.println("Hello world!");
        return 3;
    }

    public static void main(String args[]) {
        printHello();
    }
}
--------------------------------------------------------------------------------
//Sum of a and b with void type

import java.util.*;

public class functions {

    public static void printSum() {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;

        System.out.println("Sum of a and b is " + sum);
        return ;
    }

    public static void main(String args[]) {
        printSum();
    }
}
---------------------------------------------------------------
//sum of a and b with int type
  
import java.util.*;

public class functions {

    public static int printSum(int a, int b) {    //parameters = formal parameters
        int sum = a + b;
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = printSum(a, b);     //arguments = actual parameters
        System.out.println("Sum of a and b is " + sum);
    }
}
===========================================================================
Note:
  //call by value - copy of a original value of variable is used in java
//call by reference - original value of variable is used in cpp
==============================================================================
//swap two numbers
  
import java.util.*;

public class functions {

    public static void main(String args[]) {
        //swap - values
        int a = 2;
        int b = 3;

        //swap
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a is " + a);
        System.out.println("b is " + b);
    }
}
---------------------------------------------------------------------------
//call by value example
  //swap 
  
import java.util.*;

public class functions {

    public static void swap(int a, int b) {
        //swap
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a is " + a);         //copy
        System.out.println("b is " + b);
    }

    public static void main(String args[]) {
        int a = 2;
        int b = 3;
        swap(a, b);
        System.out.println("a is " + a);        //original values remains same
        System.out.println("b is " + b);
    }
}
--------------------------------------------------------------------------------------------
//product of a and b
    
import java.util.*;

public class functions {

    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = multiply(a, b);
        System.out.println("Product of a and b is " + result);
    }

}
-----------------------------------------------------------------------------------------
//Factorial of a number
    
import java.util.*;

public class functions {

    public static int factorial(int n) {
        int fact = 1;
        for(int i=1; i<=n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int result = factorial(6);
        System.out.println(result);
    }
}
---------------------------------------------------------------------------------
//Binomial coefficient

import java.util.*;

public class functions {

    public static int factorial(int n) {
        int fact = 1;
        for(int i=1; i<=n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int binCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binCoeff = fact_n/ (fact_r * fact_nmr);
        return binCoeff;
    }

    public static void main(String[] args) {
        System.out.println(binCoeff(5, 2));
    }
}
-------------------------------------------------------------------------------------------
//Method overloading
    // * using parameters
    
 import java.util.*;

public class functions {
    //sum of 2 num
    public static int sum(int a, int b) {
       return a + b;
    }
    //sum of 3 num
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(sum(5, 2));
        System.out.println(sum(5, 2, 1));
    }
}

------------------------------------------------------------------------------------------
//method overloading
    //*using datatypes

import java.util.*;

public class functions {
    //sum of 2 num
    public static int sum(int a, int b) {
       return a + b;
    }
    //sum of 3 num
    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(5, 2));
        System.out.println(sum(5.2f, 2.8f));
    }
}
------------------------------------------------------------------------
//PRIME NUMBERS IN GIVEN RANGE
    
import java.util.*;

public class functions {
   
    public static boolean isPrime(int n) {
        if(n == 2) {       //corner case
        return true;
        }

       for(int i=2; i<=n-1; i++) {
            if(n%i == 0) {
                return false;
            }
       }  
        return true;
    }

    public static void primesInRange(int n) {
        for(int i=2; i<=n; i++) {
            if(isPrime(i)) { //isPrime is true
                System.out.print(i+" ");
            }     
        }
        System.out.println();
    }

    public static void main(String[] args) {
        primesInRange(20);
    }
}


