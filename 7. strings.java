//STRINGS
STRING WITH next();

import java.util.*;

public class stringstut {
    
    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'c', 'd', 'e', 'f'};
        String str = "abcd";
        String str2 = new String("xyz");

        //strings are IMMUTABLE

        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.next();
        System.out.println(name);

    }
}
=================================================================================================
//String with nextLine()
  
import java.util.*;

public class stringstut {
    
    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'c', 'd', 'e', 'f'};
        String str = "abcd";
        String str2 = new String("xyz");

        //strings are IMMUTABLE

        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.println(name);

    }
}

===================================================================================================
//LENGTH OF A STRING

import java.util.*;

public class stringstut {
    
    public static void main(String[] args) {
        String fullName = "Narmada Gogineni";
        System.out.println(fullName.length());

    }
}
==========================================================================

    //CONCATENATION IN STRINGS

    import java.util.*;

public class stringstut {
    
    public static void main(String[] args) {
        String firstname = "Narmada";
        String lastName = "Gogineni";
        String fullName = firstname + " " + lastName;
        System.out.println(fullName);

    }
}
==========================================================================================

    //charAt in strings

import java.util.*;

public class stringstut {
    
    public static void main(String[] args) {
        String fullName = "Narmada Gogineni";
        System.out.println(fullName.charAt(0));
        System.out.println(fullName.charAt(5));
        System.out.println(fullName.charAt(15));

    }
}

===========================================================================================

    //To print each letter in a string

import java.util.*;

public class stringstut {

    public static void printLetters(String name) {
        for(int i=0; i<name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }

        System.out.println();
    }
    
    public static void main(String[] args) {
        String name = "Narmada Gogineni";
        printLetters(name);

    }
}
=====================================================================================
    



    
