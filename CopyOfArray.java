import java.util.Arrays;

public class CopyOfArray {
    public static void main(String[] args) {
        double[] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        System.out.println(Arrays.toString(printFaranite(celsius)));  
    }
    public static double[] printFaranite(double[] arr){
        double[] fah = Arrays.copyOf(arr, arr.length);
        
        for(int i=0;i<fah.length;i++){
            fah[i] = (fah[i] * 1.8)+32;
        }
        return fah;
    }
}
