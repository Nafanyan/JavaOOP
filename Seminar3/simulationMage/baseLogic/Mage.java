package baseLogic;
import java.util.HashMap;

public abstract class Mage extends allObject{
    protected int mana;
    protected int maxMana;
    protected int xp;
    protected String specialization;
    protected int manaForce;
    protected HashMap<String, Integer> skillBranch = new HashMap<>();
    protected int[] levelScale = new int[100];

    protected Mage() {
        super();
        xp = 0;
        nowLevel = 1;
        manaForce = 1;
        for (int i = 1; i < levelScale.length; i++) {
            levelScale[i] = levelScale[i - 1] + 10;
        }
    }

    protected void castingMana(int needMane){
        if (!manaEmpty(needMane)) {
            mana -= needMane;
        } else {
            System.out.println("Not enough mana");
        }
    }

    protected boolean manaEmpty(int needMana) {
        return mana <= 0 || mana < needMana;
    }

    @Override
    protected void castDamage(int damage, allObject target){
        damage = target.recieveDamage(damage);
        target.hp = target.hp - damage;
        if (target.die()){
            xp += target.xpForDie();
            System.out.println(target.name + " die.");
            System.out.println();
            xp = madeNewLevel(xp);
        }
    }


    protected int madeNewLevel(int nowXp) {
        if (nowXp >= levelScale[nowLevel]) {
            maxHp *= 1.1;
            hp = maxHp;
            maxMana *= 1.1;
            mana = maxMana;
            nowXp = nowXp - levelScale[nowLevel];
            nowLevel++;
            System.out.println("Level " + nowLevel + " has been reached");
            System.out.println();
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

    /* (non-Javadoc)
     * @see All#xpForDie()
     */
    @Override
    int xpForDie() {
        return this.nowLevel + (int) (this.maxHp * 0.5);
    }

    @Override
    int recieveDamage(int damage) {
        return damage - (int)(damage * resistance / 100);
        
    }
}
