class Demo {

    void m1() {

        System.out.println("In m1");
        m2();

    }

    void m2() {

        System.out.println("In m2");
    }
}

class Client {

    public static void main(String[] args) {

        Demo obj = new Demo();
        obj.m1();

    }
}