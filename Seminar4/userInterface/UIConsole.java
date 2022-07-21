package userInterface;

import java.util.ArrayList;
import java.util.Scanner;

import model.prioritet;

public class UIConsole implements UIInter{
    private int doit;
    Scanner sc;
    public UIConsole(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Выберете действие");
            System.out.println("1. Добавить запись;");
            System.out.println("2. Посмотреть список записей;");
            System.out.println("3. Сохранить как XML файл");
            System.out.println("0. Выход");
            this.doit = sc.nextInt();
        }
    }

    @Override
    public void printInfo(Object source) {
        if (source instanceof ArrayList){
            for (int i = 0; i < ((ArrayList) source).size(); i++) {
                System.out.println("id: " + i);
                System.out.println(((ArrayList) source).get(i));
                System.out.println();
            }
        }
    }

    @Override
    public String addFullname() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ФИО:");
        String fullname = sc.nextLine();
        return fullname;
        
    }

    @Override
    public String addTask() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите задачу");
        String newTask = sc.nextLine();
        return newTask;
        
    }

    @Override
    public prioritet addPrioritet() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите приоритет:\n0 - Low;\n1 - Medium\n2 - Urgent");
        int pr = sc.nextInt();
        switch(pr){
            case 0: 
            return prioritet.LOW;
            case 1: 
            return prioritet.MEDIUM;
            case 2:
            return prioritet.URGENT;
            default:
            return prioritet.UNIDENTIFIED;
        }
    }

    public int getDoit() {
        return doit;
    }
    
}
