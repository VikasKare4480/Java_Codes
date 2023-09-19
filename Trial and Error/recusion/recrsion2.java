class Demo2 {

    static void f1() {

        int n = 1;
        f2();
        System.out.println(n);

    }

    static void f2() {

        int n = 2;
        f3();
        System.out.println(n);
    }

    static void f3() {

        int n = 3;
        System.out.println(n);
    }

    public static void main(String[] args) {

        f1();
    }
    
}


