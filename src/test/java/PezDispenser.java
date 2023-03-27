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

    public void  getCandyCount() {

        System.out.println(candyCount);
    }
    public void eatOneCandy() {
        if (candyCount > 0) {
            candyCount = candyCount - 1;
        }

    }
    public void eatMultiplyCandies(int count) {
        if(count > MAX_CANDIES) {
            System.out.println("Don't have does much");
        } else if (count < 1) {
            System.out.println("Impossible");
        } else if (count > candyCount){
            System.out.println("Impossible");
        } else {
            candyCount -= count;
        }
    }
    public void fillDispenserFully() {
        System.out.println("you just loud " + (MAX_CANDIES - candyCount) + " candy");
        candyCount = MAX_CANDIES;
        System.out.println("PazDispencer is full!");
    }
    public void fill() {
        if (candyCount < MAX_CANDIES) {
            candyCount = candyCount + 1;
        }
    }
    public void loadAnyNumberOfCandies(int count) {
        if(count > MAX_CANDIES) {
            System.out.println("Not space");
        } else if (count < 1) {
            System.out.println("Impossible");
        } else if (count > (MAX_CANDIES - candyCount)){
            System.out.println("Not space");
        } else {
            candyCount += count;
        }

    }

}
/*

Задание: сделать PEZ dispenser (наверняка знаете что это такое)
PEZ dispenser должен иметь возможность:
- отдавать по одной конфетке +
- отдавать любое количество нам нужных конфет +
- загружать целиком недостающие конфеты +
- загружать по одной конфетке +
- загружать любое количество конфет +

Очень важно:
продумать логику чтобы нельзя было съесть больше количество конфет чем реально есть так же как и загрузить и тд

PEZ должен иметь название, цвет и название серии (это может быть MARVEL, MARIO, LOONEY TUNES и тд) - все это надо подавать в конструктор при создании объекта
На выходе должно быть два класса (один с описанием полей, методов нашего класса PezDispenser), второе сам класс где будете создавать объект и играться с методами

Задание отправляйте лично или в новую ветку кидайте
 */