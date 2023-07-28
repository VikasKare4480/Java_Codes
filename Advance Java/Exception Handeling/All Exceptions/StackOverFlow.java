// Exception in thread "main" 
// java.lang.StackOverflowError

class SOFlow {

    void getData() {

        System.out.println("In data");

        for (int i = 0; i < 10000; i++) {

            try {

                getData();

            } catch (StackOverflowError e) {

            }

        }
    }
}

class _Exception {

    public static void main(String[] args) {

        SOFlow obj = new SOFlow();
        obj.getData();

    }
}