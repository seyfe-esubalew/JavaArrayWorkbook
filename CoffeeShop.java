import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] aisle = {"apples","bananas","candy","chocolate","coffee","tea"};
        System.out.println("What can I help you find");
        String searchedItem = scan.next();
        for(int i=0; i<aisle.length;i++){
            if(aisle[i].equals(searchedItem)){
                System.out.println("We have that in aisle "+i);
                break;
            }
        }
    }
}
