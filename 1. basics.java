//HELLO WORLD - FIRST PROGRAM

public class javabasics {
    public static void main(String args[]) {
        System.out.println("Hello World!");

        int a = 10;
        int b = 5;
        System.out.println(a);
        System.out.println(b);
        String name = "Narmada Gogineni";
        System.out.println(name);

        a = 50;
        System.out.println(a);
        a = b;
        System.out.println(a);
    }
}

======================================================================================
//DATA TYPES
    
public class javabasics{
    public static void main(String args[]) {
        byte b = 8;
        System.out.println(b);
        char ch = 'a';
        System.out.println(ch);
        boolean var = true;
        System.out.println(var);
        float price = 10.5;
        System.out.println(price);
        int number = 25;
        //long - larger integers
        //double - larger floating numbers
        //short - shorter num 
        short n = 234;

    }
}

======================================================================================
    1 byte = 8 bits
    1 bit = [0, 1] 
    
    byte = 1 byte [-128 to 128] total range 256
    short = 2 byte 
    char = 2 byte ['a' to 'z', 'A' to 'Z', '@', '/' etc all symbols]
    boolean 1 byte [true, false]
    int 4 bytes [-2 billion to 2 billion]
    long 8 bytes [-9 billion - 9B]
    float 4 bytes [7 dec points]
    double 8 bytes [more than 7 dec points]
======================================================================================
//SUM OF TWO NUMBERS
    
public class javabasics {
    public static void main(String args[]) {
        int a = 10;
        int b = 5;
        int sum = a + b;
        System.out.print(sum);
    }
}

======================================================================================
//next()
    
import java.util.*;

public class javabasics{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(input);
    }
}
======================================================================================
//nextline()

import java.util.*;

public class javabasics{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextline();
        System.out.println(input);
    }
} 
======================================================================================
//nextInt()
    
import java.util.*;

public class javabasics{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(input);
    }
}
======================================================================================
//nextFloat()

import java.util.*;

public class javabasics{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextFloat();
        System.out.println(input);
    }
}
======================================================================================
    nextDouble()
    nextBoolean()
    nextShort()
    nextLong()
======================================================================================
//Sum of two number using input function 
    
import java.util.*;

public class javabasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }
}
======================================================================================
//Product of two numbers

import java.util.*;

public class javabasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = a * b;
        System.out.println(product);
    }
}   
======================================================================================
// Area of a circle

import java.util.*;

public class javabasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float rad = sc.nextFloat();
        float area = 3.14f * rad * rad;
        System.out.println(area);

    }
} 
//note : 3.14f - here f is written bcz java takes decimals as a double, to make it
// float we give f here
======================================================================================
    //Possibiltiy of type conversion
    
byte -> short -> int -> float -> long -> double
 reverse is not possible due to compatibility issue

======================================================================================
    //TYPE CONVERSION = WIDENING CONVERSION
//converting int to float to prevent data loss

public class JavaMastery {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        float c = (float) a/b;
        System.out.println(c);
    }
}
===================================================================================
    
import java.util.*;

public class javabasics {
    public static void main(String args[]) {
        int a = 25;
        long b = a;
        System.out.println(b);
    }
}            //possible
-------------------------------------------------------
  import java.util.*;

public class javabasics {
    public static void main(String args[]) {
        long a = 25;
        int b = a;
        System.out.println(b);
    }
}    //reverse is not possible

======================================================================================
    //lossy conversion not possible
    
import java.util.*;

public class javabasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextFloat();
        System.out.println(number);
    }      //we cant assign float in int but reverse is possible
}
------------------------------------------
import java.util.*;

public class javabasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float number = sc.nextInt();
        System.out.println(number);
    }
}      //revserse from int to float assignment is possible

======================================================================================
    //TYPE CASTING = NARROWING CONVERSION = explicit conversion

    //convertinig float into int

import java.util.*;

public class javabasics {
    public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
        float number = 99.9f;
        int newNum = (int) number;
        System.out.println(newNum);
    }
   
}
-----------------------------------------------------------------
    //converting char into int

import java.util.*;

public class javabasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char ch = 'a';
        char ch2 = 'b';
        int number = ch;
        int number2 = ch2;
        System.out.println(number);
        System.out.println(number2);
    }
}
=============================================================================================    
//TYPE PROMOTION

import java.util.*;

