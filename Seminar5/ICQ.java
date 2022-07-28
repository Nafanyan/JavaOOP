package Seminar5;

import java.util.ArrayList;

class ICQ implements Chat {

  ArrayList<Client> users = new ArrayList<>();
  ICQStorage storage = new ICQStorage(this);

  public ICQ(Client user) {
    user.whoUser = UserRights.ADMIN;
    user.setChatroom(this);
    appendClient(user);
  }

  @Override
  public void sendMessage(String text, Client me) {
    storage.addMsg(text, me.name);
    for (Client user : users) {
      if (user.name != me.name) {
        user.printMessage(text);
      }
    }
  }

  @Override
  public void appendClient(Client client) {
    if (!users.contains(client)) {
      System.out.println("\n >>> Add " + client.name);
      storage.addMsg(client.name, " >>> Add ");
      users.add(client);
      client.id = AddId.newId();
      client.setChatroom(this);
      if (client.id > 1)
        client.whoUser = UserRights.SIMPLE;
    }
  }

  @Override
  public void delClient(Client who, Client whom) {
    if (who.whoUser == UserRights.ADMIN) {
      users.remove(whom);
      System.out.println("\n <<< Del " + whom.name);
    } else {
      System.out.println("\nSystem message");
      System.out.println(who.name + ", you don't have the rights to delete " + whom.name);
    }
  }

  public void printAllMsg() {
    storage.printMsg();
  }

  public void printAllUser() {
    for (Client client : users) {
      System.out.println(client.name + " " + client.whoUser);
    }
  }

  public void delMsg(int id) {
    storage.delMsg(id);
  }

  public ArrayList<Client> getUsers() {
    return users;
  }

}

class AddId {
  private static int id = 0;

  static int newId() {
    id++;
    return id;
  }
}
