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

    //if else
    
public class JavaMastery {

    public static void main(String args[]) {

        int a = 10;
        if(a == 11) {
            System.out.println("I am 11");
        }
        else {
            System.out.println("I'm not 11");
        }
    }
}

==================================================================================================

    // pass or fail

import java.util.Scanner;

public class JavaMastery {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sub 1 marks");
        int marks1 = sc.nextInt();
        System.out.println("Enter sub 2 marks");
        int marks2 = sc.nextInt();
        System.out.println("Enter sub 3 marks");
        int marks3 = sc.nextInt();
        float avg = (marks1 + marks2 + marks3) / 3.0f;
        System.out.println("Your overall percentage is " + avg + "%");

        if((marks1 >= 33) && (marks2 >= 33) && (marks3 >= 33) && (avg >= 40)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}


==================================================================================================

    //tax on salary

import java.util.Scanner;

public class JavaMastery {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float salary;
        System.out.print("Enter your salary: ");
        salary = sc.nextFloat();
        
        if(salary < 250000) {
            System.out.println("No tax to be paid");
        }
        else if(salary >= 250000 && salary < 500000) {
            System.out.println("Tax is 5%");
        }
        else if(salary > 500000 && salary < 1000000) {
            System.out.println("tax is 10%");
        }
        else if(salary > 1000000) {
            System.out.println("Tax is 15%");
        }
    }
}

==================================================================================================

//days using switch
    
public class JavaMastery {

    public static void main(String args[]) {

        int day = 1;
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
        
            default:
            System.out.println("No such day exists");
                break;
        }
    }
}

==================================================================================================

    //leap year or not

import java.util.Scanner;

public class JavaMastery {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any year: ");
        int year = sc.nextInt();

        if((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0)) ) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }
    }
}
==================================================================================================

// find type of website using url

//.in - indian website
// .org - organizational website
//.com - commercial website

import java.util.Scanner;

public class JavaMastery {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an url: ");
        String url = sc.next();

        if(url.endsWith(".org")) {
            System.out.println("THis is an oragnizational website");
        }    
        else if(url.endsWith(".com")) {
            System.out.println("This is an commercial website");
        } 
        else if(url.endsWith(".in")) {
            System.out.println("This is an indian website");
        }
        else {
            System.out.println("Not a valid url");
        }
    }
}
==================================================================================================

    //even or odd

// odd numbers

import java.util.Scanner;

public class JavaMastery {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if(num%2==0) {
            System.out.println("Even number");
        } 
        else{
            System.out.println("Odd number");
        }
    }
}
==================================================================================================
    
//print even no.s

public class JavaMastery {

    public static void main(String[] args) {
        for(int i=1; i<=25; i++) {
            if(i%2 == 0) {
                System.out.println(i);
            }
        }
    }
}
==================================================================================================

    //odd numbers

public class JavaMastery {

    public static void main(String[] args) {
        for(int i=1; i<=25; i++) {
            if(i%2 != 0) {
                System.out.println(i);
            }
        }
    }
}
==================================================================================================
==================================================================================================
==================================================================================================
==================================================================================================
==================================================================================================
==================================================================================================
    
