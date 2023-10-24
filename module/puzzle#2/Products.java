import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Products {

   final int gucciBagPrice    = 700;
   final int blueDressPrice   = 500;
   final int diamondRingPrice = 10_000;
   final int iphone15Price    = 7000;
   final int fancyDinnerPrice = 17_000;


    List<String> productList = new ArrayList<>(products());

    protected List<String> products() {

        return Arrays.asList("Gucci bag", "Blue dress", "Diamond ring", "Iphone 15", "Fancy Dinner");
    }

    protected void purchaseProduct (int currentBalance, int productPrice , List<String> purchasedProduct){

        if (currentBalance >= productPrice) {

            message("You purchased " + purchasedProduct);
            currentBalance -= productPrice;
            message("Current balance: " + currentBalance);

        } else {

            message("Insufficient funds for this purchase.");
        }

    }

    protected void message(String message){
        System.out.println(message);
    }

}
