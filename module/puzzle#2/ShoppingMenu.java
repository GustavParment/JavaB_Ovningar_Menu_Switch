import java.util.List;
import java.util.Scanner;

class ShoppingMenu extends Products implements Frida {

    Scanner sc = new Scanner(System.in);

    private final int accountBalance = 20_000;
    private int currentBalance = accountBalance;

    protected void optionMenu() {

        while (true) {

            getOptionMenu(sc);

            buyProduct(sc,productList,currentBalance);


            }
        }

    protected int buyProduct(Scanner sc, List<String> productList, int currentBalance) {



        getOptionsProducts();
        String purchase = sc.nextLine();

        switch (purchase) {

            case "1" -> {


                if (currentBalance >= gucciBagPrice) {

                    message("You purchased " + productList.get(0));
                    currentBalance -= gucciBagPrice;
                    message("Current balance: " + currentBalance);

                } else {

                    message("Insufficient funds for this purchase.");
                }
            }

            case "2" -> {



                if (currentBalance >= blueDressPrice) {

                    message("You purchased " + productList.get(1));
                    currentBalance -= blueDressPrice;
                    message("Current balance: " + currentBalance);

                } else {

                    message("Insufficient funds for this purchase.");
                }
            }

            case "3" -> {


                if (currentBalance >= diamondRingPrice) {

                    message("You purchased " + productList.get(2));
                    currentBalance -= diamondRingPrice;
                    message("Curremt balance: " + currentBalance);

                } else {

                    message("Insufficient funds for this purchase.");

                }
            }

            case "4" -> {


                if (currentBalance >= iphone15Price) {


                    message("You purchased " + productList.get(3));
                    currentBalance -= iphone15Price;
                    message("Current balance: " + currentBalance);


                } else {

                    message("Insufficient funds for this purchase.");
                }
            }

            case "5" -> {

                if (currentBalance >= fancyDinnerPrice) {

                    message("You purchased " + productList.get(4));
                    currentBalance -= fancyDinnerPrice;
                    message("Current balance " + currentBalance);


                } else {

                    message("Insufficient funds for this purchase.");
                }
            }
        }
        return currentBalance;
    }



    protected void getOptionMenu(Scanner sc){

        message("Choose an option ");
        message("1. Purchase products");
        message("2. See account balance");
        message("3. See how much Frida likes you");
        message("4. Exit app");

        String option = sc.nextLine();

        switch (option) {

            case "1" -> currentBalance = buyProduct(sc, productList, currentBalance);

            case "2" -> System.out.println("Account balance: " + currentBalance);

            case "3" -> System.out.println(loveMeter(fridasMode, currentBalance));

            case "4" -> System.exit(0);
        }
    }

    protected void getOptionsProducts(){

        message("1. To buy " + productList.get(0));
        message("2. To buy " + productList.get(1));
        message("3. To buy " + productList.get(2));
        message("4. To buy " + productList.get(3));
        message("5. To buy " + productList.get(4));
    }

    protected void message(String message){
        System.out.println(message);
    }





}
