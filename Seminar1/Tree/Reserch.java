import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class Reserch {
    ArrayList<Node> tree;

    public Reserch(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    private Queue<Person> search(Person p, Relationship rel){
        Queue<Person> result = new LinkedList<Person>();
        result.add(p);
        for (Node node : tree) {
            if(node.p1 == p && node.re == rel){
                result.add(node.p2);
            }
        }
        return result;
    }

    public void printSearch(Person p, Relationship rel){
        Queue<Person> source = search(p, rel);
        System.out.println(source.poll().fullName + " " + rel + ":");
        if(source.isEmpty()){
            System.out.println("Missing in the database.");
        }
        for (Person person : source) {
            System.out.println(" " + person.fullName);
        }
    }
}
