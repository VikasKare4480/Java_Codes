import java.util.Vector;
import java.util.List;

class VectorMethodDemo {


    public static void main(String[] args) {
        


        // Constructors of the Vector 

        List vec1 = new Vector<>();
        List vec2 = new Vector<>(10);
        List vec3 = new Vector<>(10,10);
        List vec4 = new Vector(vec1);

        // Methods of the Vector class

        Vector vec11 = new Vector();

        // add() 

        vec11.add("Vikas");
        vec11.add("Laxman");
        vec11.add("Mandakini");
        vec11.add("Sanket");
        vec11.add("Damini");

        System.out.println("Add() : " + vec11);

        // addAll() 

        Vector vec22 = new Vector<>();
        vec22.add("Parth");
        vec22.add("Atharva");

        System.out.println("Vec22 : " + vec22);
       
        vec11.addAll(vec22);

        System.out.println("addAll() : " + vec11 );

        // addElement() 

        vec11.addElement("Kisan");
        vec11.addElement("Kusum");
        vec11.addElement("Parshuram");
        vec11.addElement("Archana");

        System.out.println("addElement() : " + vec11);


        // capacity() 

        System.out.println("Capacity() : " + vec11.capacity());

        // clear() 

        vec22.clear();
        
        // System.out.println("clear() vec22 " + vec22);

        //clone() 

        Object clone = vec11.clone();

        System.out.println("clone() of vec11 : " + clone );

        // contains() 
        System.out.println("vec11 contains the Vikas Object : " + vec11.contains("Vikas"));
        
        // ConainsAll() 

        System.out.println("vec11 contains all the vec22 : " + vec11.containsAll(vec22));

        // 

        //Create an empty vector of capacity 10          
        Vector<Integer> vec = new Vector<>(10);         
        //Ensuring capacity  
        vec.ensureCapacity(25);           
        //Cheking the capacity  
        System.out.println("Minimum capacity of this vector: " +vec.capacity());  

        Vector<String> Vec1 = new Vector<>();  
        vec1.add("A");  
        vec1.add("B");  
        vec1.add("C");  
        Vector<String> Vec2 = new Vector<>();  
        vec2.add("A");  
        vec2.add("B"); 
        System.out.println("Is vector1 equals vector2 ? "+Vec1.equals(Vec2));  

        
        Vector < String > colors = new Vector < String > ();  
        //Add elements in the vector  
          colors.add("White");  
          colors.add("Green");  
          colors.add("Black");  
          colors.add("Pink");  
        //Use forEach() method to print vector elements  
        colors.forEach(System.out::println);  

        System.out.println(        System.identityHashCode(colors));
        System.out.println();
        System.out.println(colors.hashCode());

    }

}