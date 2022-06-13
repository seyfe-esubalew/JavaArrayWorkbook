public class TDArrays {
    public static void main(String[] args) {

        int [][] ints ={{75,65,50,40},{55,78,52,63},{66,76,85,96}};

        for(int i=0; i<ints.length;i++){
            for(int j=0;j<ints[i].length;j++){
                System.out.print(ints[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
