
import java.io.*;
import java.util.*;

class Demo extends Exception  {

    Demo(String str) {

        super(str);  
    } 
}

class Parent {
        
    Parent() {

        System.out.println("In Parent Cons");
    }

    void m1() {
        System.out.println("parent m1");
        // return new Object();
    }
}

class Child extends Parent {

    Child() {

        System.out.println("In child");
    }

    void m1() {

        System.out.println("In child m1()");
        try {
                 throw new Demo("Exception throws");

        }catch(Demo obj) {

            System.out.println("Exception caught " + obj.toString());
            obj.printStackTrace();

        }
    }
}


class Client {

    public static void main(String[] args) {
        
        Parent p = new Child();
        p.m1();
    }
}