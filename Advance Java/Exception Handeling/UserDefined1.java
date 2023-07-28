import java.util.Scanner;

class DataUnderFlowException extends RuntimeException {

    DataUnderFlowException(String data) {

        super(data);
    }
}

class DataOverFlowExeption extends RuntimeException {

    DataOverFlowExeption(String data) {

        super(data);
    }

}

class UDClinet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number Between 0 and 100");

        int arr[] = new int[5];

        for (int i = 0; i < arr.length; i++) {

            System.out.print("Enter " + (i + 1) + " element ");
            int data = sc.nextInt();

            // DataUnderFlowException

            try {

                if (data < 0) {

                    throw new DataUnderFlowException("Data entered is less than ZERO");
                }
            } catch (DataUnderFlowException obj) {

                // System.out.println(obj.toString());
                obj.printStackTrace();
                // continue;
            }

            //

            try {

                if (data > 100) {

                    throw new DataOverFlowExeption("Data is greater than 100 ");

                }
            } catch (DataOverFlowExeption obj) {

                // System.out.println(obj.getStackTrace());
                // System.out.println(obj.toString());
                obj.printStackTrace();
                // continue;
            }

        }

    }
}