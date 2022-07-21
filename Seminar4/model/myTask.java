package model;

import java.util.Date;

public class myTask {

    private String fullName;
    private prioritet level;
    private Date date;
    private String nowTask;
    

    public myTask(String fullName, prioritet level, String nowTask){
        this.fullName = fullName;
        this.level = level;
        this.date = new Date();
        this.nowTask = nowTask;
    }

    @Override
    public String toString() {
        String result;
        result = "Fullname: " + fullName;
        result += "\nPrioritet: " + level;
        result += "\nDate: " + date;
        result += "\nTask: " + nowTask;
        return result;
    }

    public String getFullName() {
        return fullName;
    }

    public prioritet getLevel() {
        return level;
    }

    public Date getDate() {
        return date;
    }

    public String getNowTask() {
        return nowTask;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setLevel(prioritet level) {
        this.level = level;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setNowTask(String nowTask) {
        this.nowTask = nowTask;
    }

}
