// Save as: data/Country.java
// OOP PRINCIPLE: ENCAPSULATION

package data;

import models.Destination;
import java.util.ArrayList;
import java.util.List;

public class Country {
    private String name;
    private String greeting;
    private List<Destination> destinations;
    
    public Country(String name, String greeting) {
        this.name = name;
        this.greeting = greeting;
        this.destinations = new ArrayList<Destination>();
    }
    
    public void addDestination(Destination dest) {
        destinations.add(dest);
    }
    
    // Getters
    public String getName() { return name; }
    public String getGreeting() { return greeting; }
    public List<Destination> getDestinations() { return destinations; }
}