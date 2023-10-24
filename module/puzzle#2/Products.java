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

    protected int purchaseProduct (int currentBalance, int productPrice , String purchasedProduct){

        double discount = (productPrice * 0.1);

        if (currentBalance >= productPrice) {

            message("You purchased " + purchasedProduct);
            currentBalance -= productPrice;
            message("Current balance: " + currentBalance + " kr");

            if (productPrice > 700) {

                currentBalance = (int) (productPrice - discount);
                message("\nYou get a 10% discount");

            }

        } else {

            message("Insufficient funds for this purchase.");
        }

        return currentBalance;
    }



    public List<String> getProductList() {
        return productList;
    }

    protected void message(String message){
        System.out.println(message);
    }

}
