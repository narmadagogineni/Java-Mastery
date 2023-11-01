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












