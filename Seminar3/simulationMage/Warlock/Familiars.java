package Warlock;
import baseLogic.*;

public abstract class Familiars extends allObject {
    private Warlock master;

    public Familiars(Warlock master) {
        this.master = master;
    }

    abstract void attack(allObject target);
    abstract void healing (Warlock warlock);
    abstract void ulta(allObject target, Warlock warlock);
    
    
}
