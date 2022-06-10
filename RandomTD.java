public class RandomTD {
    public static void main(String[] args) {
        int [][] TDArr = new int[100][10];
        for(int i=0;i<TDArr.length;i++){
            for(int j=0;j<TDArr[i].length;j++){
                TDArr[i][j]=randomNumber();
            }
        }
        printArray(TDArr);
    }
    public static int randomNumber(){
        int ranNum = (int)(Math.random()*100)+1;
        return ranNum;
    }
    public static void printArray(int[][]tdArr){
        for(int i=0;i<tdArr.length;i++){
            for(int j=0;j<tdArr[i].length;j++){
                System.out.print(tdArr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
