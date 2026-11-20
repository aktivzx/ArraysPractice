import java.util.Scanner;
class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float scores[]=new float[5];
        int passed = 0;
        int failed =0;
        float scoresSum = 0;
        for(int i=0;i<scores.length;i++){
            for(;;) {
                System.out.println("Enter " + (i + 1) + " score: ");
                scores[i] = sc.nextFloat();
                if(scores[i]>100 || scores[i]<0)
                    System.out.println("Invalid score!");
                else
                    break;
            }
        }
        System.out.print("Scores: ");
        for(int i = 0;i< scores.length;i++){
            System.out.print(scores[i]+ " ");
        }
        for(int i = 0;i< scores.length;i++){
            if(scores[i]>=60)
                passed+=1;
            else
                failed+=1;
        }
        System.out.println("\nPassed: "+ passed + "\nFailed: "+ failed);
        for(int i = 0;i<scores.length;i++){
            scoresSum+=scores[i];
        }
        float average = scoresSum/scores.length;
        System.out.println("Average: "+average);
        sc.close();
    }
}
