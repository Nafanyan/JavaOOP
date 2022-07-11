public class Program {
    public static void main(String[] args) {
        Warlock vegir = new Warlock();
        vegir.castingMana(200);
        
        Druid v = new Druid();
        vegir.castDamage(100, v);
  

    }
}
