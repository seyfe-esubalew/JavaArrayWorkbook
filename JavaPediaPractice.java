import java.util.Scanner;
import java.util.Arrays;
public class JavaPediaPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many historical figures will you register?");
        int figure = scan.nextInt();

        String database[][] = new String[figure][3];

        scan.nextLine();
        for(int i=0;i<database.length;i++){
            System.out.println("Figure "+(i+1));
            System.out.print("Name: ");
 
            String name = scan.nextLine();
   
            System.out.print("Date Of Birth: ");
            String dateOfBirth = scan.nextLine();
     
            System.out.print("Occupation: ");
            String ocupation = scan.nextLine(); 
           
                database[i][0]=name; 
                database[i][1]=dateOfBirth; 
                database[i][2]=ocupation;                         
        }

        printTDArray(database);

        System.out.println("Who do you want information on?");
        String searchedName = scan.next();

        for(int i=0;i<database.length;i++){
            for(int j=0;j<database[i].length;j++){
                if(searchedName.equals(database[i][j])){
                    System.out.print("Name: "+database[i][1]+"\n\t"+"Date Of Birth: "+database[i][2]+"\n\t"+"Occupation"+database[i][2]+"\n");
                    System.out.println(Arrays.toString(database[i]));
                }
            }
        }
        scan.close();
    }

    public static void printTDArray(String[][] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println("This are the values stored ");
            for(int j=0;j<arr[i].length;j++){
                System.out.print("\t"+arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
