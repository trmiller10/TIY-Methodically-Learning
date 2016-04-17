//creates a class "Fighter' that can be accessed by any java code anywhere
public class Fighter {

    //creates a string property 'name'
    private String name = "";
    //creates an integer property 'strength' which represents martial prowess
    private int strength = 0;
    //creates an integer property 'defense' which represents survivability
    private int defense = 0;
    //creates an integer property 'intelligence' which represents magical prowess
    private int intelligence = 0;



    //Creates object "Fighter" and sets default values
    public Fighter(String name, int strength, int defense, int intelligence){
        this.name = name;
        this.strength = strength;
        this.defense = defense;
        this.intelligence = intelligence;
    }

    public String getName(){
        return this.name;
    }

    public int getStrength(){
        return this.strength;
    }

    //creates method setIntelligence that sets fighter's Intelligence.
    //Fighters cannot have more than 20 intelligence

    public int getDefense(){
        return this.defense;
    }

    //get fighter's intelligence
    public int getIntelligence(){
        return this.intelligence;
    }


    public void setIntelligence(int intelligence){
        if(intelligence <= 20){
            this.intelligence = intelligence;
        } else {
            System.out.println("You're not playing a fighter to sling fireballs!");
        }
    }



}


