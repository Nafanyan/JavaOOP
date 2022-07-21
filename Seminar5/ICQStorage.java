import java.util.LinkedList;
import java.util.Date;

public class ICQStorage implements Storage{
    private LinkedList<String> storMsg = new LinkedList<>();
    private ICQ chatroom;
    Date d = new Date();

    public ICQStorage(ICQ chatroom){
        this.chatroom = chatroom;
    }

    @Override
    public void addMsg(String msg, String user) {
        storMsg.add("id: " + storMsg.size() + " " + user + ": " + msg + " - " + d);
    }

    @Override
    public void delMsg(int id) {
        storMsg.remove(id);
    }

    @Override
    public void printMsg() {
        for (String string : storMsg) {
            System.out.println(string);
        }  
    }
    
}
