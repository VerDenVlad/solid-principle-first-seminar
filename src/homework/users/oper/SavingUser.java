package homework.users.oper;

import homework.interf.Saveable;
import homework.users.User;

public class SavingUser implements Saveable {
    private final User user;

    public SavingUser(String userName){
        this.user = new User(userName);
    }


    @Override
    public void save() {
        System.out.println("Save user: " + user.getName());
    }
}
