package Druid;
import baseLogic.*;

public class Druid extends Mage {
    public Druid() {
        super();
        maxHp = 90;
        hp = maxHp;
        maxMana = 150;
        mana = maxMana;
        specialization = "Druid";
        name = specialization;
    }
 
    public void natureShild(){
        System.out.println("Cast curse nature shild");
        System.out.println();
        resistance += 10;
    }

    public void natureHeal(){
        if (hp < maxHp){
            hp += 10 * manaForce;
        }
    }

}
