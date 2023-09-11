import java.util.List;
import java.util.Vector;



class VectorDemo {

    public static void main(String[] args) {
        

        Vector<String> vec = new Vector<String>();

        vec.add("Tiger");
        vec.add("Lion");
        vec.add("Dog");
        vec.add("Elephant");
        

        System.out.println(vec);

        vec.addElement("Cat");
        vec.addElement("Rat");
        vec.addElement("Deer");

        System.out.println("Add element method : " + vec);
        
    }
}