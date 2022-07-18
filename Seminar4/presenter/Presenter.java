package presenter;

import model.Model;
import userInterface.UIConsole;

public class Presenter {
    UIConsole newMenu;
    Model newModel;
    public Presenter(){
        newModel = new Model();
        
    }

    public void button() {
        while(true){
            newMenu = new UIConsole();
            switch(newMenu.getDoit()){
                case 1: 
                newModel.addTask(newMenu.addFullname(), newMenu.addPrioritet(), newMenu.addTask());
                break;
                case 2:
                newMenu.printInfo(newModel.getStorage());
                break;
                case 3:
                System.out.println("Доработаю");
                break;
                case 0:
                return;
                default:
                System.out.println("Чел ввели нормальную цифру");

            }
        } 
    }


    
}