public class javabasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char a = 'a';
        char b = 'b';
        System.out.println((int) a);    //TYPE CONVERSION
        System.out.println((int) b);   //type conversion
        System.out.println(a);   //prints a bcz no conversion done
        System.out.println(b-a);
    }
}
----------------------------------------------------------------------    
    //It take a, b as int , and throws error c is char
    
import java.util.*;

public class javabasics {
    public static void main(String args[]) {
        char a = 'a';
        char b = 'b';
        char c = a - b;      
    }
}   
-------------------------------------------------------------------
    // int to byte convs not possible

import java.util.*;

public class javabasics {
    public static void main(String args[]) {
        short a = 5;
        byte b = 25;
        char c = 'c';
        byte bt = a + b + c ;
    }          //converts all types into int automatically
}
-----------------------------------------------------------------------------------
// Type converion to byte from int , and type promotion from all to int

import java.util.*;

public class javabasics {
    public static void main(String args[]) {
        short a = 5;
        byte b = 25;
        char c = 'c';
        byte bt = (byte) (a + b + c) ;
        System.out.println(bt);
    }          //converts all types into int automatically
}                 //prints -127
====================================================================================================================
    //TYPE PROMOTION FROM INT, FLOAT, LONG, DOUBLE

import java.util.*;

public class javabasics {

    public static void main(String[] args) {
        int a = 10;
        float b = 20.25f;
        long c = 25;
        double d = 30;
        double ans = a + b + c + d;
        System.out.println(ans);
    }
}

-------------------------------------------------------------------
// automatically taken INT to Byte conversion
    
import java.util.*;

public class javabasics {

    public static void main(String[] args) {
        byte b = 5;
        b = (byte) (b * 2);
        System.out.println(b);
    }
}
======================================================================================
jdk - java development kit
jre - java run-time environment
jvm - java virtual machine
jvm + libraries = jre
jre + development tools = jdk
==============================================================================================
Source Code.java -> Compiler -> Byte Code.class -> Java Virtual Machine -> Native Code
 -----------------------------------------        -------------------------------
    
           Compilation                                      Execution
        
=========================================================================================================
 //OPERATORS   
arithematic operator -, +, *, /, %
----------------------------------------
    
import java.util.*;

public class javabasics {

    public static void main(String args[]) {
        int a = 10;
        int b = 5;
        System.out.println("Add=" + (a+b));
        System.out.println("Sub=" + (a-b));
        System.out.println("Mul=" + (a*b));
        System.out.println("Div=" + (a/b));
        System.out.println("Mod=" + (a%b));
    }
}
==========================================================================================================
    //PRE INCREMENT
unary operator  ++, --
------------------------------------
    
//NOTE : in PRE both values remain same after updating, in POST both are different after updating
    
import java.util.*;

public class javabasics {

    public static void main(String args[]) {
        int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);
    }
}

------------------------------------------------------
    //POST INCREMENT

import java.util.*;

public class javabasics {

    public static void main(String args[]) {
        int a = 10;
        int b = a++;
        System.out.println(a);
        System.out.println(b);
    }
}

--------------------------------------------------------
    //PRE DECRIMENT

import java.util.*;

public class javabasics {

    public static void main(String args[]) {
        int a = 10;
        int b = --a;
        System.out.println(a);
        System.out.println(b);
    }
}
--------------------------------------------------------
    //POST DECREMENT

import java.util.*;

public class javabasics {

    public static void main(String args[]) {
        int a = 10;
        int b = a--;
        System.out.println(a);
        System.out.println(b);
    }
}
============================================================
//Realational operator
==, !=, <, >, <=, >=
--------------------------------    
import java.util.*;

public class javabasics {

    public static void main(String args[]) {
        int a = 10;
        int b = 5;
        System.out.println(a==b);
    
    }
}
====================================================================
//Logical operators

logical AND - &&
logical OR - ||
logical NOT - !
--------------------------------------------------
//LOGICAL AND &&

import java.util.*;

public class javabasics {

    public static void main(String args[]) {
        System.out.println((3>2) && (11>2));
        System.out.println((3<2) && (11>2));
        System.out.println((3>2) && (11<2));
        System.out.println((3<2) && (11<2));
    }
}
 --------------------------------------------------
     //LOGICAL OR ||

import java.util.*;

public class javabasics {

    public static void main(String args[]) {
        System.out.println((3>2) || (11>2));
        System.out.println((3<2) || (11>2));
        System.out.println((3>2) || (11<2));
        System.out.println((3<2) || (11<2));
    }
}
----------------------------------------------------------
    //LOGICAL NOT !

