import javax.swing.*;

public class person {
    private String firstname;
    private String secondname;
    private int age;

    public String getFirstname() {
        return firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public int getAge() {
        return age;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public void setAge(int age) {
        if (age <= 0 || age > 100) {
            this.age = 0;
        }
        this.age = age;
    }

    public boolean isteen() {
        if (age > 12 && age < 20) {
            return true;
        }
        return false;
    }

    public String fullname() {
        if (firstname.isEmpty()) {
            return secondname;
        } else if (secondname.isEmpty()) {
            return firstname;
        } else if (firstname.isEmpty() || secondname.isEmpty()) {
            return " ";

        } else  {
            return firstname+" "+secondname;
        }
    }


}
