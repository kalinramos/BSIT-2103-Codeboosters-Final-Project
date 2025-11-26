# ASEAN Travel Destination Finder
## Description
When planning a vacation/travel, there are several key factors to consider. This includes budgeting, researching, booking, and extensive planning. Just the general overwhelm of decision-making would cause a lot of stress for the travellers. To mitigate this stress, we have come up with the project entitled: “ASEAN Travel Destination Finder”

The main target users of this application are the travellers, as this will help them to find ASEAN countries/destinations to explore by just providing input of basic information such as their budget and travel interests, then the application will suggest destinations that match their given inputs. 

Using the program, the travellers will not be too indulged in so much time researching for the perfect travel destinations that would suit their personal preferences; instead, the program will help them save time as it provides algorithm-based recommendations. The program also supports budget planning as it filters destinations by overall cost, which would help travellers find budget-friendly destinations to luxurious destinations that may suit their budget.

The console application has its 3 main features, which are: (1) Suggests SEA travel destinations based on users’ budget and interest, (2) Enables adding users’ own destinations, and (3) Enables viewing of history.
## OOP Concepts Applied
#### 1. Abstraction
#### 2. Encapsulation
#### 3. Inheritance
#### 4. Polymorphism
## Program Structure
Class Relationship

| Class | Type | Extends | OOP Principle |
| :---- | :--- | :-----: | :-----------: | 
Main | Concrete | | Entry Point |
Destination | Abstract | | Abstraction |
NatureDestination | Concrete | Destination | Inheritance |
BeachDestination | Concrete | Destination |  Inheritance |
UserDestination | Concrete | Destination | Inheritance |
Country | Concrete | | Encapsulation |
UserSession | Concrete | | Encapsulation |
TravelApp | Concrete | | Polymorphism |
DestinationManager | Concrete | | Polymorphism |
## How to Run the Program
### ***Prerequisites***
  Before running the program, ensure you have:
  * Java Development Kit (JDK) 8 or higher installed on your system
* Command Line/Terminal access
* All project files properly organized in the correct folder structure
### ***Verify Java Installation***
Open your terminal/command prompt and check if Java is installed: <br>

java -version<br>
javac -version
* You should see the Java version displayed. If not, download and install JDK from Oracle's website.
### ***Step-by-Step Instructions***
**1. Navigate to Project Directory**<br>
Open your terminal/command prompt and navigate to the project folder:<br>
* **Windows:** cd C:\path\to\ASEANTravelProject <br>
* **Mac/Linux:** cd /path/to/ASEANTravelProject <br>
	
**2. Verify Folder Structure** <br>
Ensure your project has the following structure: <br>
<br>
ASEANTravelProject/ <br>
├── Main.java <br>
├── models/ <br>
│   ├── Destination.java <br>
│   ├── NatureDestination.java <br>
│   ├── BeachDestination.java <br>
│   └── UserDestination.java <br>
├── data/ <br>
│   ├── Country.java <br>
│   └── UserSession.java <br>
├── app/ <br>
│   └── TravelApp.java <br>
└── utils/ <br>
  	  └── DestinationManager.java <br>
<br>
**3. Compile All Java Files** <br>
Compile all the Java source files in one command:<br>
* **Windows:** javac Main.java models\*.java data\*.java app\*.java utils\*.java
* **Mac/Linux:** javac Main.java models/*.java data/*.java app/*.java utils/*.java

***What happens:*** *This command compiles all .java files and generates .class files in the same directories.*<br> 
***Expected Output:*** *If successful, you'll see no error messages and .class files will be created.*

**4. Run the Program** <br>
After successful compilation, run the program: <br>

java Main <br>
<br>
***Expected Output:*** *The program will start and display the welcome banner with the ASEAN Travel Destination Finder logo.*
## Sample Output
## Author and Acknowledgement
**Olivar, John Rafael** - [contribution/role] - Jrozy71 - 24-07295@g.batstate-u.edu.ph

**Patolot, Reigndel Chryster** - [contribution/role] - reigndel08 - 24-00949@g.batstate-u.edu.ph

**Ramos, Kalin Marie Faye** - [contribution/role] - kalinramos - 24-00116@g.batstate-u.edu.ph



