package app;
import java.util.*;
import models.*;
import data.*;

public class TravelApp {
    private Scanner sc;
    private Map<String, Country> countries;
    private UserSession session;
    private List<Destination> userDestinations;
    
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
    public static final String BOLD = "\u001B[1m";
   
    private static final int WIDTH = 150;
    private static final int width = 200;
    
    public TravelApp() {
        sc = new Scanner(System.in);
        countries = new HashMap<String, Country>();
        session = new UserSession();
        userDestinations = new ArrayList<Destination>();
        initializeCountries();
    }
    
    private void initializeCountries() {
        Country ph = new Country("Philippines", "Mabuhay! Welcome to the Philippines!");
        ph.addDestination(new NatureDestination("Banaue Rice Terraces", "Philippines", 1500, 
            "ancient rice terraces and mountain hiking"));
        ph.addDestination(new NatureDestination("Chocolate Hills", "Philippines", 1500, 
            "unique geological formations and scenic views"));
        ph.addDestination(new BeachDestination("Boracay", "Philippines", 3000, 
            "swimming, diving, and water sports"));
        ph.addDestination(new BeachDestination("El Nido", "Philippines", 4000, 
            "island hopping and snorkeling"));
        
        Country th = new Country("Thailand", "Sawasdee! Welcome to Thailand!");
        th.addDestination(new NatureDestination("Khao Sok National Park", "Thailand", 600, 
            "jungle trekking and wildlife viewing"));
        th.addDestination(new NatureDestination("Doi Inthanon", "Thailand", 550, 
            "mountain peaks and waterfalls"));
        th.addDestination(new BeachDestination("Phuket", "Thailand", 900, 
            "diving and beach relaxation"));
        th.addDestination(new BeachDestination("Koh Samui", "Thailand", 850, 
            "swimming and sunset viewing"));
        
        Country vn = new Country("Vietnam", "Xin chào! Welcome to Vietnam!");
        vn.addDestination(new NatureDestination("Ha Long Bay", "Vietnam", 700, 
            "limestone karsts and cave exploration"));
        vn.addDestination(new NatureDestination("Sapa", "Vietnam", 500, 
            "mountain trekking and terraced fields"));
        vn.addDestination(new BeachDestination("Nha Trang", "Vietnam", 600, 
            "beach activities and island tours"));
        vn.addDestination(new BeachDestination("Phu Quoc", "Vietnam", 750, 
            "swimming and water sports"));
        
        Country id = new Country("Indonesia", "Selamat datang! Welcome to Indonesia!");
        id.addDestination(new NatureDestination("Mount Bromo", "Indonesia", 650, 
            "volcano hiking and sunrise views"));
        id.addDestination(new NatureDestination("Komodo Island", "Indonesia", 900, 
            "komodo dragons and wildlife"));
        id.addDestination(new BeachDestination("Bali Beaches", "Indonesia", 800, 
            "surfing and beach clubs"));
        id.addDestination(new BeachDestination("Gili Islands", "Indonesia", 700, 
            "snorkeling and diving"));
        
        Country my = new Country("Malaysia", "Selamat datang! Welcome to Malaysia!");
        my.addDestination(new NatureDestination("Cameron Highlands", "Malaysia", 500, 
            "tea plantations and cool climate"));
        my.addDestination(new NatureDestination("Taman Negara", "Malaysia", 600, 
            "rainforest trekking and canopy walks"));
        my.addDestination(new BeachDestination("Langkawi", "Malaysia", 750, 
            "island hopping and water sports"));
        my.addDestination(new BeachDestination("Perhentian Islands", "Malaysia", 650, 
            "diving and snorkeling"));
        
        Country sg = new Country("Singapore", "Welcome to Singapore!");
        sg.addDestination(new NatureDestination("Gardens by the Bay", "Singapore", 400, 
            "futuristic gardens and skyway walks"));
        sg.addDestination(new NatureDestination("MacRitchie Reservoir", "Singapore", 300, 
            "nature trails and tree top walks"));
        sg.addDestination(new BeachDestination("Sentosa Island", "Singapore", 500, 
            "beach activities and attractions"));
        sg.addDestination(new BeachDestination("East Coast Park", "Singapore", 250, 
            "cycling and beach sports"));
        
        Country bn = new Country("Brunei", "Selamat datang! Welcome to Brunei!");
        bn.addDestination(new NatureDestination("Ulu Temburong", "Brunei", 550, 
            "pristine rainforest and canopy walks"));
        bn.addDestination(new NatureDestination("Tasek Lama", "Brunei", 300, 
            "waterfalls and jungle trails"));
        bn.addDestination(new BeachDestination("Muara Beach", "Brunei", 400, 
            "swimming and picnics"));
        bn.addDestination(new BeachDestination("Serasa Beach", "Brunei", 350, 
            "water sports and beach activities"));
        
        Country la = new Country("Laos", "Sabaidee! Welcome to Laos!");
        la.addDestination(new NatureDestination("Kuang Si Falls", "Laos", 400, 
            "stunning waterfalls and swimming"));
        la.addDestination(new NatureDestination("Plain of Jars", "Laos", 450, 
            "ancient stone jars and archaeology"));
        la.addDestination(new BeachDestination("Don Det", "Laos", 350, 
            "river activities and relaxation"));
        la.addDestination(new BeachDestination("Vang Vieng", "Laos", 500, 
            "river tubing and kayaking"));
        
        Country mm = new Country("Myanmar", "Mingalaba! Welcome to Myanmar!");
        mm.addDestination(new NatureDestination("Inle Lake", "Myanmar", 600, 
            "floating gardens and traditional villages"));
        mm.addDestination(new NatureDestination("Hkakabo Razi", "Myanmar", 800, 
            "mountain trekking and wilderness"));
        mm.addDestination(new BeachDestination("Ngapali Beach", "Myanmar", 700, 
            "pristine beaches and swimming"));
        mm.addDestination(new BeachDestination("Ngwe Saung", "Myanmar", 650, 
            "beach relaxation and seafood"));
        
        Country kh = new Country("Cambodia", "Chum reap suor! Welcome to Cambodia!");
        kh.addDestination(new NatureDestination("Cardamom Mountains", "Cambodia", 550, 
            "wildlife and jungle trekking"));
        kh.addDestination(new NatureDestination("Bokor National Park", "Cambodia", 500, 
            "mountain views and abandoned buildings"));
        kh.addDestination(new BeachDestination("Sihanoukville", "Cambodia", 600, 
            "beach life and island hopping"));
        kh.addDestination(new BeachDestination("Koh Rong", "Cambodia", 650, 
            "white sand beaches and diving"));
        
        countries.put("1", ph);
        countries.put("2", th);
        countries.put("3", vn);
        countries.put("4", id);
        countries.put("5", my);
        countries.put("6", sg);
        countries.put("7", bn);
        countries.put("8", la);
        countries.put("9", mm);
        countries.put("10", kh);
    }
    
