public class MainClass {
    public static void main(String[] args) {
        PezDispenser superman = new PezDispenser("blue","Superman", "DC");
        System.out.println(superman.getPezName());
        superman.eatOneCandy();
        superman.eatMultiplyCandies(5);
        superman.fillDispenserFully();
        superman.getCandyCount();
        superman.fill();
        superman.getCandyCount();
        superman.loadAnyNumberOfCandies(3);
        superman.getCandyCount();
      }
}


