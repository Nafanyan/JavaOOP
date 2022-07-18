package model;
import java.util.ArrayList;

public class Storage {
    private ArrayList<myTask> storage;

    public Storage(){
        storage = new ArrayList();
    }

    public void addTask(String fullName, prioritet level, String nowTask){
        myTask newTask = new myTask(fullName, level, nowTask);
        storage.add(newTask);
    }

    public void delTask(int id){
        storage.remove(id);
    }

    public ArrayList<myTask> getStorage() {
        return storage;
    }

}
