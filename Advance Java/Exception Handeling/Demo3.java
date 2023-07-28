import java.io.*;

class Input {

    public static void main(String[] args) { // throws IOException

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter string");
        // String str = br.readLine();
        // error: unreported exception IOException;
        // must be caught or declared to be thrown

        String str = null;

        try {

            str = br.readLine(); // throw new IOEXception to the caller

        } catch (Throwable obj) {

            System.out.println("Exception catched");
        }

        System.out.println(str);

        br.close(); // throw new IOException to caller

        String str2 = br.readLine();
        //
        // Demo3.java:29: error: unreported exception IOException;
        // must be caught or declared to be thrown
        System.out.println(str2);
    }
}
