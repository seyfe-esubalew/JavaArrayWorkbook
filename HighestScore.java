public class HighestScore {
    public static void main(String[] args) {
        int highScore = 0;
        int highScoreIndex = 0;
        int[] scores = {14775, 48328, 7928, 27102, 21787, 21063, 38096, 42711, 32863, 23707};
        System.out.print("Here are the scores ");
        for(int i=0; i<scores.length;i++){
            System.out.print(" " +scores[i]);
            if(scores[i]>highScore){
                highScore=scores[i];
                highScoreIndex=i;
            }
        }
        System.out.println("\nThe highest score is "+highScore);
        System.out.println("It is a gentleman in seat "+highScoreIndex);
    }
}
