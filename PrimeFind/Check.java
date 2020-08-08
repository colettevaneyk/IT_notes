public class Check {
    public static void main(String[]args){
        
    }

    public static boolean primes(int input_num) {
        int checkNum = input_num;
        int divNum = 0;
        int divCount = 0;

        for (divNum = 0; divNum < checkNum; divNum++) {
            if (checkNum % divNum == 0) {
                ++divCount;
            }
        }
        if (divCount != 2) {
            return false;
        } else {
            return true;
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