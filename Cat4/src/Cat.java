
public class Cat
{
    private double originWeight;
    private double weight;
    public static int count = 0;

    public static final int EYES_COUNT = 2;
    public static final int MIN_WEIGHT = 1000;
    public static final int MAX_WEIGHT = 9000;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        count++;

    }
    public void setColor(Color color)
    {

    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
    }


    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public void pee(Double amount)
    {
        weight = weight - 1;
    }

    public Double getWeight()
    {
        return weight;
    }


    public String getStatus()
    {
        if(weight < MIN_WEIGHT) {
            count --;
            return "Dead";
        }
        else if(weight > MAX_WEIGHT) {
            count --;
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
    public static int getCount()
    {
        return count;
    }
}