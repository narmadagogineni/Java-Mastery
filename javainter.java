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
STAR PATTERN

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






