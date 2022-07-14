package Warlock;
import baseLogic.AllObject;
import java.util.ArrayList;


import baseLogic.Mage;

public class Warlock extends Mage {
private ArrayList<Familiars> myrmidons = new ArrayList();

    public Warlock() {
        super();
        maxHp = 100;
        hp = maxHp;
        maxMana = 200;
        mana = maxMana;
        specialization = "Warlock";
        name = specialization;
    }
    
    public void arrowOfChaos(AllObject target){
            if (!manaEmpty(210)){
                System.out.println("Cast Arrow Of Chaos " + "on " + target.name);
                castingMana(210);
                castDamage(400 * manaForce, target);
                hp -= 50;
            } else{
                castDamage(0, target);
            }
            if (hp <= 0){
                System.out.println(specialization + " die");
            }
    }

    public void curse(AllObject target){
        if (!manaEmpty(10)){
            System.out.println("Cast curse " + "on " + target.name);
            castingMana(10);
            castDamage(20 * manaForce, target);
        } else{
            castDamage(0, target);
        }
    }

    public void callMyrmidon(Familiars myrmidon){
        myrmidons.add(myrmidon);
    }

    public void leaveMyrmidon(Familiars myrmidon){
        for (Familiars slave : myrmidons) {
            if (slave == myrmidon){
                myrmidons.remove(slave);
            }
        }
    }




}
