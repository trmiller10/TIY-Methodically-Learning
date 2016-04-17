public class Main {
    public static void main(String[] args) {

        
        //initialize new fighter named Jack, assign values
        Fighter jack = new Fighter("Jack", 80, 70, 12);

        //print line with getters filling in relevant details
        System.out.println("This fighter's name is " + jack.getName() + ". Strength: " + jack.getStrength() + ". Defense: " + jack.getDefense() +
                ". Intelligence: " + jack.getIntelligence() + ". A brawny fellow.");

        //initialize new fighter named Jason, assign values
        Fighter jason = new Fighter("Jason", 90, 50, 20);


        //print line with getters filling in relevant details
        System.out.println("This fighter's name is " + jason.getName() + ". Strength: " + jason.getStrength() + ". Defense: " + jason.getDefense() +
                ". Intelligence: " + jason.getIntelligence() + ". A brainy fellow.");

        //set new property value to trigger constraint statement
        jason.setIntelligence(25);



        //initialize new monk named Adrian, assign values
        Monk adrian = new Monk("Adrian", 10, 30, 80);

        //print line with getters filling in relevant details
        System.out.println("This monk's name is " + adrian.getName() + ". Strength: " + adrian.getStrength() + ". Defense: " + adrian.getDefense() +
                ". Intelligence: " + adrian.getIntelligence() + ". Knows what he's doing.");

        //initialize new monk named Caine, assign values
        Monk caine = new Monk("Caine", 20, 60, 60);

        //print line with getters filling in relevant details
        System.out.println("This monk's name is " + caine.getName() + ". Strength: " + caine.getStrength() + ". Defense: " + caine.getDefense() +
                ". Intelligence: " + caine.getIntelligence() + ". Doesn't talk much.");

        //set new property value to trigger constraint statement
        caine.setStrength(40);




        //initialize new thief named Chris, assign values
        Thief chris = new Thief("Chris", 50, 20, 70);

        //print line with getters filling in relevant details
        System.out.println("This thief's name is " + chris.getName() + ". Strength: " + chris.getStrength() + ". Defense: " + chris.getDefense() +
                ". Intelligence: " + chris.getIntelligence() + ". Sneaky.");

        //initialize new thief named Danny, assign values
        Thief danny = new Thief("Danny", 30, 30, 80);


        //print line with getters filling in relevant details
        System.out.println("This thief's name is " + danny.getName() + ". Strength: " + danny.getStrength() + ". Defense: " + danny.getDefense() +
                ". Intelligence: " + danny.getIntelligence() + ". Likes backstabbing.");

        //set new property value to trigger constraint statement
        danny.setDefense(50);



        //initialize new wizard named Meg, assign values
        Wizard meg = new Wizard("Meg", 10, 10, 140);

        //print line with getters filling in relevant details
        System.out.println("This wizard's name is " + meg.getName() + ". Strength: " + meg.getStrength() + ". Defense: " + meg.getDefense() +
                ". Intelligence: " + meg.getIntelligence() + ". An expert at blowing stuff up.");

        //initialize new wizard named Corbett, assign values
        Wizard corbett = new Wizard("Corbett", 20, 20, 100);


        //print line with getters filling in relevant details
        System.out.println("This wizard's name is " + corbett.getName() + ". Strength: " + corbett.getStrength() + ". Defense: " + corbett.getDefense() +
                ". Intelligence: " + corbett.getIntelligence() + ". Tries his best.");

        //set new property value to trigger constraint statement
        corbett.setIntelligence(90);




        //initialize new cat named Mukluk, assign values
        Cat mukluk = new Cat("Mukluk", 7, 8, 3);

        //print line with getters filling in relevant details
        System.out.println("This cat's name is " + mukluk.getName() + ". Strength: " + mukluk.getStrength() + ". Defense: " + mukluk.getDefense() +
                ". Intelligence: " + mukluk.getIntelligence() + ". A housecat that follows the group around.");

        //initialize new cat named Pepper, assign values
        Cat pepper = new Cat("Pepper", 10, 30, 10);

        //print line with getters filling in relevant details
        System.out.println("This cat's name is " + pepper.getName() + ". Strength: " + pepper.getStrength() + ". Defense: " + pepper.getDefense() +
                ". Intelligence: " + pepper.getIntelligence() + ". 'Biggest housecat I've ever seen' - Jack.");

        //set new property value to trigger constraint statement
        pepper.setStrength(30);

    }
}