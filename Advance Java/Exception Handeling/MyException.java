class MyException extends Exception {

    public MyException(String str) {

        super(str); // calling to the constructor of the Exception class
        // System.out.println("MyException");

    }
}

class Client {

    public static void main(String[] args) {

        int x = 10;
        int y = 0;

        try {
            if (y == 0)
                throw new MyException("My Exception");
        } catch (MyException obj) {

            System.out.println("My exception Handeled " + obj);
        }

    }
}
