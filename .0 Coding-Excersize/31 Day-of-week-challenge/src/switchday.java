public class switchday {
    public static void main(String[] args) {
    dayofweek(-1);
        dayofweek(0);
        dayofweek(1);
        dayofweek(2);
        dayofweek(3);
        dayofweek(4);
        dayofweek(5);
        dayofweek(6);
        dayofweek(7);
    }

    public static void dayofweek(int day) {

        if (day == 0) {
            System.out.println("its sunday");
        } else if (day == 1) {
            System.out.println("its monday");
        } else if (day == 2) {
            System.out.println("its tuesday");
        } else if (day == 3) {
            System.out.println("its wednesday");
        } else if (day == 4) {
            System.out.println("its thursday");
        } else if (day == 5) {
            System.out.println("its friday");
        } else if (day == 6) {
            System.out.println("its saturday");
        } else {
            System.out.println("enter the proper day");
        }

        switch (day) {
            case 0:
                System.out.println("its sunday");
                break;
            case 1:
                System.out.println("its monday");
                break;
            case 2:
                System.out.println("its tuesday");
                break;
            case 3:
                System.out.println("its wednesday");
                break;
            case 4:
                System.out.println("its thursday");
                break;
            case 5:
                System.out.println("its friday");
                break;
            case 6:
                System.out.println("its saturday");
                break;
            default:
                System.out.println("please enter a valid day");
        }

    }
}
