public class Master {
    public static int primeTotal = 10;
    public static int currentNum = 14;
    
    public static void main(String[] args) {

        // GLOBAL VARIABLES

        // ARRAY VARIABLES

        // CHECK IF PRIME. IF YES, RETURN TRUE
        boolean prime = Check.primes(currentNum);
        Printerm.singleline(currentNum + "\t" + prime);
    }
}