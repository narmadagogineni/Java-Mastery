//LOOPS

//while loop

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






