public class CoffeeShop {
    public static void main(String[] args) {
        String[] aisle = {"apples","bananas","candy","chocolate","coffee","tea"};
        System.out.println("Do you sell coffee");
        for(int i=0; i<aisle.length;i++){
            if(aisle[i].equals("coffee")){
                System.out.println("We have that in aisle "+i);
                break;
            }
        }
    }
}
