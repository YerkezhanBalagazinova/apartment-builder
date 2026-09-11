package SPD_asnmnt1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Apartment apartment1 = new StandardApartmentBuilder().build(); // shows apartment w def values
        System.out.println(apartment1);
        Apartment luxuryApartment = new LuxuryApartmentBuilder() // method chaining
                .setPanoramicView(true).setPenthouse(true).setRooms(5).setFloor(9).setFurniture("Modern").setAppliances("Premium")
                .setInterior("Neoclassic").setBalcony(true).setSmartHome(true).setHeating("Electric").build();
        System.out.println(luxuryApartment);

        ApartmentDirector director = new ApartmentDirector();
        Scanner scanner = new Scanner(System.in);
        Apartment economy = director.createEconomyApartment();
        Apartment comfort = director.createComfortApartment();
        Apartment premium = director.createPremiumApartment();

        while (true) {
            System.out.println("Choose apartment class:");
            System.out.println("1-Economy");
            System.out.println("2-Comfort");
            System.out.println("3-Premium");
            System.out.print("Enter your choice: ");
            try {
                int choice = scanner.nextInt();
                if (choice == 1) {
                    System.out.println(economy);
                    break;
                } else if (choice == 2) {
                    System.out.println(comfort);
                    break;
                } else if (choice == 3) {
                    System.out.println(premium);
                    break;

                } else {
                    System.out.println("Please choose 1, 2, or 3.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }
        scanner.close();
    }
}
