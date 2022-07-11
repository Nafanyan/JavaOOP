
import java.util.ArrayList;

public interface GeoTreeable {

    ArrayList<Node> getTree();

    void append(Person parent, Person children);

}
