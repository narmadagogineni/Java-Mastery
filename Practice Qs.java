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
============================================================================================
