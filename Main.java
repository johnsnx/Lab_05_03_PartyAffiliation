public class Main {
    public static void main(String[] args) {
        // Declarations
        String Party = "D";

        System.out.println("Enter in your party affiliation");

        if (Party == "D") {
            System.out.println("You get a Democratic Donkey!");
        }
        else if (Party == "R") {
            System.out.println("You get a Republican Elephant!");
        }
        else if (Party == "I") {
            System.out.println("You get an Independent Person!");
        }
        else {
            System.out.println("You chose other!");
        }
    }
}