public class Main {
    public static void main(String[] args) {

        Fighter jack = new Fighter("Jack", 80, 70, 12);

        System.out.println("This fighter's name is " + jack.getName() + ". Strength: " + jack.getStrength() + ". Defense: " + jack.getDefense() +
                ". Intelligence: " + jack.getIntelligence() + ". A brawny fellow.");


        Fighter jason = new Fighter("Jason", 90, 50, 20);

        jason.setIntelligence(25);

        System.out.println("This fighter's name is " + jason.getName() + ". Strength: " + jason.getStrength() + ". Defense: " + jason.getDefense() +
                ". Intelligence: " + jason.getIntelligence() + ". A brainy fellow.");


        Monk adrian = new Monk("Adrian", 10, 30, 80);


        System.out.println("This monk's name is " + adrian.getName() + ". Strength: " + adrian.getStrength() + ". Defense: " + adrian.getDefense() +
                ". Intelligence: " + adrian.getIntelligence() + ". Knows what he's doing.");


        Monk caine = new Monk("Caine", 20, 60, 60);

        caine.setStrength(40);

        System.out.println("This monk's name is " + caine.getName() + ". Strength: " + caine.getStrength() + ". Defense: " + caine.getDefense() +
                ". Intelligence: " + caine.getIntelligence() + ". Doesn't talk much.");


        Thief chris = new Thief("Chris", 50, 20, 70);


        System.out.println("This thief's name is " + chris.getName() + ". Strength: " + chris.getStrength() + ". Defense: " + chris.getDefense() +
                ". Intelligence: " + chris.getIntelligence() + ". Sneaky.");


        Thief danny = new Thief("Danny", 30, 30, 80);

        danny.setDefense(50);

        System.out.println("This thief's name is " + danny.getName() + ". Strength: " + danny.getStrength() + ". Defense: " + danny.getDefense() +
                ". Intelligence: " + danny.getIntelligence() + ". Likes backstabbing.");


        Wizard meg = new Wizard("Meg", 10, 10, 140);


        System.out.println("This wizard's name is " + meg.getName() + ". Strength: " + meg.getStrength() + ". Defense: " + meg.getDefense() +
                ". Intelligence: " + meg.getIntelligence() + ". An expert at blowing stuff up.");

        Wizard corbett = new Wizard("Corbett", 20, 20, 100);

        corbett.setIntelligence(90);

        System.out.println("This wizard's name is " + corbett.getName() + ". Strength: " + corbett.getStrength() + ". Defense: " + corbett.getDefense() +
                ". Intelligence: " + corbett.getIntelligence() + ". Tries his best.");


        Cat mukluk = new Cat("Mukluk", 7, 8, 3);

        System.out.println("This cat's name is " + mukluk.getName() + ". Strength: " + mukluk.getStrength() + ". Defense: " + mukluk.getDefense() +
                ". Intelligence: " + mukluk.getIntelligence() + ". A housecat that follows the group around.");

        Cat pepper = new Cat("Pepper", 10, 30, 10);

        pepper.setStrength(30);

        System.out.println("This cat's name is " + pepper.getName() + ". Strength: " + pepper.getStrength() + ". Defense: " + pepper.getDefense() +
                ". Intelligence: " + pepper.getIntelligence() + ". 'Biggest housecat I've ever seen' - Jack.");


    }
}