import java.io.*;
import java.util.*;


class Child {

    @Deprecated
    void m1() {
        System.out.println("In Child m1");
    }

}
class Client {

    public static void main(String[] args) {
        
        Child ch1 = new Child();
        ch1.m1();
    }  
}
