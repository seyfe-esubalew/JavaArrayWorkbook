import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {
        String[] staffLastYear = {"Ellie","Jimy","Tommy"};
        String[] staffThisYear = Arrays.copyOf(staffLastYear, staffLastYear.length);
        
        staffLastYear[1] = "seyfe";
        System.out.println(Arrays.toString(staffLastYear));
        System.out.println(Arrays.toString(staffThisYear));
    }
}
