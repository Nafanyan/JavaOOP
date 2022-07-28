package Seminar5;

public class Client extends User {
    private ICQ chatroom;
  
    public Client(String name) {
      this.name = name;
    }
  
    void printMessage(String msg) {
      System.out.printf("Chat, %s: %s\n", name, msg);
    }
  
    void sendMsg(String text) {
      chatroom.sendMessage(text, this);
    }
  
    public void setChatroom(ICQ chatroom) {
      this.chatroom = chatroom;
    }
  
    public void delClient(Client user) {
      chatroom.delClient(this, user);
    }
  
    public void giveUserRights(UserRights whoUser, Client user) {
      if (chatroom.getUsers().contains(this))
        this.setWhoUser(whoUser, user);
    }
  }
