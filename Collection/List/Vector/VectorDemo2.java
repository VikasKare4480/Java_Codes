
import java.util.*;

class VectorDemo {

    public static void main(String[] args) {
        
        List<String> vec = new Vector<>(4);

        vec.add("Tiger");  
        vec.add("Lion");  
        vec.add("Dog");  
        vec.add("Elephant");  

        System.out.println("Size of the Vector " + vec.size());
        // System.out.println("Capacity of the Vector : " + vec.capacity());

        // System.out.println("Default capacity is: "+vec.capacity()); 
        
        System.out.println("Vector element is: "+vec);  
        vec.addElement("Rat");  
        vec.addElement("Cat");  
        vec.addElement("Deer");   



    }
    
}
