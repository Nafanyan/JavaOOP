package Seminar5.appSem;

import java.util.ArrayList;

/**
 * App
 */
public class App2 {

  public static void main(String[] args) {
    ICQ icq = new ICQ();
    User client1 = new User("Р’Р°СЃСЏ", icq);
    User client2 = new User("РњР°С€Р°", icq);
    User client4 = new User("Р’Р°Р»СЊРґРµРјР°СЂ", icq);
    icq.appendClient(client1);
    icq.appendClient(client2);
    icq.appendClient(client4);
    client1.sendMsg("РїСЂРёРІРµС‚ РІСЃРµРј!");
    client2.sendMsg("РєСѓ-РєСѓ!");
    User client3 = new User("РљРѕР»СЏ", icq);
    icq.appendClient(client3);

    client3.sendMsg("hello world!");
  }
}

class User {
  public User(String name, Chat chatroom) {
    this.name = name;
    this.chatroom = chatroom;
    // chatroom.appendClient(this);
  }

  String name;
  private Chat chatroom;

  void printMessage(String msg) {
    System.out.printf("Р§Р°С‚ %s: %s\n", name, msg);
  }

  void sendMsg(String text) {
    chatroom.sendMessage(text, this);
  }
}

class ICQ implements Chat {

  ArrayList<User> users = new ArrayList<>();

  @Override
  public void sendMessage(String text, User me) {

    for (User user : users) {
      if (user.name != me.name) {
        user.printMessage(text);
      }
    }
  }

  @Override
  public void appendClient(User client) {
    System.out.println("\n >>> РґРѕР±Р°РІРёР»СЃСЏ " + client.name);
    users.add(client);

  }
}

interface Chat {
  void sendMessage(String msg, User user);

  void appendClient(User user);
}