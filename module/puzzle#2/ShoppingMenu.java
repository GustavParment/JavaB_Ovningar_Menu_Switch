import java.util.List;
import java.util.Scanner;

class ShoppingMenu extends Products implements Frida {

    Scanner sc = new Scanner(System.in);

    int accountBalance = 20_000;
    int currentBalance = accountBalance;


    protected void optionMenu() {

        do getOptionMenu(sc);while(true);

    }


    protected int getOptionMenu(Scanner sc) {

            message("\nChoose an option ");
            message("1. Purchase products");
            message("2. See account balance");
            message("3. See how much Frida likes you");
            message("4. Exit app");

            String option = sc.nextLine();

            switch (option) {

                case "1" -> buyProduct(sc);

                case "2" -> message("Account balance: " + currentBalance + " kr");

                case "3" -> message(loveMeter(fridasMode, currentBalance));

                case "4" -> System.exit(0);
            }
            return currentBalance;
        }


    protected void buyProduct(Scanner sc) {


        getOptionsProducts();
        String purchase = sc.nextLine();

        switch (purchase) {

            case "1" -> currentBalance = purchaseProduct(currentBalance,gucciBagPrice,getProductList().get(0));

            case "2" -> currentBalance = purchaseProduct(currentBalance,blueDressPrice,getProductList().get(1));

            case "3" -> currentBalance = purchaseProduct(currentBalance,diamondRingPrice,getProductList().get(2));

            case "4" -> currentBalance = purchaseProduct(currentBalance,iphone15Price,getProductList().get(3));

            case "5" -> currentBalance = purchaseProduct(currentBalance,fancyDinnerPrice,getProductList().get(4));

            case "6" -> currentBalance = getOptionMenu(sc);

        }

    }


    protected void getOptionsProducts() {

        message("1. To buy " + productList.get(0) + " 700 kr");
        message("2. To buy " + productList.get(1) + " 500 kr");
        message("3. To buy " + productList.get(2) + " 10000 kr");
        message("4. To buy " + productList.get(3) + " 7000 kr");
        message("5. To buy " + productList.get(4) + " 17000 kr");
        message("6. to return to main menu");


    }



    protected void message(String message){
        System.out.println(message);
    }

}
