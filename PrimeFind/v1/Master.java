public class Master {
    public static int primeTotal = 10000;
    public static int countPrimes = 0;
    public static int currentNum = 0;

    public static void main(String[] args) {

        // GLOBAL VARIABLES

        // ARRAY VARIABLES
        int[] primeArray = new int[primeTotal];
        // CHECK IF PRIME. IF YES, RETURN TRUE
        StopWatch.startTimer(0);

        while (countPrimes < primeTotal) {
            currentNum++;
            boolean prime = Check.primes(currentNum);
            if (prime == true) {
                primeArray[countPrimes] = currentNum;
                countPrimes++;
            }
        }
        StopWatch.stopTimer(0);
        Printerm.singleline(primeTotal + "\t" + primeArray[primeTotal-1] + "\t" + StopWatch.getTimer(0, "s"));
    }
}