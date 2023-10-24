import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class ShoppingMenu extends Products implements Frida {

    Scanner sc = new Scanner(System.in);

    int accountBalance = 20_000;
    int currentBalance = accountBalance;


    protected void optionMenu() {



        getOptionMenu(sc);

        buyProduct(sc, productList);

    }


    protected void getOptionMenu(Scanner sc) {

        do {

            message("Choose an option ");
            message("1. Purchase products");
            message("2. See account balance");
            message("3. See how much Frida likes you");
            message("4. Exit app");

            String option = sc.nextLine();

            switch (option) {

                case "1" -> currentBalance = buyProduct(sc, productList);

                case "2" -> message("Account balance: " + currentBalance);

                case "3" -> message(loveMeter(fridasMode, currentBalance));

                case "4" -> System.exit(0);
            }

        }while (true);
    }

    protected int buyProduct(Scanner sc, List<String> productList) {


        getOptionsProducts();
        String purchase = sc.nextLine();

        switch (purchase) {

            case "1" -> purchaseProduct(currentBalance, gucciBagPrice, Collections.singletonList(productList.get(0)));

            case "2" -> purchaseProduct(currentBalance, blueDressPrice, Collections.singletonList(productList.get(1)));

            case "3" -> purchaseProduct(currentBalance, diamondRingPrice, Collections.singletonList(productList.get(2)));

            case "4" -> purchaseProduct(currentBalance, iphone15Price, Collections.singletonList(productList.get(3)));

            case "5" -> purchaseProduct(currentBalance, fancyDinnerPrice, Collections.singletonList(productList.get(4)));

            case "6" -> getOptionMenu(sc);
        }

    return currentBalance;
    }


    protected void getOptionsProducts() {

        message("1. To buy " + productList.get(0));
        message("2. To buy " + productList.get(1));
        message("3. To buy " + productList.get(2));
        message("4. To buy " + productList.get(3));
        message("5. To buy " + productList.get(4));
        message("6. to return to main menu");


    }



    protected void message(String message){
        System.out.println(message);
    }

}
