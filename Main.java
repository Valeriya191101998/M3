import com.skillbox.airport.Aircraft;
import com.skillbox.airport.Airport;

import java.util.TreeMap;


public class Main {
    public static void main(String[] args)
    {
        Airport airport = Airport.getInstance();
        airport.getAllAircrafts();
        System.out.println(airport.getAllAircrafts());
    }

}
