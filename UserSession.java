// Save as: data/UserSession.java
// OOP PRINCIPLE: ENCAPSULATION

package data;

import java.util.ArrayList;
import java.util.List;

public class UserSession {
    private String userName;
    private String nationality;
    private List<String> searchHistory;
    private List<String> receipts;
    
    public UserSession() {
        searchHistory = new ArrayList<String>();
        receipts = new ArrayList<String>();
    }
    
    public void setUserInfo(String name, String nationality) {
        this.userName = name;
        this.nationality = nationality;
    }
    
    public void addSearch(String search) {
        searchHistory.add(search);
    }
    
    public void addReceipt(String receipt) {
        receipts.add(receipt);
    }
    
    // Getters
    public String getUserName() { return userName; }
    public String getNationality() { return nationality; }
    public List<String> getSearchHistory() { return searchHistory; }
    public List<String> getReceipts() { return receipts; }
    
    public void clearHistory() {
        searchHistory.clear();
        receipts.clear();
    }
}