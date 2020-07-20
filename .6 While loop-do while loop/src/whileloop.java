public class whileloop {
    public static void main(String[] args){
        int count=1;
        while (count!=6){
            System.out.println("the while loop 1 count is = "+count);
            count ++;
        }
        count =1;
        while(true){
            if(count==6){
                break;
            }
            System.out.println("the while loop 2 count is = "+count);
            count ++;
        }
        for(count=1;count!=6;count++){
            System.out.println("the for loop count = "+count);
        }
        count=2;
        do{
            System.out.println("the do while loop twist = "+count);
            count ++;
        }while (count!=6);

        count =6;
        do{
            System.out.println("the do while loop = "+count);
            count ++;
            if(count>100){
                break;     // at least executes once
            }
        }while (count!=6);

        // even number challenge
        int start=10;
        int end =100;
        while (start<=end){
            start ++;
            if(!isevenno(start)){
                continue;  // continue wont print anything after continue and start from beginning if condition satisfy
            }
            System.out.println("the even number is = "+start);
        }
    }
    public static boolean isevenno(int number){
        if(number%2==0){
            return true;
        }
        return  false;
    }


}
