class ExceptionHadeling {

    void validate(int age) {

        if (age < 18) {

            System.out.println("Not Valid");
        } else {

            System.out.println("Valid");
        }
    }

}

class Main {
    public static void main(String[] args) {

        int age = 10;

        ExceptionHadeling obj = new ExceptionHadeling();

        obj.validate(age);

    }
}
