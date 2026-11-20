public class Task3 {
    public static void main(String[] args){
        int nums[]={20,40,60,80,100};
        int numsSum=0;
        int above = 0;
        System.out.print("Arrays: ");
        for(int i = 0;i< nums.length;i++){
            System.out.print(nums[i]+ " ");
        }
        for(int i = 0;i<nums.length;i++){
            numsSum+=nums[i];
        }
        int average = numsSum/nums.length;
        System.out.println("\nAverage: "+ average);
        for(int i =0;i<nums.length;i++){
            if(nums[i]>average)
                above+=1;
        }
        System.out.println("Numbers above average: "+above);
    }
}
