import java.util.HashMap;

public abstract class Mage {
    protected int mana;
    protected int maxMana;
    protected int hp;
    protected int maxHp;
    protected int xp;
    protected int nowLevel;
    protected String specialization;
    protected HashMap<String, Integer> skillBranch = new HashMap<>();
    protected int[] levelScale = new int[100];

    Mage() {
        xp = 0;
        nowLevel = 1;
        for (int i = 1; i < levelScale.length; i++) {
            levelScale[i] = levelScale[i - 1] + 10;
        }
    }

    protected void castingMana(int needMane) {
        if (!manaEmpty()) {
            mana -= needMane;
            xp += (int) (needMane * 0.05);
            xp = madeNewLevel(xp);
        } else {
            System.out.println("Not enough mana");
        }
    }

    protected boolean manaEmpty() {
        return mana <= 0;
    }

    protected int madeNewLevel(int nowXp) {
        if (nowXp >= levelScale[nowLevel]) {
            maxHp *= 1.1;
            hp = maxHp;
            maxMana *= 1.1;
            mana = maxMana;
            nowXp = nowXp - levelScale[nowLevel];
            nowLevel++;
            return nowXp;
        } else {
            return nowXp;
        }
    }

    public void rest() {
        mana += 10;
        hp += 10;
    }

    public void getInfo() {
        String info = new String();
        info = String.format("Specialization - %s \nHp - %d, mana - %d \nLevel - %d", specialization,
                hp, mana, nowLevel);
        System.out.println(info);
        System.out.println("Now xp - " + xp);
        System.out.println("Up to a new level of " + (levelScale[nowLevel] - xp) + " units of experience");
        System.out.println();

    }

}
