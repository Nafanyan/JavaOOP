
public class Program {
    public static void main(String[] args) {
        var irina = new Person("Ирина");
        var kesha = new Person("Кеша");
        var vasya = new Person("Вася");
        var masha = new Person("Маша");
        var jane = new Person("Женя");
        var ivan = new Person("Ваня");
        GeoTree gt = new GeoTree();
        gt.append(irina, vasya);
        gt.append(kesha, vasya);
        gt.append(irina, masha);
        gt.append(vasya, jane);
        gt.append(vasya, ivan);
        Reserch reserch = new Reserch(gt);
        reserch.printSearch(jane, Relationship.parent);
        System.out.println();
        reserch.printSearch(kesha, Relationship.parent);

    }
}
