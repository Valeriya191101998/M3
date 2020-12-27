
public class Loader
{
    public static void main(String[] args) {
        Cat murka = new Cat();
        System.out.println("Murka weight :" + murka.getWeight());

        Cat vasya = new Cat();
        System.out.println("Vasya weight :" + vasya.getWeight());
        vasya.feed(vasya.getWeight()/100);
        System.out.println("Vasya weight :" + vasya.getWeight());

        Cat murzik = new Cat();
        System.out.println("Murzik weight :" + murzik.getWeight());
        murzik.feed(murzik.getWeight()/100);
        System.out.println("Murzik weight :" + murzik.getWeight());

        Cat cat1 = new Cat();
        System.out.println(cat1.getWeight());
        cat1.feed(cat1.getWeight()*10);
        System.out.println("Cat1 status: " + cat1.getStatus());


        Cat cat2 = new Cat();
        while (!cat2.getStatus().equals("Dead")) {
            cat2.meow();
        }
        System.out.println("Cat2 status: " + cat2.getStatus());
    }
}