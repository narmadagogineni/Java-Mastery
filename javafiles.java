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

----------------------------------------------------------------------------
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

----------------------------------------------------------------
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
-------------------------------------------------------------------------------
    //SUM OF TWO NUMBERS
public class javabasics {
    public static void main(String args[]) {
        int a = 10;
        int b = 5;
        int sum = a + b;
        System.out.print(sum);
    }
}

------------------------------------------------------------
//Next()
    
import java.util.*;

public class javabasics{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(input);
    }
}
................................................
//Nextline()

import java.util.*;

public class javabasics{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextline();
        System.out.println(input);
    }
} 
----------------------------------------------
    
