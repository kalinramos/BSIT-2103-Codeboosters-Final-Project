// Save as: models/Destination.java
// OOP PRINCIPLE: ABSTRACTION

package models;

public abstract class Destination {
    protected String name;
    protected String country;
    protected double budget;
    protected String type;
    
    public Destination(String name, String country, double budget, String type) {
        this.name = name;
        this.country = country;
        this.budget = budget;
        this.type = type;
    }
    
    // Abstract methods - must be implemented by subclasses
    public abstract String getDescription();
    public abstract String getCulturalInfo();
    public abstract String getClimateInfo();
    public abstract String getCuisineInfo();
    
    // Getters
    public String getName() { return name; }
    public String getCountry() { return country; }
    public double getBudget() { return budget; }
    public String getType() { return type; }
}
