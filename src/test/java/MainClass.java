public class MainClass {
    public static void main(String[] args) {
        PezDispenser superman = new PezDispenser("blue","Superman", "DC");
        System.out.println(superman.getPezName());
        superman.eatCandies(10);
      }
}


