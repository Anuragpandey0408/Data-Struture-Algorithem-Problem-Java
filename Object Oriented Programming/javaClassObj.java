
public class javaClassObj {
    public static void main(String[] args) {

        Pen p1 = new Pen();
        p1.setColor("Blue"); // color
        System.out.println(p1.color);

        p1.color = "Yellow"; // set color 2nd time
        System.out.println(p1.color);

        p1.setTip(8);
        System.out.println(p1.tip); // tip

        Student s1 = new Student();
        s1.calPercentage(10, 20, 30); // marks calculate
        System.out.println(s1.percentage);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "anuragPandey";
        myAcc.password = "abcd";  // directly try to change password
        myAcc.changePassword("abcd");
        System.out.println(myAcc.password);
        System.out.println(myAcc.newPassword);

    }
}

// Pen Class
class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

// Student Class
class Student {
    String name;
    int age;
    float percentage;

    void calPercentage(int maths, int phy, int chemistry) {
        percentage = (maths + chemistry + phy) / 3;
    }
}

// BankAccount Class
class BankAccount {
    public String username;
    private String password;

    public void changePassword(String newPassword) {
        password = newPassword;
    }
}
