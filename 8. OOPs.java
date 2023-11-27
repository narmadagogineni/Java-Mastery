// Object and classes

//ex Pen class and constructor

public class Oops {
    
    public static void main(String args[]) {
        Pen p1 = new Pen(); // constructor - created a new pen object called p1
        //to set new color
        p1.setColor("Blue");
        System.out.println(p1.color);
        //to set new tip size
        p1.setTip(5);
        System.out.println(5);
        //to update existing value color
        p1.color = "Red";
        System.out.println(p1.color);
    }
    
}

class Pen {
    //properties and functions
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int math) {
        percentage = ((phy + chem + math) / 3 ) * 100;
    }
}
=====================================================================================
// ex 2 Bank Account class

  // ACCESS MODIFIER - private

  public class Oops {
    
    public static void main(String args[]) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "narmadagogineni";
        // myAcc.password = "abcd";    //thrwos error - can't set since - access modifier is - private
    }
    
}

class BankAccount {
    public String username;
    private String password;
}
====================================================================================================

  // we can change password from private class using Function / method

  public class Oops {
    
    public static void main(String args[]) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "narmadagogineni";
        // myAcc.password = "abcd";    //can't set since - access modifier is - private
        myAcc.setPassword("abcd ");  //but we can change password using setPass func
    }
    
}

class BankAccount {
    public String username;
    private String password;
    public void setPassword(String pwd) {
        password = pwd;
        System.out.println(password);
    }
}

======================================================================================================

//GETTERS AND SETTERS
  
public class Oops {
    
    public static void main(String args[]) {
        
    }
    
}

class Pen {
    String color;
    int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}
=========================================================================================
  //THIS KEYWORD for same name

public class Oops {
    
    public static void main(String args[]) {
        
    }
    
}

class Pen {
    String color;
    int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
}
================================================================================================

    //CONSTRUCTOR
    
public class Oops {
    
    public static void main(String args[]) {
       Student s1 = new Student();     //defining constructor
    }
}

class Student{            
    String name;
    int rollno;

    Student() {       //calling constructor
        System.out.println("Hey Narmada, Constructor is being called..");
    }
}
==============================================================================================

    //CONSTRUCTOR WITH ARGUMENTS         
    
public class Oops {
    
    public static void main(String args[]) {
       Student s1 = new Student("Narmada");
       System.out.println(s1.name);
    }
}

class Student{
    String name;
    int rollno;

    Student(String name) {
        this.name = name;
    }
}
===============================================================================================
//3 TYPES OF CONSTRUCTOR
    //PARAMETERIZED , NON-PARAMETERIZED, COPY CONSTRUCTOR

public class Oops {
    
    public static void main(String args[]) {
       Student s1 = new Student();  //non parameterized constructor
       Student s2 = new Student("Narmada");
       System.out.println(s2.name);    //parameterized constructor
       Student s3 = new Student(373);
       System.out.println(s3.rollno);
    }
}

class Student{
    String name;
    int rollno;

    Student() {
        System.out.println("Hey Narmada, Constructor is being called..");
    }

    Student(String name) {
        this.name = name;
    }

    Student(int rollno) {
        this.rollno = rollno;
    }

}


============================================================================================

    //INHERITANCE

    //SINGLE-LEVEL INHERITANCE

public class Oops {
    
    public static void main(String args[]) {
       Fish shark = new Fish();
       shark.eat();
    }
}

//Base class
class Animal {
    String color;  //property

    void eat() {
        System.out.println("Eating");
    }

    void breathe() {
        System.out.println("Breathing");
    }
}

//Derived class
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("Swimming in water");
    }
}

============================================================================================

    //MULTI-LEVEL INHERITANCE

public class Oops {
    
    public static void main(String args[]) {
       Dogs melo = new Dogs();
       melo.barks();
       melo.legs = 4;
       System.out.println(melo.legs);
    }
}

//Base class
class Animal {
    String color;  //property

    void eat() {
        System.out.println("Eating");
    }

    void breathe() {
        System.out.println("Breathing");
    }
}

//Derived class
class Mammal extends Animal {
    int legs;

    void walks() {
        System.out.println("going for a walk");
    }
}

