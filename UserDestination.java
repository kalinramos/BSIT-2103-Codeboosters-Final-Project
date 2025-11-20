// Save as: models/UserDestination.java
// OOP PRINCIPLE: INHERITANCE

package models;

public class UserDestination extends Destination {
    private String helpfulFacts;
    
    public UserDestination(String name, String country, double budget, String helpfulFacts) {
        super(name, country, budget, "Custom");
        this.helpfulFacts = helpfulFacts;
    }
    
    @Override
    public String getDescription() {
        return name + " in " + country + " - Budget: $" + budget;
    }
    
    @Override
    public String getCulturalInfo() {
        return helpfulFacts;
    }
    
    @Override
    public String getClimateInfo() {
        return "Climate information not available for custom destinations.";
    }
    
    @Override
    public String getCuisineInfo() {
        return "Cuisine information not available for custom destinations.";
    }
}