import java.util.*;

public class javabasics {

    public static void main(String args[]) {
        System.out.println(!(3>2));
        System.out.println(!(3<2));
    }
}
=============================================================================
//Assignment operator
+= operator
    
import java.util.*;

public class javabasics {

    public static void main(String args[]) {
        int a = 10;
        // a = a + 5;
        a += 5;
        System.out.println(a);
    }
}

--------------------------------------------------
    //Assignment operator
-= operator
    
import java.util.*;

public class javabasics {

    public static void main(String args[]) {
        int a = 10;
        // a = a - 5;
        a -= 5;
        System.out.println(a);
    }
}
-----------------------------------------------------------

//Assignment operator
*= operator
    
import java.util.*;

public class javabasics {

    public static void main(String args[]) {
        int a = 10;
        // a = a * 5;
        a *= 5;
        System.out.println(a);
    }
}
----------------------------------------------------------
//Assignment operator
/= operator
    
import java.util.*;

public class javabasics {

    public static void main(String args[]) {
        int a = 10;
        // a = a / 5;
        a /= 5;
        System.out.println(a);
    }
}
------------------------------------------------------
    //Assignment operator
%= operator
    
import java.util.*;

public class javabasics {

    public static void main(String args[]) {
        int a = 10;
        // a = a % 5;
        a %= 5;
        System.out.println(a);
    }
}

=====================================================================
//if - else block
    
import java.util.*;

public class javabasics {

    public static void main(String args[]) {
       int a = 20;
       int b = 8;
       if(a>=b) {
            System.err.println("a is greater");
       } else {
        System.out.println("b is greater");
       }
    }
}
-----------------------------------------------------
import java.util.*;

public class javabasics {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number%2 == 0) {
            System.err.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
--------------------------------------------------------
import java.util.*;

public class javabasics {
    public static void main(String args[]) {
        int age = 15;

        if(age >= 18) {
            System.out.println("Adult");
        } else if(age > 13 && age < 18) {
            System.out.println("Teenager");
        } else {
            System.out.println("Child");
        }
    }
    
}
----------------------------------------------------------
  //TAX CALCULATOR
    
import java.util.*;

public class javabasics {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;

        if(income < 500000) {
            tax = 0;
        }
        else if(income >= 500000 && income < 1000000) {
            tax = (int) (income * 0.2);
        } else {
            tax = (int) (income * 0.3);
        }
        System.out.println("Your tax is " + tax);
    }
}
----------------------------------------------------------------------------   
//GREATEST OF 3 NUMBERS
    
import java.util.*;

public class javabasics {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if((a >= b) && (a >= c)) {
            System.out.println("a is greater " + a);
        } else if (b >= c) {
            System.out.println("b is greater " + b);
        } else {
            System.out.println("c is greater " + c);
        }
    }
}
=============================================================================================
    //TERNARY OPERATORS

    //larger number

import java.util.*;

public class javabasics {

    public static void main(String args[]) {

        int largerNum = (10 > 6) ? 10 : 6;
        System.out.println(largerNum); 
        }
}
-------------------------------------------------------------------
    //even or odd
    
import java.util.*;

public class javabasics {

    public static void main(String args[]) {
        int Number = 16;

        String type = (Number % 2 == 0) ? ("even") : ("odd");
        System.out.println(type);
        }
}
-------------------------------------------------------------------
    //pass or fail

import java.util.*;

public class javabasics {

    public static void main(String args[]) {
        int marks = 98;

        String result = (marks >= 33) ? ("Pass") : ("Fail");
        System.out.println(result);
        }
}
===================================================================================
    //SWITCH STATEMENT

    import java.util.*;

public class javabasics {

    public static void main(String args[]) {
        int OrderNo = 4;

        switch (OrderNo) {
            case 1: 
                System.out.println("Samosa");
                break;
            case 2:
                System.out.println("Momos");
                break;
            case 3:
                System.out.println("Rolls");
                break;
            case 4:
                System.out.println("Maggi");     
            default:
                break;
        }
    }
}
------------------------------------------------------------------------------
//Calculator using Switch

import java.util.*;

public class javabasics {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for a");
        int a = sc.nextInt();
        System.out.println("Enter value for b");
        int b = sc.nextInt();
        System.out.println("Enter any operator");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+' :
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '%':
                System.out.println(a%b);
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }  
    }
}
========================================================================================
    



