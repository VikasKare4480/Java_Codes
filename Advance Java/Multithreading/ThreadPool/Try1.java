public class Try1 {

    public static void main(String[] args) throws InterruptedException {

        try {

            Thread.sleep(100);

        } finally {

            System.out.println("IN finally");
        }
    }

}
