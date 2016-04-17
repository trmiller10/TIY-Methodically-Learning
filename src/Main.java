public class Main {
    public static void main(String[] args){

        Fighter jack = new Fighter("Jack", 80, 70, 12);


        System.out.println("This fighter's name is " + jack.name + ". Strength: "+ jack.strength + ". Defense: " + jack.defense +
                ". Intelligence: " + jack.intelligence + ". A brawny fellow.");


        Fighter jason = new Fighter("Jason", 90, 50, 20);




        Monk adrian = new Monk();

        adrian.name = "Adrian";
        adrian.strength = 10;
        adrian.defense = 30;
        adrian.intelligence = 80;


        System.out.println("This monk's name is " + adrian.name + ". Strength: "+ adrian.strength + ". Defense: " + adrian.defense +
                ". Intelligence: " + adrian.intelligence + ". Knows what he's doing.");


        Monk caine = new Monk();

        caine.name = "Caine";
        caine.strength = 20;
        caine.defense = 60;
        caine.intelligence = 60;



        Thief chris = new Thief();

        chris.name = "Chris";
        chris.strength = 50;
        chris.defense = 20;
        chris.intelligence = 70;



        System.out.println("This thief's name is " + chris.name + ". Strength: "+ chris.strength + ". Defense: " + chris.defense +
                ". Intelligence: " + chris.intelligence + ". Sneaky.");


        Thief danny = new Thief();

        danny.name = "Danny";
        danny.strength = 30;
        danny.defense = 30;
        danny.intelligence = 80;



        Wizard meg = new Wizard();

        meg.name = "Meg";
        meg.strength = 10;
        meg.defense = 10;
        meg.intelligence = 140;


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




        jason.strength = 120;
        jason.defense = 70;
        jason.intelligence = 25;

        System.out.println("This fighter's name is " + jason.name + ". Strength: "+ jason.strength + ". Defense: " + jason.defense +
                ". Intelligence: " + jason.intelligence + ". Really excels in power.");



        caine.name = "Caine";
        caine.strength = 30;
        caine.defense = 80;
        caine.intelligence = 70;



        System.out.println("This monk's name is " + caine.name + ". Strength: "+ caine.strength + ". Defense: " + caine.defense +
                ". Intelligence: " + caine.intelligence + ". Can take several hits.");


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
