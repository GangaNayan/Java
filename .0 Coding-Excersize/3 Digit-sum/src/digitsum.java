public class digitsum {
    public static void main(String[] args) {
        int total = digitsum(125);
        System.out.println(total);
    }

    public static int digitsum(int num) {

        if (num < 10) {
            return -1;
        }
        int sum=0;
        while (num > 0) {


            int digit = num % 10;
            sum += digit;

            num /= 10;
        }
        return sum;

    }


}


