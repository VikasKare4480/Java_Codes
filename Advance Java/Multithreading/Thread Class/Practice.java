interface MyInterface1 {

    // void putData();

    default void getData() {

        System.out.println("In getData MyInterface1 ");
    }

}

interface MyInterface2 extends MyInterface1 {

    default void getData() {

        System.out.println("In getData MyInterface2");
    }

}

class MyClass implements MyInterface2 {

    MyInterface2 obj = new MyClass() {

        public void putData() {

            System.out.println("In put");
        }
    };

    MyClass obj2 = new MyClass();

    public static void main(String[] args) {

        MyInterface2 obj = new MyClass() {

            public void putData() {

                System.out.println("In put");
            }
        };

    }
}