package baseLogic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

import Druid.Druid;
import Warlock.Warlock;

public class Program {
    public static void main(String[] args) {
        Warlock vegir = new Warlock();
        Druid darian = new Druid();
        TargetStone trening = new TargetStone();
        List<Mage> col = new ArrayList<>();
        col.add(vegir);
        col.add(darian);

        vegir.curse(trening);
        vegir.curse(darian);
        darian.natureHeal();
        darian.natureShild();
        vegir.arrowOfChaos(darian);
        

        col.sort(((o1, o2) -> Integer.compare(o2.nowLevel, o1.nowLevel)));
        System.out.println(col);
    }
}
