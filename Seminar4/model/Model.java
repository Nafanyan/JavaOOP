package model;

import java.util.ArrayList;

import model.saveOnFile.*;

public class Model {
    private Storage nowStorage;

    public Model() {
       nowStorage = new Storage();
    }

    public void addTask(String fullName,prioritet level,String nowTask){
        nowStorage.addTask(fullName, level, nowTask);
    }

    public void deleteTask(int id){
        nowStorage.delTask(id);;
    }

    public boolean saveXML(){
        SaveXML newFile = new SaveXML();
        newFile.recorCompleted();
        return newFile.recorCompleted();
    }

    public ArrayList<myTask> getStorage() {
        return nowStorage.getStorage();
    }

    public void printTask(int id){
        if(nowStorage.getStorage().size() > id){
            System.out.println("id: " + id);
            System.out.println(nowStorage.getStorage().get(id));
        } else{
            System.out.println("Task not exist");
        }
        
    }
    
    public void printAll(){
        for (int i = 0; i < nowStorage.getStorage().size(); i++) {
            System.out.println("id: " + i);
            System.out.println(nowStorage.getStorage().get(i));
            System.out.println();
        }
    }

}
