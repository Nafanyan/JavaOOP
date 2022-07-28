package Seminar5;

abstract public class User {
    protected UserRights whoUser;
    protected String name;
    protected int id;

    abstract void printMessage(String msg);
    abstract void sendMsg(String text);

    public void setWhoUser(UserRights whoUser, User user) {
        if (this.whoUser == UserRights.ADMIN) {
            user.whoUser = whoUser;
        }
    }

}

enum UserRights {
    ADMIN,
    MODERATOR,
    SIMPLE
}
