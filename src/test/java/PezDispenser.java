public class PezDispenser {
    private String color;
    private String pezName;
    private String seriesName;
    private int candyCount;
    private final int MAX_CANDIES = 12;

    public PezDispenser(String color, String pezName, String seriesName) {
        this.color = color;
        this.pezName = pezName;
        this.seriesName = seriesName;
        this.candyCount = MAX_CANDIES;
   }

    public String getColor() {
        return color;
    }

    public String getPezName() {
        return pezName;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public int getCandyCount() {
        return candyCount;
    }
    public void eatCandy() {

    }
    public void eatCandies(int candyCount) {

    }
    public void fillDizpenserFully() {

    }
    public void fill() {

    }
    public void fill(int candyCount) {

    }

}
