public class Warlock extends Mage {
    Warlock() {
        super();
        maxHp = 100;
        hp = maxHp;
        maxMana = 200;
        mana = maxMana;
        specialization = "Warlock";
    }

    public void arrowOfChaos(All target){
            if (!manaEmpty(210)){
                castingMana(210);
                castDamage(400, target);
                hp -= 50;
            } else{
                castDamage(0, target);
            }
    }
    
}
