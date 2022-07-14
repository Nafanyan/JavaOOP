package baseLogic;
import Druid.Druid;
import Warlock.Warlock;

public class Program {
    public static void main(String[] args) {
        Warlock vegir = new Warlock();
        //vegir.castingMana(200);
        //vegir.getInfo();
        //TargetStone stone = new TargetStone();
        
        //vegir.curse(stone);

        

        Druid v = new Druid();
        v.getInfo();
        vegir.curse(v);
        v.getInfo();
        v.natureShild();
        vegir.curse(v);
        v.getInfo();

       // vegir.getInfo();
  

    }
}
