
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
//Get largest number in an array

import java.util.*;

public class JavaMastery {

    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // negative or -Infinity

        for(int i=0; i<numbers.length; i++) {
            if(largest < numbers[i]) {
                largest = numbers[i];
            }
        }

        return largest;
    }
    public static void main(String args[]) {
        int numbers[] = {2, 4, 19, 10, 9};
        int result = getLargest(numbers);
        System.out.println("The largest number in the array is " + result);
    }
}
====================================================================================================================
    //GET LARGEST AND SMALLEST NUMBER IN AN ARRAY

import java.util.*;

public class JavaMastery {

    public static int getLargestAndSmallest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // negative or -Infinity
        int smallest = Integer.MAX_VALUE; // positive or Infinity

        for(int i=0; i<numbers.length; i++) {
            if(largest < numbers[i]) {
                largest = numbers[i];
            }

            if(smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }

        System.out.println("Smallest number is " + smallest);
        return largest;
    }
    public static void main(String args[]) {
        int numbers[] = {2, 4, 19, 10, 9};
        int result = getLargestAndSmallest(numbers);
        System.out.println("The largest number in the array is " + result);
    }
}
=======================================================================================================================

//Binary Search
//pre-requisite - only performed on sorted arrays
    //USING WHILE LOOP
import java.util.*;

public class JavaMastery {
    //binary search
    public static int binarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2; 

            //comparison
            if(numbers[mid] == key) {     //found
                return mid;
            } else if(numbers[mid] < key) {  //towards right
                start = mid+1;
            } else {           //left
                end = mid-1;
            }
        }

        return -1;
    }
    
    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int key = 14;

        System.out.println("Index key is found at : " + binarySearch(numbers, key));
    }
}

==================================================================================================

//Binary Search - for loop
//pre-requisite - only performed on sorted arrays
    //FOR LOOP
    
import java.util.*;

public class JavaMastery {
    //binary search
    public static int binarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;

        for(int i=0; i<=numbers.length; i++) {
            int mid = (start + end) / 2; 

            //comparison
            if(numbers[mid] == key) {     //found
                return mid;
            } else if(numbers[mid] < key) {  //towards right
                start = mid+1;
            } else {           //left
                end = mid-1;
            }
        }

        return -1;
    }
    
    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int key = 34;

        System.out.println("Index key is found at : " + binarySearch(numbers, key));
    }
}
===================================================================================================================

//Reverse an Array
import java.util.*;

public class JavaMastery {

    public static void reverse(int numbers[]) {
        int first = 0, last = numbers.length - 1;
        
        while (first < last) {
            
            //swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;   // // left index moves forward or increase by 1
            last--;     // // right index decrease by 1 or moves towrds left
        }

    }

    public static void main(String args[]) {
        int numbers[] = {2, 3, 4, 5, 6, 9, 7};
        
        reverse(numbers);
        //to print 
        for(int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}

=================================================================================================================
//Number Pairs

import java.util.*;

public class Arrays {
    public static void numPairs(int numbers[]) {
        int totalPairs = 0;
        for(int i=0; i<numbers.length; i++) {
            int curr = numbers[i];  //2, 4, 6, 8,10, 12
            for(int j=i+1; j<numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ") ");
                totalPairs++;
            }

            System.out.println();
        }
        System.out.println("Total pairs: "+ totalPairs);

    }


    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10, 12};
        numPairs(numbers);

    }
}


    
