public class WinLose {
    public static void main(String[] args) {
        String[] records={"WIN", "WIN", "WIN", "LOSS", "WIN", "WIN", "LOSS"};
        int wins = 0;
        int loose = 0;

        for(int i=0; i<records.length;i++){
            if(records[i].equals("WIN")){
                wins++;
            }else{
                loose++;
            }
        }
        System.out.println("With a professional record of "+wins+" wins and "+loose+" losses.");
    }
}
