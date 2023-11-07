
//Array syntax

import java.util.*;

public class Arrays {
    public static void main(String args[]) {
        int marks[] = new int[50];

        int numbers[] = {1, 2, 3, 4};

        String fruits[] = {"apple", "manngo", "banana", "orange"};
    }
}
=================================================================================
//INPUT TO AN ARRAY

import java.util.*;

public class Arrays {
    public static void main(String args[]) {
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Phy: " + marks[0]);
        System.out.println("Math: " + marks[1]);
        System.out.println("Chem: " + marks[2]);

        marks[2] = 100;
        System.out.println("Chem: " + marks[2]);

        marks[0] = marks[0] + 2;
        System.out.println("Updated Phy:" + marks[0]);

    }
}
=============================================================================

//AVGERAGE OF MARKS IN ARRAY

import java.util.*;

public class Arrays {
    public static void main(String args[]) {
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Phy: " + marks[0]);
        System.out.println("Math: " + marks[1]);
        System.out.println("Chem: " + marks[2]);

        int avgMarks = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Average of marks is "+ avgMarks);

    }
}
===========================================================================================

  //ARRAYS ARE PASSED BY REFERENCE AND (not passed by value remember: call by value & call by reference)

import java.util.*;

public class Arrays {

    public static void update(int marks[]) {
        //to update marks
        for(int i=0; i<marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String args[]) {
        int marks[] = {95, 97, 99};
        update(marks);

        //to print updated marks
        for(int i=0; i<marks.length; i++) {
            System.out.print(marks[i] + " ");
        }

        System.out.println();
    }
}
======================================================================================
  //LINEAR SERACH
    ex 1

public class JavaMastery {

    public static int linearSearch(int numbers[], int key) {

        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] == key) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
       int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
       int key = 190;

       int index = linearSearch(numbers, key);
       if(index == -1) {
        System.out.println("Not found");
       } else {
        System.out.println("Key is at the index: " + index);
       }
    }
}
=====================================================================
ex 2

    
