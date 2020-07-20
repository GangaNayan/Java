public class persondata {
    public static void main(String[] args) {
        person person=new person();
       person.setFirstname(" ");
        person.setSecondname("Nayan T L");
        person.setAge(22);
        System.out.println("your name is : "+person.fullname());
        System.out.println("your age is : "+person.getAge());
        System.out.println("Teen age : "+person.isteen());
        person.setFirstname("vinu");
        person.setSecondname(" ");
        person.setAge(26);
        System.out.println("your name is : "+person.fullname());
        System.out.println("your age is : "+person.getAge());
        System.out.println("Teen age : "+person.isteen());

    }
}
