package Seminar6;

import java.util.LinkedList;

public class StorageSave {
    private int allSweet;
    private int nowSweet;
    private boolean movePlayer;
    private LinkedList<Integer> storageTook;


    public StorageSave(int nowSweet, boolean movePlayer, int allSweet){
        this.nowSweet = nowSweet;
        this.movePlayer = movePlayer;
        this.allSweet = allSweet;
        storageTook = new LinkedList<>();
        storageTook.add(allSweet);
    }

    public void saveNow(int nowSweet, boolean movePlayer){
        this.nowSweet = nowSweet;
        this.movePlayer = movePlayer;
        storageTook.add(nowSweet);
    }
    public int getNowSweet(){
        return nowSweet;
    }
    public boolean getMovePlayer(){
        return movePlayer;
    }
    public int getAllSweet() {
        return allSweet;
    }

    public void getHistori(){
        System.out.println(storageTook);
    }
    
}
