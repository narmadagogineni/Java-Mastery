//LOOPS

//WHILE LOOP

import java.util.*;

public class javabasics {

    public static void main(String[] args) {
        int counter = 0;

        while (counter < 10) {
            System.out.println("Hello world!");
            counter++;
        }
    }
}
-----------------------------------------------------------------
  //infinite while loop

import java.util.*;

public class javabasics {

    public static void main(String[] args) {

        while (true) {
            System.out.println("Good Morning!");
            counter++;
        }
    }
}
-----------------------------------------------------------------
//to print 1 - 10
  
import java.util.*;

public class javabasics {

    public static void main(String[] args) {
        int counter = 1;

        while (counter <= 10) {
            System.out.println(counter);
            counter++;
        }
    }
}
-------------------------------------------------------------------
  //to print 1-10 in same line
import java.util.*;

public class javabasics {

    public static void main(String[] args) {
        int counter = 1;

        while (counter <= 10) {
            System.out.print(counter+" ");
            counter++;
        }
    }
}
--------------------------------------------------------------
  //Print numbers in given range

import java.util.*;

public class javabasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range");
        int range = sc.nextInt();
        int counter = 1;
        

        while (counter <= range) {
            System.out.print(counter+" ");
            counter++;
        }
    }
}
--------------------------------------------------------
//STAR PATTERN

import java.util.*;

public class javabasics {

    public static void main(String[] args) {
        
        int i = 1;
        while(i<=4) {
            System.out.println("* * * *");
            i++;
        }
    }
}
-----------------------------------------------------------
//SUM OF NUMBERS IN GIVEN RANGE
    
import java.util.*;

public class javabasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value for n");
        int n = sc.nextInt();       
        int sum = 0;

        int i = 1; 
        while(i <= n) {
            sum += i;
            i++;            
        }
        System.out.println("Sum is : " + sum); 
    }
}
--------------------------------------------------------------
    //reveser the given num in while loop
    
import java.util.*;

public class javabasics {

    public static void main(String[] args) {
        int n = 9102001;

        while(n > 0) {
            int lastDig = n % 10;
            System.out.print(lastDig);
            n /= 10;
        }
        System.out.println();
    }
}

-------------------------------------------------------
// Method 2 : Reverse the num 

import java.util.*;

public class javabasics {

    public static void main(String[] args) {
        int num = 9102001;
        int rev = 0;

        while(num>0) {
            int lastDigit = num%10;
            rev = (rev*10) + lastDigit;
            num /= 10;
        }
        System.out.println(rev);
    }
}
====================================================================================
    //FOR LOOP

import java.util.*;

public class javabasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for(int i=1; i<=n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
-----------------------------------------------------------
// HELLO WORLD 5 TIMES USING FOR LOOP
    
import java.util.*;

public class javabasics {

    public static void main(String args[]) {
        
        for(int i=1; i<=5; i++) {
            System.out.println("Hello World!");
        }
        
    }
}
-------------------------------------------------------
//STAR PATTERN USING FOR LOOP
    
import java.util.*;

public class javabasics {

    public static void main(String[] args) {
        
        for(int i=1; i<=4; i++) {
            System.out.println("* * * *");
        }
    }
}
-----------------------------------------------------------------------
    //REVERSE THE GIVEN NUMBERS

    //to get remainder num%10 - ex 24%10 = remainder 4
    // ro remove last digit num/10 - ex 24/10 = 4 remainder and 2 is the remainding digit

import java.util.*;

public class javabasics {

    public static void main(String[] args) {
        int n = 16300;

        for(;n>0; n/=10) {
            int lastDig = n%10;
            System.out.print(lastDig);
        }
        System.out.println();
        }
    }
----------------------------------------------------------------------------------------------
//REVERSE THE GIVEN NUMBER USING FOR LOOP
    
import java.util.*;

public class javabasics {

    public static void main(String[] args) {
        int num = 9102001;
        int rev = 0;

        for(;num>0; num /= 10) {
            int lastDigit = num%10;
            rev = (rev*10) + lastDigit;
        }
        System.out.println(rev);
    }
}

---------------------------------------------------------------------
//DO-WHILE LOOP

import java.util.*;

public class javabasics {

    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("Hello world!");
            i++;
        } while (i<=5);
    }
}
==============================================================================================
    //BREAK STATEMENT

import java.util.*;

public class javabasics {

    public static void main(String[] args) {
        for(int i=1; i<=10; i++) {
            if(i == 5) {
               break;
            }
             System.out.println(i);
        }
        System.out.println("Im out of the loop!");
    }  
}
--------------------------------------------------------
    //Break the loop on entering a num divisble by 10

import java.util.*;

public class javabasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Enter a number n: ");
            int n = sc.nextInt();
            if(n % 10 == 0) {
                break;
            }
            System.out.println(n);
        } while(true);
    }  
}
===========================================================================================
//continue statement

    //print 1 - 10 skip 5

import java.util.*;

public class javabasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i=1; i<=10; i++) {
            if(i == 5) {
                System.out.println("I have skipped 5");
                continue;       
            }
            System.out.println(i);
        }
    }  
}
--------------------------------------------------------------
// print all number n skip the num divisible by 10

import java.util.*;

public class javabasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Enter a num: ");
            int n = sc.nextInt();
            if(n%10 == 0) {
                System.out.println("Number is divisible by 10");
                continue;
            }
            System.out.println("You entered: " +n);
        } while(true);
 
    }  
}
--------------------------------------------------------------------------
//PRIME OR NOT
    
import java.util.*;

public class javabasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n==2) {
            System.out.println("n is a prime");
        } else {
            boolean isPrime = true;
            for(int i=2; i<=n-1; i++) {
                if(n%i == 0) {
                    isPrime = false;
                }
            }

            if(isPrime == true) {
                System.out.println("n is a prime number");
            } else {
                System.out.println("n is not a prime number");
                }
            }
    }
} 
----------------------------------------------------------------------------
//OPTIMISED CODE FOR PRIME OR NOT 
    // USING MATH MODULE

import java.util.*;

public class javabasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n==2) {
            System.out.println("n is a prime");
        } else {
            boolean isPrime = true;
            for(int i=2; i<=Math.sqrt(n); i++) {      //math module exists in utility packg
                if(n%i == 0) {
                    isPrime = false;
                }
            }

            if(isPrime == true) {
                System.out.println("n is a prime number");
            } else {
                System.out.println("n is not a prime number");
            }
            }
    }
} 
--------------------------------------------------------------------------------

    
