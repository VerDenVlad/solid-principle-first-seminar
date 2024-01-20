package homework;

import homework.users.oper.ReportUser;
import homework.users.oper.SavingUser;
import homework.users.User;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");


        ReportUser rUser = new ReportUser(user);
        rUser.report();

        SavingUser sUser = new SavingUser("Bad");
        sUser.save();

    }
}