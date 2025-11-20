// Save as: models/BeachDestination.java
// OOP PRINCIPLE: INHERITANCE

package models;

public class BeachDestination extends Destination {
    private String waterActivities;
    
    public BeachDestination(String name, String country, double budget, String waterActivities) {
        super(name, country, budget, "Beach");
        this.waterActivities = waterActivities;
    }
    
    @Override
    public String getDescription() {
        return name + " - A pristine beach paradise perfect for " + waterActivities + 
               ". Budget: $" + budget;
    }
    
    @Override
    public String getCulturalInfo() {
        return "Coastal communities with rich maritime traditions and fishing heritage.";
    }
    
    @Override
    public String getClimateInfo() {
        return "Warm tropical weather with sea breezes. Ideal for beach activities.";
    }
    
    @Override
    public String getCuisineInfo() {
        return "Fresh seafood and coastal delicacies prepared in traditional styles.";
    }
}