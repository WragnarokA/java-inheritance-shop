package shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Carrelllo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quanti prodotti? ");
        int cartSize = Integer.parseInt(scanner.nextLine());
        Prodotto[] cart = new Prodotto[cartSize];
        for (int i = 0; i < cart.length; i++) {
            System.out.println("Inserire il prodotto " + (i + 1));
            boolean invalidChoice;

            do {
                System.out.print("Nome: ");
                String name = scanner.nextLine();
                System.out.print("Descrizione: ");
                String description = scanner.nextLine();
                System.out.print("Prezzo: ");
                String priceString = scanner.nextLine();
                System.out.print("Iva: ");
                String vatString = scanner.nextLine();


                System.out.print("Quale prodotto? 1-Smartphone, 2-Televisore, 3-Cuffie: ");
                String choice = scanner.nextLine();
                switch (choice) {
                    case "1":
                        System.out.println("Smartphone");
                        invalidChoice = false;
                        System.out.print("Codice IMEI: ");
                        String imeiCode = scanner.nextLine();
                        System.out.print("Memoria: ");
                        int memory = Integer.parseInt(scanner.nextLine());
                        Smartphone smartphone = new Smartphone(name, description, new BigDecimal(priceString), new BigDecimal(vatString), imeiCode, memory);
                        cart[i] = smartphone;
                        break;
                    case "2":
                        System.out.println("Televisore");
                        invalidChoice = false;
                        System.out.print("Dimensions: ");
                        int dimensions = Integer.parseInt(scanner.nextLine());
                        System.out.print("Smart?y/n: ");
                        boolean smart = scanner.nextLine().equalsIgnoreCase("y");
                        Television television = new Television(name, description, new BigDecimal(priceString), new BigDecimal(vatString),dimensions, smart);
                        cart[i] = television;
                        break;
                    case "3":
                        System.out.println("Cuffie");
                        invalidChoice = false;
                        System.out.print("Color: ");
                        String color = scanner.nextLine();
                        System.out.print("Wireless?y/n: ");
                        boolean wereless = scanner.nextLine().equalsIgnoreCase("y");
                        Cuffie cuffie = new Cuffie(name, description, new BigDecimal(priceString), new BigDecimal(vatString),color, wereless);
                        cart[i] = cuffie;
                        break;
                    default:
                        System.out.println("Scelta non valida");
                        invalidChoice = true;
                        break;
                }
            } while (invalidChoice );
        }
        BigDecimal total = new BigDecimal(0);
        for (Prodotto p : cart) {
            System.out.println(p.toString());
            total = total.add(p.getFullPrice());
            System.out.println("Total: " + total + "€");
        }

        scanner.close();
    }
}
