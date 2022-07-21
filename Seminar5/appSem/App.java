package Seminar5.appSem;
import java.util.ArrayList;


public class App {
    
    public static void main(String[] args) {
        ICQ icq = new ICQ(new Db());
        Client client1 = new Client("Р’Р°СЃСЏ");
        client1.join(icq);
        Client client2 = new Client("РњР°С€Р°", icq);
        Client client4 = new Client("Р’Р°Р»СЊРґРµРјР°СЂ", icq);
    
        // icq.appendClient(client1);
        // icq.appendClient(client2);
        client1.sendMsg("РїСЂРёРІРµС‚ РІСЃРµРј!");
        client2.sendMsg("РєСѓ-РєСѓ!");
        Client client3 = new Client("РљРѕР»СЏ", icq);
    
        client3.sendMsg("hello world!");
    
      }
    }
    
    interface User {
    }
    
    class Client implements User {
      public Client(String name, Chat chatroom) {
        this.name = name;
        this.chatroom = chatroom;
        this.chatroom.appendClient(this);
      }
    
      public Client(String name) {
        this.name = name;
    
      }
    
      public void join(Chat chatroom) {
        this.chatroom = chatroom;
      }
    
      String name;
      private Chat chatroom;
    
      void printMessage(MessageModel msg) {
        System.out.printf("Р§Р°С‚ %s: %s\n", name, msg.text);
      }
    
      void sendMsg(String text) {
        var mm = new MessageModel(text);
        chatroom.sendMessage(mm, this);
      }
    }
    
    // РїР°РїРєР° CLIENT
    // V
    // M
    // P
    // РїР°РїРєР° SERVER
    class ICQ implements Chat {
    
      Repository repo;
    
      public ICQ(Repository currentRepo) {
        repo = currentRepo;
      }
    
      @Override
      public void sendMessage(MessageModel mm, Client me) {
        for (int i = 0; i < repo.getCount(); i++) {
          var c = repo.getById(i);
          if (c.name != me.name) {
            c.printMessage(mm);
          }
        }
      }
    
      @Override
      public void appendClient(Client client) {
        System.out.println("\n >>> РґРѕР±Р°РІРёР»СЃСЏ " + client.name);
        repo.add(client);
    
      }
    }
    
    interface Repository {
      void add(Client user);
    
      Client getByName(String name);
    
      Client getById(int id);
    
      int getCount();
    
    }
    
    class Db implements Repository {
    
      ArrayList<Client> users = new ArrayList<>();
    
      @Override
      public void add(Client user) {
        users.add(user);
      }
    
      @Override
      public Client getByName(String name) {
        for (Client user : users) {
          if (user.name == name) {
            return user;
          }
        }
        return null;
      }
    
      @Override
      public Client getById(int id) {
    
        return users.get(id);
      }
    
      @Override
      public int getCount() {
    
        return users.size();
      }
    
    }
    
    //
    interface Chat {
      void sendMessage(MessageModel mm, Client me);
    
      void appendClient(Client client);
    }
    
    class MessageModel {
      static int index = 1;
    
      String text;
      int id;
    
      public MessageModel() {
    
      }
    
      public MessageModel(String text) {
        this.text = text;
        this.id = index++;
      }
    }
    
    class API {
      Chat chatroom;
    
      MessageModel sendMessageModel(MessageModel mm, Client user) {
        chatroom.sendMessage(mm, user);
        var res = new MessageModel();
        res.id = 1;
        res.text = "{'result':true}";
        return res;
      }
    
      MessageModel appendClient(Client client) {
        chatroom.appendClient(client);
        var res = new MessageModel();
        res.id = 1;
        res.text = "{'result_append':true}";
        return res;
      }
    }
    
    // M-C