    private void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                System.out.print("\033[H\033[2J");
                System.out.flush();
        } catch (Exception e) {
            for (int i = 0; i < 50; i++) System.out.println();
        }
    }
    
    private String createLine(String symbol, int length) {
        return symbol.repeat(length);
    }
    
    private String centerText(String text, int width) {
        int padding = (width - text.length()) / 2;
        return " ".repeat(Math.max(0, padding)) + text;
    }
    
    private boolean displayWelcomeBanner() {
        clearScreen();
        System.out.println(PURPLE);
        System.out.println("\n" + createLine("=", WIDTH));
        System.out.println(createLine("=", WIDTH) + RESET);
        System.out.println(CYAN + centerText("█████╗ ███████╗███████╗ █████╗ ███╗   ██╗", WIDTH));
        System.out.println(centerText("██╔══██╗██╔════╝██╔════╝██╔══██╗████╗  ██║", WIDTH));
        System.out.println(centerText("███████║███████╗█████╗  ███████║██╔██╗ ██║", WIDTH));
        System.out.println(centerText("██╔══██║╚════██║██╔══╝  ██╔══██║██║╚██╗██║", WIDTH));
        System.out.println(centerText("██║  ██║███████║███████╗██║  ██║██║ ╚████║", WIDTH));
        System.out.println(centerText("╚═╝  ╚═╝╚══════╝╚══════╝╚═╝  ╚═╝╚═╝  ╚═══╝", WIDTH));
        System.out.println();
        System.out.println(centerText("████████╗██████╗  █████╗ ██╗   ██╗███████╗██╗     ", WIDTH));
        System.out.println(centerText("╚══██╔══╝██╔══██╗██╔══██╗██║   ██║██╔════╝██║     ", WIDTH));
        System.out.println(centerText("   ██║   ██████╔╝███████║██║   ██║█████╗  ██║     ", WIDTH));
        System.out.println(centerText("   ██║   ██╔══██╗██╔══██║╚██╗ ██╔╝██╔══╝  ██║     ", WIDTH));
        System.out.println(centerText("   ██║   ██║  ██║██║  ██║ ╚████╔╝ ███████╗███████╗", WIDTH));
        System.out.println(centerText("   ╚═╝   ╚═╝  ╚═╝╚═╝  ╚═╝  ╚═══╝  ╚══════╝╚══════╝", WIDTH) + RESET);
        System.out.println();
        System.out.println(YELLOW + centerText("  D E S T I N A T I O N   F I N D E R  ", WIDTH));
        System.out.println(PURPLE + createLine("=", WIDTH));
        System.out.println(createLine("=", WIDTH) + RESET);
        System.out.print("\n" + BOLD + centerText("Press Enter to continue...", WIDTH) + RESET);
        sc.nextLine();
        return true;
    }
    
    public String displayMainMenu() {
        clearScreen();
        System.out.println(CYAN + BOLD);
        System.out.println("\n╔" + "═".repeat(WIDTH) + "╗");
        System.out.println(centerText("MAIN MENU", WIDTH));
        System.out.println("╠" + "═".repeat(WIDTH) + "╣" + RESET);
        
        String[][] menuItems = {
            {"[1]", "Looking for a travel destination", ""},
            {"[2]", "Add your own destination", ""},
            {"[3]", "History", ""},
            {"[4]", "Terminate the Program", ""}
        };
        
        for (int i = 0; i < menuItems.length; i++) {
            String color = (i == 0) ? GREEN : (i == 1) ? YELLOW : (i == 2) ? PURPLE : RED;
            String num = menuItems[i][0];
            String text = menuItems[i][1];
            String emoji = menuItems[i][2];
            
            String fullText = "   " + num + "  " + text + " " + emoji;
            int padding = WIDTH - fullText.length();
            System.out.println(CYAN + "║" + RESET + color + fullText + " ".repeat(Math.max(0, padding)) + CYAN + "║" + RESET);
            System.out.println(CYAN + "║" + " ".repeat(WIDTH) + "║" + RESET);
        }
        
        System.out.println(CYAN + "╚" + "═".repeat(WIDTH) + "╝" + RESET);
        System.out.print("\n" + CYAN + WHITE + centerText("Enter your choice: ", WIDTH + 2) + RESET);
        return sc.nextLine().trim();
    }
    
    private void lookingForDestination() {
        clearScreen();
        System.out.println(CYAN + BOLD);
        System.out.println("\n" + createLine("─", WIDTH));
        System.out.println(centerText("  LOOKING FOR A TRAVEL DESTINATION", WIDTH));
        System.out.println(createLine("─", WIDTH) + RESET);
        
        System.out.println("\n" + YELLOW + BOLD + centerText("Which ASEAN country are you planning to go to?", WIDTH) + RESET);
        System.out.println(centerText(GREEN + "1. Philippines" + RESET + "    " + GREEN + "2. Thailand" + RESET + "      " + GREEN + "3. Vietnam" + RESET + "       " + GREEN + "4. Indonesia" + RESET + "    " + GREEN + "5. Malaysia" + RESET, width));
        System.out.println(centerText(GREEN + "6. Singapore" + RESET + "     " + GREEN + "7. Brunei" + RESET + "        " + GREEN + "8. Laos" + RESET + "           " + GREEN + "9. Myanmar" + RESET + "      " + GREEN + "10. Cambodia" + RESET, width));
        System.out.print(BOLD + "\n" + centerText("Enter number: ", WIDTH) + RESET);
        
        String countryChoice = sc.nextLine().trim();
        Country selectedCountry = countries.get(countryChoice);
        
        if (selectedCountry == null) {
            System.out.println("\n" + RED + centerText(" Invalid country selection.", WIDTH) + RESET);
            System.out.print("\n" + centerText("Press Enter to return to main menu...", WIDTH));
            sc.nextLine();
            return;
        }
        
        System.out.println("\n" + CYAN + BOLD + createLine("═", WIDTH));
        System.out.println(centerText(selectedCountry.getGreeting(), WIDTH));
        System.out.println(createLine("═", WIDTH) + RESET);
        System.out.print("\n" + WHITE + centerText("Press Enter to continue...", WIDTH) + RESET);
        sc.nextLine();
        
        System.out.print("\n" + YELLOW + BOLD + centerText("Enter your estimated budget($): ", WIDTH) + RESET);
        double budget = 0;
        try {
            budget = Double.parseDouble(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println(RED + centerText("Invalid budget. Returning to main menu.", WIDTH) + RESET);
            System.out.print("\n" + centerText("Press Enter to continue...", WIDTH));
            sc.nextLine();
            return;
        }
        
        System.out.println("\n" + YELLOW + BOLD + centerText("What are you interested in?", WIDTH) + RESET);
        System.out.println(centerText(GREEN + "1. Nature " + RESET, WIDTH));
        System.out.println(centerText(BLUE + "2. Beach " + RESET, WIDTH));
        System.out.print(BOLD + centerText("Enter number: ", WIDTH) + RESET);
        String interestChoice = sc.nextLine().trim();
        
        String interest = interestChoice.equals("1") ? "Nature" : "Beach";
        String interestColor = interestChoice.equals("1") ? GREEN : BLUE;
        
        List<Destination> matching = new ArrayList<Destination>();
        for (Destination dest : selectedCountry.getDestinations()) {
            if (dest.getType().equals(interest) && dest.getBudget() <= budget) {
                matching.add(dest);
            }
        }
        
        if (matching.isEmpty()) {
            System.out.println("\n" + RED + centerText("No destinations found within your budget and interest.", WIDTH) + RESET);
            System.out.print("\n" + centerText("Press Enter to return to main menu...", WIDTH));
            sc.nextLine();
            return;
        }
        
        System.out.println("\n" + PURPLE + BOLD + createLine("═", WIDTH));
        System.out.println(centerText(" SUGGESTED DESTINATIONS ", WIDTH));
        System.out.println(createLine("═", WIDTH) + RESET);
        
        for (int i = 0; i < Math.min(2, matching.size()); i++) {
            Destination dest = matching.get(i);
            System.out.println("\n" + centerText(interestColor + BOLD + "[" + (i + 1) + "] " + dest.getName() + RESET, WIDTH));
            System.out.println(centerText(WHITE + "Country: " + CYAN + dest.getCountry() + RESET, WIDTH));
            System.out.println(centerText(WHITE + "Budget: " + YELLOW + "$" + dest.getBudget() + RESET, WIDTH));
            System.out.println(centerText(WHITE + "Description: " + GREEN + dest.getDescription() + RESET, WIDTH));
            System.out.println(centerText(WHITE + createLine("─", 65) + RESET, WIDTH));
        }
        
        System.out.print("\n" + BOLD + centerText("Choose a destination (1 or 2): ", WIDTH) + RESET);
        int destChoice = -1;
        try {
            destChoice = Integer.parseInt(sc.nextLine().trim()) - 1;
        } catch (NumberFormatException e) {
            System.out.println(RED + centerText("Invalid choice.", WIDTH) + RESET);
            System.out.print("\n" + centerText("Press Enter to continue...", WIDTH));
            sc.nextLine();
            return;
        }
        
        if (destChoice < 0 || destChoice >= Math.min(2, matching.size())) {
            System.out.println("\n" + RED + centerText(" Invalid choice.", WIDTH) + RESET);
            System.out.print("\n" + centerText("Press Enter to return to main menu...", WIDTH));
            sc.nextLine();
            return;
        }
        
        Destination chosen = matching.get(destChoice);
        session.addSearch(chosen.getName() + " - " + chosen.getCountry());
        
        System.out.print("\n" + YELLOW + BOLD + centerText("Would you like to view additional details? (yes/no): ", WIDTH) + RESET);
        String viewDetails = sc.nextLine().trim().toLowerCase();
        
        if (viewDetails.equals("yes")) {
            showDestinationDetails(chosen, selectedCountry.getName(), budget, interest);
        } else {
            generateReceipt(chosen, selectedCountry.getName(), budget, interest);
        }
    }
    
    private void showDestinationDetails(Destination dest, String country, double budget, String interest) {
        while (true) {
            clearScreen();
            System.out.println(PURPLE + BOLD);
            System.out.println("\n" + createLine("═", WIDTH));
            System.out.println(centerText(" ON-THE-GROUND KNOWLEDGE ", WIDTH));
            System.out.println(createLine("═", WIDTH) + RESET);
            System.out.println("\n" + centerText(GREEN + "[1] Cultural Descriptions " + RESET, WIDTH));
            System.out.println(centerText(BLUE + "[2] Usual Climate/Weather " + RESET, WIDTH));
            System.out.println(centerText(YELLOW + "[3] Cuisine " + RESET, WIDTH));
            System.out.println(centerText(CYAN + "[4] Main Menu " + RESET, WIDTH));
            System.out.print(BOLD + "\n" + centerText("Enter choice: ", WIDTH) + RESET);
            
            String choice = sc.nextLine().trim();
            
            if (choice.equals("1")) {
                System.out.println("\n" + GREEN + BOLD + createLine("═", WIDTH));
                System.out.println(centerText("CULTURAL INFORMATION", WIDTH));
                System.out.println(createLine("═", WIDTH) + RESET);
                System.out.println(centerText(WHITE + dest.getCulturalInfo() + RESET, WIDTH));
                if (!askContinue()) return;
            } else if (choice.equals("2")) {
                System.out.println("\n" + BLUE + BOLD + createLine("═", WIDTH));
                System.out.println(centerText("CLIMATE INFORMATION", WIDTH));
                System.out.println(createLine("═", WIDTH) + RESET);
                System.out.println(centerText(WHITE + dest.getClimateInfo() + RESET, WIDTH));
                if (!askContinue()) return;
            } else if (choice.equals("3")) {
                System.out.println("\n" + YELLOW + BOLD + createLine("═", WIDTH));
                System.out.println(centerText("CUISINE INFORMATION", WIDTH));
                System.out.println(createLine("═", WIDTH) + RESET);
                System.out.println(centerText(WHITE + dest.getCuisineInfo() + RESET, WIDTH));
                if (!askContinue()) return;
            } else if (choice.equals("4")) {
                return;
            } else if (choice.equals("5")) {
                displayExitMessage();
                System.exit(0);
            } else {
                System.out.println("\n" + RED + centerText(" Invalid choice.", WIDTH) + RESET);
                System.out.print(centerText("Press Enter to continue...", WIDTH));
                sc.nextLine();
            }
        }
    }
    
    private boolean askContinue() {
        System.out.print("\n" + YELLOW + BOLD + centerText("Do you want to continue viewing details? (yes/no): ", WIDTH) + RESET);
        return sc.nextLine().trim().toLowerCase().equals("yes");
    }
    
    private void generateReceipt(Destination dest, String country, double budget, String interest) {
        System.out.println("\n" + CYAN + BOLD + createLine("═", WIDTH));
        System.out.println(centerText(" TRAVEL SUMMARY ", WIDTH));
        System.out.println(createLine("═", WIDTH) + RESET);
        System.out.println(centerText(YELLOW + "Destination: " + RESET + GREEN + dest.getName() + RESET, WIDTH));
        System.out.println(centerText(YELLOW + "Country: " + RESET + GREEN + country + RESET, WIDTH));
        System.out.println(centerText(YELLOW + "Your Budget: " + RESET + GREEN + "$" + budget + RESET, WIDTH));
        System.out.println(centerText(YELLOW + "Interest: " + RESET + GREEN + interest + RESET, WIDTH));
        System.out.println(centerText(YELLOW + "Estimated Cost: " + RESET + GREEN + "$" + dest.getBudget() + RESET, WIDTH));
        
        System.out.println("\n" + PURPLE + BOLD + createLine("═", WIDTH));
        System.out.println(centerText(" TRAVEL TIPS ", WIDTH));
        System.out.println(createLine("═", WIDTH) + RESET);
        System.out.println(centerText(WHITE + " Book accommodations in advance" + RESET, WIDTH));
        System.out.println(centerText(WHITE + " Check visa requirements" + RESET, WIDTH));
        System.out.println(centerText(WHITE + " Get travel insurance" + RESET, WIDTH));
        System.out.println(centerText(WHITE + " Respect local customs" + RESET, WIDTH));
        System.out.println(centerText(WHITE + " Keep emergency contacts handy" + RESET, WIDTH));
        System.out.println(CYAN + createLine("═", WIDTH) + RESET);
        
        String receipt = "\n========== TRAVEL SUMMARY ==========\n" +
                        "Destination: " + dest.getName() + "\n" +
                        "Country: " + country + "\n" +
                        "Budget: ($)" + budget + "\n" +
                        "Interest: " + interest + "\n" +
                        "\n ========== TRAVEL TIPS ==========\n" +
                        "- Book accommodations in advance\n" +
                        "- Check visa requirements\n" +
                        "- Get travel insurance\n" +
                        "- Respect local customs\n" +
                        "- Keep emergency contacts handy\n" +
                        "===================================";
        
        session.addReceipt(receipt);
        System.out.print("\n" + WHITE + centerText("Press Enter to return to main menu...", WIDTH) + RESET);
        sc.nextLine();
    }
    
    private void addOwnDestination() {
        clearScreen();
        System.out.println(YELLOW + BOLD);
        System.out.println("\n" + createLine("─", WIDTH));
        System.out.println(centerText("  ADD YOUR OWN DESTINATION", WIDTH));
        System.out.println(createLine("─", WIDTH) + RESET);
        
        System.out.print("\n" + centerText(CYAN + "Enter your name: " + RESET, WIDTH));
        String name = sc.nextLine().trim();
        
        System.out.print(centerText(CYAN + "Enter your nationality: " + RESET, WIDTH));
        String nationality = sc.nextLine().trim();
        
        session.setUserInfo(name, nationality);
        
        System.out.print("\n" + centerText(GREEN + "Enter place name: " + RESET, WIDTH));
        String placeName = sc.nextLine().trim();
        
        System.out.print(centerText(GREEN + "Enter country: " + RESET, WIDTH));
        String country = sc.nextLine().trim();
        
        System.out.print(centerText(GREEN + "Enter required budget($): " + RESET, WIDTH));
        double budget = 0;
        try {
            budget = Double.parseDouble(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println(RED + centerText("Invalid budget. Destination not saved.", WIDTH) + RESET);
            System.out.print("\n" + centerText("Press Enter to continue...", WIDTH));
            sc.nextLine();
            return;
        }
        
        System.out.print(centerText(GREEN + "Enter helpful facts: " + RESET, WIDTH));
        String facts = sc.nextLine().trim();
        
        System.out.print("\n" + YELLOW + BOLD + centerText("Save this destination? (yes/no): ", WIDTH) + RESET);
        String save = sc.nextLine().trim().toLowerCase();
        
        if (save.equals("yes")) {
            UserDestination userDest = new UserDestination(placeName, country, budget, facts);
            userDestinations.add(userDest);
            System.out.println("\n" + GREEN + centerText(" Destination saved successfully!", WIDTH) + RESET);
        } else {
            System.out.println("\n" + RED + centerText(" Destination not saved.", WIDTH) + RESET);
        }
                String receipt = "\n========== OWN DESTINATION ==========\n" +
                        "Destination: " + name + "\n" +
                        "Country: " + nationality + "\n" +
                        "Budget: ($)" + placeName + "\n" +
                        "Interest: " + country + "\n" +
                        "Detail: " + budget + "\n" +
                         "Destination: " + facts + "\n" +
                        "\n ========== TRAVEL TIPS ==========\n" +
                        "- Book accommodations in advance\n" +
                        "- Check visa requirements\n" +
                        "- Get travel insurance\n" +
                        "- Respect local customs\n" +
                        "- Keep emergency contacts handy\n" +
                        "===================================";

        session.addReceipt(receipt);
        System.out.print("\n" + WHITE + centerText("Press Enter to return to main menu...", WIDTH) + RESET);
        sc.nextLine();
    }
    
    private void viewHistory() {
        clearScreen();
        System.out.println(PURPLE + BOLD);
        System.out.println("\n" + createLine("─", WIDTH));
        System.out.println(centerText("  HISTORY", WIDTH));
        System.out.println(createLine("─", WIDTH) + RESET);
        
        System.out.println("\n" + centerText(GREEN + "[1] Receipt " + RESET, WIDTH));
        System.out.println(centerText(BLUE + "[2] Search History " + RESET, WIDTH));
        System.out.println(centerText(RED + "[3] Delete History " + RESET, WIDTH));
        System.out.print(BOLD + centerText("Enter choice: ", WIDTH) + RESET);
        
        String choice = sc.nextLine().trim();
        
        if (choice.equals("1")) {
            System.out.println("\n" + CYAN + BOLD + createLine("═", WIDTH));
            System.out.println(centerText("YOUR RECEIPTS", WIDTH));
            System.out.println(createLine("═", WIDTH) + RESET);
            if (session.getReceipts().isEmpty()) {
                System.out.println(centerText(YELLOW + "No receipts available." + RESET, WIDTH));
            } else {
                for (int i = 0; i < session.getReceipts().size(); i++) {
                    System.out.println("\n" + centerText(GREEN + "Receipt " + (i + 1) + ":" + RESET, WIDTH));
                    System.out.println(centerText(WHITE + session.getReceipts().get(i) + RESET, WIDTH));
                }
            }
        } else if (choice.equals("2")) {
            System.out.println("\n" + CYAN + BOLD + createLine("═", WIDTH));
            System.out.println(centerText("SEARCH HISTORY", WIDTH));
            System.out.println(createLine("═", WIDTH) + RESET);
            if (session.getSearchHistory().isEmpty()) {
                System.out.println(centerText(YELLOW + "No search history." + RESET, WIDTH));
            } else {
                for (int i = 0; i < session.getSearchHistory().size(); i++) {
                    System.out.println(centerText(GREEN + (i + 1) + ". " + RESET + WHITE + session.getSearchHistory().get(i) + RESET, WIDTH));
                    System.out.println(centerText(GREEN + (i + 1) + ". " + RESET + WHITE + session.getReceipts().get(i) + RESET, WIDTH));
                }
            }
        } else if (choice.equals("3")) {
            session.clearHistory();
            System.out.println("\n" + GREEN + centerText(" History deleted successfully!", WIDTH) + RESET);
        } else {
            System.out.println("\n" + RED + centerText(" Invalid choice.", WIDTH) + RESET);
        }
        
        System.out.print("\n" + YELLOW + BOLD + centerText("Return to Main Menu? (yes/no): ", WIDTH) + RESET);
        String returnMenu = sc.nextLine().trim().toLowerCase();
        
        if (!returnMenu.equals("yes")) {
            displayExitMessage();
            System.exit(0);
        }
    }
    
    private void displayExitMessage() {
        clearScreen();
        System.out.println(CYAN + BOLD);
        System.out.println("\n" + createLine("═", WIDTH));
        System.out.println(centerText("  Thank you for using ASEAN Travel Finder!  ", WIDTH));
        System.out.println(centerText("  Safe travels and happy adventures!  ", WIDTH));
        System.out.println(createLine("═", WIDTH) + RESET);
    }
    
    public boolean processChoice(String choice) {
        switch (choice) {
            case "1":
                lookingForDestination();
                return true;
            case "2":
                addOwnDestination();
                return true;
            case "3":
                viewHistory();
                return true;
            case "4":
                displayExitMessage();
                return false;
            default:
                System.out.println("\n" + RED + centerText("  Invalid choice. Please try again.", WIDTH) + RESET);
                System.out.print("\n" + centerText("Press Enter to return to main menu...", WIDTH));
                sc.nextLine();
                return true;
        }
    }
    
    public int run() {
        displayWelcomeBanner();
        
        boolean continueProgram = true;
        while (continueProgram) {
            String choice = displayMainMenu();
            continueProgram = processChoice(choice);
        }
        
        return 0;
    }
    
    public static void main(String[] args) {
        TravelApp app = new TravelApp();
        app.run();
    }
}
