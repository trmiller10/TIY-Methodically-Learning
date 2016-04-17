//creates a class "Thief" that can be accessed by any java code anywhere
public class Thief {

    //creates a string property 'name'
    private String name = "";
    //creates an integer property 'defense' which represents survivability
    private int defense = 0;
    //creates an integer property 'strength' which represents martial prowess
    private int strength = 0;
    //creates an integer property 'intelligence' which represents magical prowess
    private int intelligence = 0;

    //Creates object "Thief" and sets default values
    public Thief(String name, int strength, int defense, int intelligence){
        this.name = name;
        this.strength = strength;
        this.defense = defense;
        this.intelligence = intelligence;
    }

    //get thief's name, strength, defense, and intelligence
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
    public void setStrength(int strength) {
        if (defense >= 30) {
            this.strength = strength;
        } else {
            System.out.println("If a thief could take a hit they wouldn't have to sneak.");
        }
    }


}

