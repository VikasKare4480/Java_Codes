import java.io.*;

class Demo4 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Your Name : ");
        // throw new IOException to caller -- >> JVM

        try {
            String name = br.readLine();

        } catch (IOException e) {

            System.out.println("IOException caught succesfully");
        }

        System.out.print("Enter Your Age : ");
        // int age = Integer.parseInt(br.readLine());

        // for other than int type of data
        // Exception in thread "main" java.lang.NumberFormatException: For input string:
        // "vik"

        int age = 0;

        try {

            age = Integer.parseInt(br.readLine()); // throw new NumberFormatException to caller

        } catch (Exception obj) {

            System.out.println("Exception caught succesfully");
            System.out.println("please the Integer ");

            try {

                age = Integer.parseInt(br.readLine());

            } catch (IOException e) {

                System.out.println("Ok");
            }

        }

    }
}
