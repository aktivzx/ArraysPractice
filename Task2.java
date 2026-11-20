public class Task2 {
    public static void main(String[] args) {
        int nums[] = {7, 3, 0, 8, 1, 3, 7, 0};
        int largest = 0;
        int smallest = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[largest] > nums[i]) {
                continue;
            } else if (nums[largest] < nums[i]) {
                largest = i;
            }
        }
        for (int i = 1; i < nums.length; i++) {
            if(nums[smallest]<nums[i])
                continue;
            else if(nums[smallest]>nums[i]){
                smallest = i;
            }
        }
        System.out.print("Arrays: ");
        for(int i = 0;i< nums.length;i++){
            System.out.print(nums[i]+ " ");
        }
        System.out.println("\nLargest: " + nums[largest] + " at index:" + largest);
        System.out.println("Smallest: "+ nums[smallest]+" at index: "+ smallest);
    }
}