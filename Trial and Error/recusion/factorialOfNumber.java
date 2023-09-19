class factorialOfNumber {

    static int factorialOfN(int n) { 

        // Base codition 
        if(n == 0) {
            return 1;
        }
        return n * factorialOfN(n - 1);

    }
    public static void main(String[] args) {

        System.out.println(factorialOfN(5));
        
    }
}
