import java.util.Scanner;

class Demo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = 10;
        int y = 0;

        System.out.println("Enter the Divisor ");

        try {

            int z = x / y; // Arithmethic Exception
        } catch (ArithmeticException obj) {

            System.out.println("Arithmatic exception caught");

        } catch (RuntimeException obj) {

            System.out.println("Runtime Exception caught");

        } catch (Exception obj) {

            System.out.println("Exception caught");

        } catch (Throwable obj) {

            System.out.println("Throwable");

            // } catch (Object obj) {

            // System.out.println("Object caught");
            // }
        } finally {

            System.out.println("In finally Block");
        }
    }

}
