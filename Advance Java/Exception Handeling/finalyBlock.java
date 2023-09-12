class Demo {

    void m1() {

        System.out.println("In m1");

    }

    void m2() {

        System.out.println("In m2");
    }

    public static void main(String[] args) {

        Demo obj = new Demo();

        obj.m1();

        obj = null;

        try {
            // This will throw a NullPointerException as the object is already garbage
            // collected

            obj.m2(); // NullPointerException

            if(obj == null) {
                
            }
                
        } catch (ArithmeticException e) {

            System.out.println();

        } finally {

            System.out.println("caugth in finally Block");
        }

    }

}
