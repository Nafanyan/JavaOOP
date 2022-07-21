package baseLogic;

 public abstract class AllObject {
    public String name;
    protected int hp;
    protected int maxHp;
    protected int resistance = 0; // max value 100 == 100%
    protected int nowLevel;
    
    abstract int xpForDie();
    abstract void castDamage(int damage, AllObject target);
    
    int recieveDamage(int damage) {
        return damage - (int) (damage * resistance / 100);
    }
    

    boolean die(){
        return hp <= 0;
    }
    

}
