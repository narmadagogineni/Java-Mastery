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
  //This for same name

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
