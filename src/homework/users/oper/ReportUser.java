package homework.users.oper;

import homework.interf.Reportable;
import homework.users.User;

public class ReportUser implements Reportable {
    private final User user;

    public ReportUser(User user) {
        this.user = user;
    }


    @Override
    public void report() {
        System.out.println("Report for user: " + user.getName());
    }
}
