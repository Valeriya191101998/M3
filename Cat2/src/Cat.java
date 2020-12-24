
public class Cat
{
    private double originWeight;
    private double weight;
    private double foodWeight;


    private double minWeight;
    private double maxWeight;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        foodWeight = 10 + 1000 * Math.random();

    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
        weight = weight + foodWeight;
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

    public Double getFoodWeight()
    {
        return foodWeight;
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}