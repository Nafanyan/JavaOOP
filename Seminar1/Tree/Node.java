public class Node {
    public Person person1;
    public Relationship re;
    public Person person2;

    public Node(Person person1, Relationship re, Person persone2) {
        this.person1 = person1;
        this.re = re;
        this.person2 = persone2;
    }

    @Override
    public String toString() {
        return String.format("<%s %s %s>", person1, re, person2);
    }
}
