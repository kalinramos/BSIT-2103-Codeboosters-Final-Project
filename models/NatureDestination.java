// Save as: models/NatureDestination.java
// OOP PRINCIPLE: INHERITANCE

package models;

public class NatureDestination extends Destination {
    private String activities;
    
    public NatureDestination(String name, String country, double budget, String activities) {
        super(name, country, budget, "Nature");
        this.activities = activities;
    }
    
    @Override
    public String getDescription() {
        return name + " - A stunning natural paradise featuring " + activities + 
               ". Budget: $" + budget;
    }
    
    @Override
    public String getCulturalInfo() {
        return "Local communities practice eco-tourism and preserve natural heritage.";
    }
    
    @Override
    public String getClimateInfo() {
        return "Tropical climate with lush greenery year-round. Best visited during dry season.";
    }
    
    @Override
    public String getCuisineInfo() {
        return "Fresh local produce and traditional dishes made with natural ingredients.";
    }
}
