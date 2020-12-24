
public class Cat
{
    private double originWeight;
    private double weight;
    public static int count = 0;


    private double minWeight;
    private double maxWeight;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count++;

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
        if(weight < minWeight) {
            count --;
            return "Dead";
        }
        else if(weight > maxWeight) {
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