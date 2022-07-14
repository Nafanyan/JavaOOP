package baseLogic;
public class TargetStone extends allObject {
    public TargetStone() {
        super();
        name = "Target Stone";
        hp = 10;
        maxHp = 10;
        nowLevel = 1;
        resistance = 1;
        
    }

    @Override
    int xpForDie() {
        if (this.die()) {
            return nowLevel * maxHp;
        } else {
            return 0;
        }

    }

    @Override
    void castDamage(int damage, allObject target) {}

    @Override
    int recieveDamage(int damage) {
        return 0;
    }
}
