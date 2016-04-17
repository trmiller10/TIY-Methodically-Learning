//creates a class "Fighter' that can be accessed by any java code anywhere
public class Fighter {
    //creates a string property 'name'
    public String name = "";
    //creates an integer property 'strength' which represents martial prowess
    public int strength = 0;
    //creates an integer property 'defense' which represents survivability
    public int defense = 0;
    //creates an integer property 'intelligence' which represents magical prowess
    public int intelligence = 0;

    // Creates a variable to track damage; set to private
    private int receiveDamage = 0;


    //Creates object "Fighter" and sets default values
    public Fighter(String name, int strength, int defense, int intelligence){
        this.name = name;
        this.strength = strength;
        this.defense = defense;
        this.intelligence = intelligence;

    }

    //Allows fighter to receive damage

    public void receiveDamage(){
        this.receiveDamage++;
    }

    //Gets accumulated damage and returns the amount

    public int getReceiveDamage(){
        return this.receiveDamage;
    }

}
