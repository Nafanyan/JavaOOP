package Warlock;
import baseLogic.*;

public abstract class Familiars extends AllObject {
    private Warlock master;

    public Familiars(Warlock master) {
        this.master = master;
    }

    abstract void healing (Warlock master);
    abstract void ulta(AllObject target, Warlock master);

    protected void leave(){
        master.leaveMyrmidon(this);
    }

}
