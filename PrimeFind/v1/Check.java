public class Check {
    public static void main(String[]args){
        boolean test = primes(16);
        System.out.print(test);

    }

    public static boolean primes(int input_num) {
        int checkNum = input_num;
        int divNum = 0;
        int divCount = 0;
        int divisor = 0;

        for (divNum = 0; divNum <= checkNum; divNum++) {
            divisor++;
            if (checkNum % divisor == 0) {
                ++divCount;
            }
        }
        if (divCount == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean primef(int input_num) {
        int checkNum = input_num;
        int divNum = 0;
        int divCount = 0;
        int sqrtNum = (int) Math.sqrt(checkNum);

        for (divNum = 1; divNum < sqrtNum; divNum++) {
            if (checkNum % divNum == 0) {
                ++divCount;
            }
            if (divCount > 2) {
                break;
            }
        }
        if (divCount != 2) {
            return false;
        } else {
            return true;
        }
    }

}