class Dogs extends Mammal {
    int barks;

    void barks() {
        System.out.println("barks");
    }

}

============================================================================================

//HIERARCHIAL INHERITANCE

public class Oops {
    
    public static void main(String args[]) {
       Mammal sizu = new Mammal();
       sizu.eat();
    }
}

//Base class
class Animal {
    String color;  //property

    void eat() {
        System.out.println("Eating");
    }

    void breathe() {
        System.out.println("Breathing");
    }
}

//Derived class
class Mammal extends Animal {
    int legs;

    void walks() {
        System.out.println("Walks");
    }
}

class Fish extends Animal {
    void swims() {
        System.out.println("Swims");
    }

}

class Bird extends Animal {
    void flys() {
        System.out.println("Flying");
    }

}
 ==================================================================================
     //Hybrid inheritanc 

     
     
==================================================================================

     //POLYMORPHISM

     //Complile time polymorphism or static

     //ex for METHOD-OVERLOADING

 public class Oops {
    
    public static void main(String args[]) {
       Calculator calc = new Calculator();
       System.out.println(calc.sum(1, 2));
       System.out.println(calc.sum((float)1.5, (float)2.5));
       System.out.println(calc.sum(1, 2, 3));
    }
}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

==================================================================================

//Run-time polymorphidm or dynamic
    
//METGOD-OVERRIDING
    
public class Oops {
    
    public static void main(String args[]) {
       Deer d = new Deer();
       d.eat();
    }
}

class Animal {
    void eat() {
        System.out.println("eats anything");
    }
}
class Deer extends Animal {
    void eat() {
        System.out.println("eats grass");
    }
}

==================================================================================

//ABSTRACTION

// abstract class can have both normal and abstract method
    
import java.util.Scanner;

import java.util.*;

public class Oops {

    public static void main(String args[]) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();
    }
}

abstract class Animal {               //abstract class
    void eat() {            //normal method
        System.out.println("Animal eats");
    }
    
    abstract void walk();       //abstract method
}

class Horse extends Animal {
    void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("Walks on 2 legs");
    }
}
========================================================================================
    //How abstraction uses constructor

import java.util.Scanner;

import java.util.*;

public class Oops {

    public static void main(String args[]) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        h.changeColor();   //change color method
        System.out.println("The color is changed to " + h.color);

        Chicken c = new Chicken();
        
    }
}

abstract class Animal {
    String color;

    Animal() {
        color = "brown";
    }
    void eat() {            
        System.out.println("Animal eats");
    }
    
    abstract void walk();       
}

class Horse extends Animal {
    void changeColor() {
        color = "white";
    }
    void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal {
    void changeColor() {
        color = "yellow";
    }
    void walk() {
        System.out.println("Walks on 2 legs");
    }
}
========================================================================================
    //Constructor in asbraction class , heirarchically calling constructor

import java.util.Scanner;

import java.util.*;

public class Oops {

    public static void main(String args[]) {
        Mustang myHorse = new Mustang();
        
    }
}

abstract class Animal {
    String color;

    Animal() {
        System.out.println("Animal constructor is being called");
    }
    void eat() {            
        System.out.println("Animal eats");
    }
    
    abstract void walk();       
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor is being called");
    }

    void changeColor() {
        color = "white";
    }
    void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor is called");
    }
}

class Chicken extends Animal {
    
    void changeColor() {
        color = "yellow";
    }
    void walk() {
        System.out.println("Walks on 2 legs");
    }
}

======================================================================================
    //INTERFACES

    // DEFN - INTERFACE is a blueprint of class, and Class is a blueprint of objects


public class Oops {

    public static void main(String args[]) {
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("Queen can move in any direction and diagonally too");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("Rook can move in 4 directions");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("King can move in 4 directions and diagonally by 1 step");
    }
}

================================================================================================
    //Interfaces support Multiple inheritance

 public class Oops {

    public static void main(String args[]) {
        Bear b = new Bear();
        b.eats();
    }
}

interface Herbivore {
    void eats();
}

interface Carnivore {
    void eats();
}

class Bear implements Herbivore, Carnivore {
    public void eats() {
        System.out.println("Eats both meat and plants");
    }
}














    
