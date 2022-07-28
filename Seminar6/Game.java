package Seminar6;


import java.util.Scanner;

public class Game {
    private int nowSweet;
    private int tookPlayer;
    private boolean movePlayer;
    private StorageSave storage;
    private Scanner sc;

    public Game(int allSweet, boolean playerFirst) {
        nowSweet = allSweet;
        movePlayer = playerFirst;
        storage = new StorageSave(nowSweet, movePlayer, allSweet);

    }

    public void startGame() {
        if (nowSweet > 0) {
            if (movePlayer) {
                movePlayer();
            } else {
                movePC();
            }
        } else {
            if (!movePlayer) {
                System.out.println("Player Win");
            } else {
                System.out.println("PC win");
            }
        }

    }

    private void movePlayer() {
        sc = new Scanner(System.in);
        tookPlayer = sc.nextInt();
        if (tookPlayer <= 0 || tookPlayer > 7) {
            System.out.println("Not valid num sweet, break game?\n0 or 1?");
            sc = new Scanner(System.in);
            int answer = sc.nextInt();
            if (answer == 1) return;
            startGame();
        }
        nowSweet -= tookPlayer;
        saveNow();
        movePlayer = false;
        System.out.println(String.format("You took %s. All sweet %s", tookPlayer, nowSweet));
        startGame();

    }

    private void movePC() {
        if (nowSweet > 0) {
            for (int i = 1; i < 8; i++) {
                if (nowSweet - i == 0 || (nowSweet - i) % 8 == 0) {
                    nowSweet -= i;
                    System.out.println(String.format("PC took %s. All sweet %s", i, nowSweet));
                    saveNow();
                }
            }
        }
        movePlayer = true;
        startGame();

    }

    private void saveNow() {
        storage.saveNow(nowSweet, movePlayer);
    }

    public void loadSave() {
        nowSweet = storage.getNowSweet();
        movePlayer = !storage.getMovePlayer();
        System.out.println("Load save:");
        System.out.println(String.format("Now sweet - %s", nowSweet));
        if (movePlayer) {
            System.out.println("Now move - Player");
        } else {
            System.out.println("Now move - PC");
        }
        startGame();
    }

    public void gameHistory() {
        storage.getHistori();
    }
}
