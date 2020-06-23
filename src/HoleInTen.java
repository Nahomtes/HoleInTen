import java.util.Scanner;

public class HoleInTen {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\tWelcome!\n");
        System.out.println("Enter Product Code: ");
        String productCode = scanner.next();
        String preDisplayMessage = "Product Code (%s) represent \"%s\" with corresponding price of: $%.2f dollars.";

        switch (productCode){
            case "BALL":
                System.out.printf(preDisplayMessage,
                        productCode, "Golf Balls (1 dozen)", 38.00);
                break;
            case "DRV01":
                System.out.printf(preDisplayMessage,
                        productCode, "Big Bertha Driver", 449.95);
                break;
            case "DRV02":
                System.out.printf(preDisplayMessage,
                        productCode, "Vaporizer Driver", 375.00);
                break;
            case "DRV03":
                System.out.printf(preDisplayMessage,
                        productCode, "Fly-Z Driver", 179.00);
                break;
            case "SET01":
                System.out.printf(preDisplayMessage,
                        productCode, "Project Manager Gold Club Set", 179.00);
                break;
            case "SET02":
                System.out.printf(preDisplayMessage,
                        productCode, "Junior VP Golf Club Set", 225.00);
                break;
            case "SET03":
                System.out.printf(preDisplayMessage,
                        productCode, "Executive Golf Club Set", 299.95);
                break;
            case "SET04":
                System.out.printf(preDisplayMessage,
                        productCode, "CEO Golf Club Set", 374.95);
                break;
            case "SET05":
                System.out.printf(preDisplayMessage,
                        productCode, "Chairman of the Board Club Set", 495.00);
                break;

            default:
                scanner.close();

                System.out.println("Thank you for visiting the Hole in Ten Golf Company");
        }
    }
}
