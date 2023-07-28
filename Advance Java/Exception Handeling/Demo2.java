class Demo {

    void config() {

        System.out.println("start config");
        int x = 10;

        for (int i = 0; i < 10; i++) {

            try {

                System.out.println(x / i);

            } catch (ArithmeticException obj) {

                System.out.println("/ by zero exception");

            }

        }

        System.out.println("End config");
    }
}

class Client {

    public static void main(String[] args) {

        Demo obj = new Demo();
        obj.config();

        try {

        } catch (ArithmeticException e) {

            System.out.println("ArithmaticException");

        }

    }
}
