//creates a class "Wizard" that can be accessed by any java code anywhere
public class Wizard {

    //creates a string property 'name'
    private String name = "";
    //creates an integer property 'defense' which represents survivability
    private int defense = 0;
    //creates an integer property 'strength' which represents martial prowess
    private int strength = 0;
    //creates an integer property 'intelligence' which represents magical prowess
    private int intelligence = 0;

    //Creates object "Wizard" and sets default values
    public Wizard(String name, int strength, int defense, int intelligence){
        this.name = name;
        this.strength = strength;
        this.defense = defense;
        this.intelligence = intelligence;
    }

    //get wizard's name, strength, defense, and intelligence
    public String getName() {
        return this.name;
    }
    public  int getStrength(){
        return this.strength;
    }
    public int getDefense() {
        return this.defense;
    }
    public int getIntelligence() {
        return this.intelligence;
    }

    //set if parameter to
    public void setIntelligence(int intelligence) {
        if (intelligence >= 100) {
            this.intelligence = intelligence;
        } else {
            System.out.println("Dumb wizards usually end up dead wizards.");
        }
    }


}



