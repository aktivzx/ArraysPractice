public class Task4 {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7};
        System.out.print("Original: ");
        for(int i = 0;i< nums.length;i++){
            System.out.print(nums[i]+ " ");
        }
        System.out.print("\nReversed: ");
        for(int i = (nums.length-1);i>=0;i--){
            System.out.print(nums[i]+ " ");
        }

    }
}
