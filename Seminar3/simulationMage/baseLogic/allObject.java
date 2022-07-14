package baseLogic;

 public abstract class allObject {
    public String name;
    protected int hp;
    protected int maxHp;
    protected int resistance; // max value 100 == 100%
    protected int nowLevel;
    
    abstract int xpForDie();
    abstract int recieveDamage(int damage);
    abstract void castDamage(int damage, allObject target);

    boolean die(){
        return hp <= 0;
    }
    

}
