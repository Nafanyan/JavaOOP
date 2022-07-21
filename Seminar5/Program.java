
public class Program {
    public static void main(String[] args) {
        Client client1 = new Client("Ilya");
        ICQ icq = new ICQ(client1);

        Client client2 = new Client("Vanya");
        icq.appendClient(client2);


        Client client3 = new Client("Irina");

        Client client4 = new Client("Marina");

        icq.appendClient(client1);
        icq.appendClient(client2);
        icq.appendClient(client3);
        client1.sendMsg("Hola!");
        client2.sendMsg("Hi!");
        
        icq.appendClient(client4);

        client3.sendMsg("hello world!");
        System.out.println();
        
        icq.printAllUser();
        client1.delClient(client2);

        client1.giveUserRights(UserRights.ADMIN, client2);

        client2.giveUserRights(UserRights.MODERATOR, client3);
        icq.printAllUser();

    }
}
