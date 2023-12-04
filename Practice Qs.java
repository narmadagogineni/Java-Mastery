//cal percentage using 5 marks

import java.time.Period;
import java.util.*;

public class JavaMastery {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks1: ");
        int marks1 = sc.nextInt();
        System.out.print("Enter marks2: ");
        int marks2 = sc.nextInt();
        System.out.print("Enter marks3: ");
        int marks3 = sc.nextInt();
        System.out.print("Enter marks4 ");
        int marks4 = sc.nextInt();
        System.out.print("Enter marks5 ");
        int marks5 = sc.nextInt();

        int percentage = (marks1 + marks2 + marks3 + marks4 + marks5) / 5;
        System.out.println(percentage + "%");
    }
}

======================================================================================================
    
// sum of 3 num
  
import java.util.*;

public class JavaMastery {

    public static void main(String args[]) {
        int n1 = 5;
        int n2 = 10;
        int n3 = 15;
        int sum = n1 + n2 + n3;
        System.out.println("The sum of 3 num is " + sum);
    }
}
============================================================================================

  // //marks to cgpa

import java.util.*;

public class JavaMastery {

    public static void main(String args[]) {
        float a = 97;
        float b = 77;
        float c = 82;
        float percentage = (a + b + c) / 3;
        float cgpa = percentage / 10;
        System.out.println(cgpa);
    }
}
============================================================================================
    
//Greet a name

import java.util.*;

public class JavaMastery {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println("Hello " + name + ", Have a Good day!");
    }
}
============================================================================================
    
//km to miles
  
import java.util.*;

public class JavaMastery {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter in kms ");
        int km = sc.nextInt();
        float miles = km * 0.62137f;
        System.out.println(miles);
    }
}
============================================================================================

//given num is int or not

import java.util.*;

public class JavaMastery {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        System.out.println(sc.hasNextInt());
    }
}
==================================================================================================

    //ESCAPE SEQUENCE CHARACTERS

public class JavaMastery {

    public static void main(String[] args) {
        
        System.out.println("Hi, my name is \"Narmada\" ");
        System.out.println("Hi, my name is 'Narmada' ");
        System.out.println("Hi, my name is \' only one quote ");
        System.out.println("Hey, I'm using escape sequence for slash \\ here");
        System.out.println("Hey, for tab \t here");
        System.out.println("Hey, for next tine \n here");
    }
}

==================================================================================================

    //Convert to lowercase()

    public class JavaMastery {

    public static void main(String args[]) {
        String name = "Narmada Gogineni";
        name = name.toLowerCase();
        System.out.println(name);
    }
}
==================================================================================================
    
    //replace 
    
public class JavaMastery {

    public static void main(String[] args) {
        
        String text = "narmada gogineni insta";
        // System.out.println(text);
        text = text.replace(" ", "_");
        System.out.println(text);

    }
}

==================================================================================================
    
    //letter format 
    
public class JavaMastery {

    public static void main(String[] args) {
        
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Narmada Gogineni");
        System.out.println(letter);
    }
}
==================================================================================================
    
//check if double and triple spaces exists in given string

public class JavaMastery {

    public static void main(String[] args) {
        String str = "Hello  World   This is Narmada Gogineni.";
        System.out.println(str.indexOf("   "));   //present at index 12
        System.out.println(str.indexOf("  "));
    }
}

//case 2----------------------------------------

public class JavaMastery {

    public static void main(String[] args) {
        String str = "Hello World  This is Narmada Gogineni.";
        System.out.println(str.indexOf("   "));   //triple space doesnt exists so prints -1
        System.out.println(str.indexOf("  "));
    }
}
==================================================================================================

//format a letter using escape sequence

public class JavaMastery {

    public static void main(String[] args) {
        String letter = "Hello, Miss Narmada Gogineni, \n\tHope you had a great day today. \nThanks!";
        System.out.println(letter);
    }
}
==================================================================================================

    
