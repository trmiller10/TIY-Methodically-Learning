//creates a class "Cat" that can be accessed by any java code anywhere
public class Cat{


    //creates a string property 'name'
    private String name = "";
    //creates an integer property 'defense' which represents survivability
    private int defense = 0;
    //creates an integer property 'strength' which represents martial prowess
    private int strength = 0;
    //creates an integer property 'intelligence' which represents magical prowess
    private int intelligence = 0;

    //Creates object "Cat" and sets default values
    public Cat(String name, int strength, int defense, int intelligence){
        this.name = name;
        this.strength = strength;
        this.defense = defense;
        this.intelligence = intelligence;
    }

    //get cat's name, strength, defense, and intelligence
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
        if (strength <= 10) {
            this.strength = strength;
        } else {
            System.out.println("These are housecats, not lions.  Don't tell them that, though.");
        }
    }.


}



