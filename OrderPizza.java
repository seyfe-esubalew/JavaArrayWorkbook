import java.util.Scanner;

public class OrderPizza {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many pizza toppings do you want?");
        int numTopping = scan.nextInt();
        System.out.println("Great what are they?\n");
        String[] tropping = new String[numTopping];
        
        for(int i=0;i<tropping.length;i++){
            System.out.print(i+".");
            tropping[i]= scan.next();
        }
        System.out.println("Here are your troppings ");
        for(int i=0;i<tropping.length;i++){
            System.out.println(tropping[i]);
        }

        scan.close();
    }
}
