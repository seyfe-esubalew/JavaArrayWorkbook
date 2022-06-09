import java.util.Arrays;

public class JavaTax {
    public static void main(String[] args) {
        double originalPrice[] = {1.99,2.99, 3.99, 4.99};
        double afterTax[] = new double[4];
        for(int i=0; i<originalPrice.length;i++){
            afterTax[i] = originalPrice[i] * 1.13;
        }
        System.out.println(Arrays.toString(afterTax));
    }
}
