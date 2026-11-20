public class Task1 {
    public static void main(String[] args){
        int nums[] = {1,4,8,0,-2,-7,-10,5,0,100};
        int zero = 0;
        int positive=0;
        int negative=0;
        for(int i = 0;i< nums.length;i++){
            if(nums[i]==0)
                zero+=1;
            else if(nums[i]>0)
                positive+=1;
            else if(nums[i]<0)
                negative+=1;
        }
        System.out.println("Zero nums:"+zero+"\nPositive nums:"+positive+"\nNegative nums:"+negative);
    }
}