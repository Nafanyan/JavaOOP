package userInterface;
import model.prioritet;

interface UIInter {
    void printInfo(Object source);
    String addFullname();
    String addTask();
    prioritet addPrioritet();
}