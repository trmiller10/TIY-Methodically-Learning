public class Main {
    public static void main(String[] args){

        Fighter jack = new Fighter("Jack", 80, 70, 12);

        System.out.println("This fighter's name is " + jack.getName() + ". Strength: " + jack.getStrength() + ". Defense: " +jack.getDefense() +
                ". Intelligence: " + jack.getIntelligence() + ". A brawny fellow.");


        Fighter jason = new Fighter("Jason", 90, 50, 20);

        jason.setIntelligence(25);

        System.out.println("This fighter's name is " + jason.getName() + ". Strength: " +jason.getStrength() + ". Defense: " +jason.getDefense() +
                ". Intelligence: " + jason.getIntelligence() + ". A brainy fellow.");



        Monk adrian = new Monk("Adrian", 10, 30, 80);


        System.out.println("This monk's name is " + adrian.getName() + ". Strength: " +adrian.getStrength() + ". Defense: " + adrian.getDefense() +
                ". Intelligence: " + adrian.getIntelligence() +  ". Knows what he's doing.");


        Monk caine = new Monk("Caine", 20, 60, 60);

        caine.setStrength(40);

        System.out.println("This monk's name is " + caine.getName() + ". Strength: " + caine.getStrength() + ". Defense: "  + caine.getDefense() +
                ". Intelligence: " + caine.getIntelligence() + ". Doesn't talk much.");


        Thief chris = new Thief("Chris", 50, 20, 70);



        System.out.println("This thief's name is " + chris.getName() + ". Strength: "+ chris.getStrength() + ". Defense: " + chris.getDefense() +
                ". Intelligence: " + chris.getIntelligence() + ". Sneaky.");


        Thief danny = new Thief("Danny", 30, 30, 80);

        System.out.println("This thief's name is " + danny.getName() + ". Strength: "+ danny.getStrength() + ". Defense: " + danny.getDefense() +
                ". Intelligence: " + danny.getIntelligence() + ". Likes backstabbing.");


        Wizard meg = new Wizard("Meg", 10, 10, 140);


        System.out.println("This wizard's name is " + meg.name + ". Strength: "+ meg.strength + ". Defense: " + meg.defense +
                ". Intelligence: " + meg.intelligence + ". An expert at blowing stuff up.");

        Wizard corbett = new Wizard();

        corbett.name = "Corbett";
        corbett.strength = 60;
        corbett.defense = 50;
        corbett.intelligence = 60;


        System.out.println("This wizard's name is " + corbett.name + ". Strength: "+ corbett.strength + ". Defense: " + corbett.defense +
                ". Intelligence: " + corbett.intelligence + ". In the wrong job.");



        Cat mukluk = new Cat();

        mukluk.name = "Mukluk";
        mukluk.strength = 7;
        mukluk.defense = 8;
        mukluk.intelligence = 3;

        System.out.println("This cat's name is " + mukluk.name + ". Strength: "+ mukluk.strength + ". Defense: " + mukluk.defense +
                ". Intelligence: " + mukluk.intelligence + ". A housecat that follows the group around.");

        Cat pepper = new Cat();

        pepper.name = "Pepper";
        pepper.strength = 30;
        pepper.defense = 30;
        pepper.intelligence = 10;


        System.out.println("This cat's name is " + pepper.name + ". Strength: "+ pepper.strength + ". Defense: " + pepper.defense +
                ". Intelligence: " + pepper.intelligence + ". 'Biggest housecat I've ever seen' - Jack.");









        danny.name = "Danny";
        danny.strength = 30;
        danny.defense = 60;
        danny.intelligence = 100;


        System.out.println("This thief's name is " + danny.name + ". Strength: "+ danny.strength + ". Defense: " + danny.defense +
                ". Intelligence: " + danny.intelligence + ". Likes planning heists and sieges.");


        corbett.name = "Corbett";
        corbett.strength = 80;
        corbett.defense = 80;
        corbett.intelligence = 80;


        System.out.println("This wizard's name is " + corbett.name + ". Strength: "+ corbett.strength + ". Defense: " + corbett.defense +
                ". Intelligence: " + corbett.intelligence + ". Casts 'fist'.");



        pepper.name = "Pepper";
        pepper.strength = 40;
        pepper.defense = 40;
        pepper.intelligence = 15;

        System.out.println("This cat's name is " + pepper.name + ". Strength: "+ pepper.strength + ". Defense: " + pepper.defense +
                ". Intelligence: " + pepper.intelligence + ". 'I don't think this is actually a cat.' - Jack.");


    }
}
