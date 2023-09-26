

// Ovverrided
// Deprocated
// Suppressed Warning

class Parent {

    
    void showData() {
        System.out.println("In parent ShowData");
    }

    @Deprecated
    void parentData() {

        System.out.println("In Parent Data");
    }

}

class Child extends Parent {    

    @Override
    void showData() {

        System.out.println("In child showData");
    }
    
}

public class annotaions1 {

    public static void main(String[] args) {

        Child obj = new Child();
        obj.parentData();

        
    }
}
