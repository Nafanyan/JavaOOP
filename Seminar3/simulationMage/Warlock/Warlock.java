package Warlock;

import baseLogic.allObject;
import baseLogic.Mage;

public class Warlock extends Mage {
    public Warlock() {
        super();
        maxHp = 100;
        hp = maxHp;
        maxMana = 200;
        mana = maxMana;
        specialization = "Warlock";
        name = specialization;
    }
    
    public void arrowOfChaos(allObject target){
            if (!manaEmpty(210)){
                System.out.println("Cast Arrow Of Chaos " + "on " + target.name);
                castingMana(210);
                castDamage(400 * manaForce, target);
                hp -= 50;
            } else{
                castDamage(0, target);
            }
    }

    public void curse(allObject target){
        if (!manaEmpty(10)){
            System.out.println("Cast curse " + "on " + target.name);
            castingMana(10);
            castDamage(20 * manaForce, target);
        } else{
            castDamage(0, target);
        }
    }


}
